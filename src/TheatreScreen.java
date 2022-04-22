/**
 * TheatreScreen class Initializes the screen arrangement and stores its information.
 */
public class TheatreScreen {
    private int[][] seatingArrangement;
    public int maxCapacity;
    private int currCapacity;
    private int seatBuffer;
    private int rowBuffer;

    /**
     * constructor for the class TheatreScreen which initializes screen with maximum capacity.
     */
    public TheatreScreen(int noOfRows,int seatsPerRow, int seatBuffer, int rowBuffer){
        maxCapacity = (noOfRows * seatsPerRow) / 2;
        currCapacity = 0;
        this.seatBuffer = seatBuffer;
        this.rowBuffer = rowBuffer;
        initializeSeating(noOfRows, seatsPerRow);
    }

    /**
     * It intializes the seating arrangement for the screen.
     */
    public void initializeSeating(int noOfRows, int seatsPerRow){
        seatingArrangement = new int[noOfRows][seatsPerRow];
        for(int i=1;i<seatingArrangement.length;i++){
            seatingArrangement[i][0] = -1;
            i = i + rowBuffer;
        }
    }

    /**
     * Getter method to check the current occupancy of the screen.
     * @return returns the current occupancy of the theatre.
     */
    public int getOccupancy(){
        return currCapacity;
    }

    /**
     * Setter method to update the current occupancy of the screen.
     * @param noOfPeople  no of people in the screen.
     */
    public void setOccupancy(int noOfPeople){
        currCapacity = noOfPeople;
    }

    /**
     * Getter method to check the screens seating arrangement.
     * @return returns the screens seating arrangement
     */
    public int[][] getSeatingArrangement(){
        return seatingArrangement;
    }

    /**
     * Setter method to update the current Seating Arrangement of the screen.
     * @param newArrangement  Seating Arrangement in the screen.
     */
    public void setSeatingArrangement(int[][] newArrangement){
        seatingArrangement = newArrangement;
    }

    /**
     * Getter method to check the gap between bookings in a row.
     * @return returns gap between bookings in a row.
     */
    public int getSeatBuffer(){
        return seatBuffer;
    }

    /**
     * Setter method to update the Gap between the bookings.
     * @param gap gap between two bookings in a row.
     */
    public void setSeatBuffer(int gap){
        seatBuffer = gap;
    }
}
