import java.util.ArrayList;
import java.util.List;
/**
 * Reservation class stores the information of each reservation
 */
public class Reservation {
    private String Id;
    private List<String> seats;
    private String errMessage;
    private int noOfPeople;

    /**
     * constructor for the class Reservation which initializes Reservation with ID and noOfPeople.
     * @param id ReservationID.
     * @param noOfPeople noOfPeople in the reservation.
     */
    public Reservation(String id, int noOfPeople){
        Id = id;
        seats = new ArrayList<>();
        errMessage = "";
        this.noOfPeople = noOfPeople;
    }

    /**
     * Method to update the seat number.
     * @param seatNo the seat number.
     */
    public void addSeat(String seatNo){
        seats.add(seatNo);
    }

    /**
     * Method to fetch the information of the reservation.
     * @return info the reservation information.
     */
    public String toString(){
        String info = Id + " ";
        if(errMessage != ""){
            info = info + errMessage;
        }
        if (!seats.isEmpty()) {
            info = info + seats.get(0);
            for(int i=1;i<seats.size();i++){
                info = info + "," + seats.get(i);
            }
        }
        return info;
    }

    /**
     * Getter method to get the ID of the reservation.
     * @return returns the ID.
     */
    public String getID(){
        return Id;
    }

    /**
     * Setter method to update the number of people encountered during duplicates.
     * @param number the new number.
     */
    public void setNoOfPeople(int number){
        noOfPeople = number;
    }

    /**
     * Getter method to get the number of people in the reservation.
     * @return returns the noOfPeople.
     */
    public int getNoOfPeople(){
        return noOfPeople;
    }

    /**
     * Setter method to update the errorMessage encountered during booking.
     * @param message the error message.
     */
    public void setErrMessage(String message){
        errMessage = message;
    }

    /**
     * Getter method to get the errorMessage encountered during booking.
     * @return returns the error message.
     */
    public String getErrMessage(){
        return errMessage;
    }

}
