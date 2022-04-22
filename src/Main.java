import java.io.*;
import java.util.*;
public class Main {
	
    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        List<Reservation> reservations = store_input(inputFile);
        TheatreScreen theatreScreen = new TheatreScreen(10, 20, 3, 1);
        TheatreService service = new TheatreService();
        for(Reservation r: reservations){
            service.bookSeats(theatreScreen, r);
        }
        showReservation(reservations);
        String outputPath = storeReservation(reservations, "output.txt");
        System.out.println(outputPath);
        
    }
     /**
     * It reads the input from the file and writes it into a reservations list
     */
    public static List<Reservation> store_input(String fileName) throws IOException {
        List<Reservation> reservations = new ArrayList<>();
        List<String> reservationIds = new ArrayList<>(); // To store the IDs of the reservations
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String inputText;
            while ((inputText = br.readLine()) != null) {
                String[] splitText = inputText.split(" ");
                // If duplicate ID is encountered
                if (reservationIds.contains(splitText[0])) {
                    for(Reservation r: reservations){
                        // Update the number of people by taking sum
                        if(r.getID().equals(splitText[0])){
                            r.setNoOfPeople(r.getNoOfPeople() + Integer.parseInt(splitText[1]));
                        }
                    }
                } else {
                    reservationIds.add(splitText[0]);
                    Reservation newReservation = new Reservation(splitText[0], Integer.parseInt(splitText[1]));
                    reservations.add(newReservation);
                }
            }
        }
        return reservations;
    }

    /**
     * It prints out the reservations from a List of reservations
     * @param reservations List that has the reservations
     */
    public static void showReservation(List<Reservation> reservations){
        for(Reservation reservation: reservations){
            System.out.println(reservation.toString());
        }
    }

    /**
     * It writes all the reservations in array to an output file
     * @param reservations List that has the reservations
     * @param fileName name of the output file
     */
    public static String storeReservation(List<Reservation> reservations, String fileName) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Reservation reservation : reservations) {
                writer.write(reservation.toString() + "\n");
            }
            return new String("Output file (path): " + System.getProperty("user.dir") + "/" + fileName);
        }
    }

    
}
