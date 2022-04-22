# MovieTheatreSeatingChallenge
<h2>Question</h2>
  <ul>
  <li>A movie theatre that has a seating arrangement of 10rows*20SeatsPerRow.Design and write a seating assignment program that maximize both customer satisfaction and customer safety.</li>
  </ul>
  <ul>
  <b>Input:</b> 
  <li>A file in which each line comprises of of a reservation ID, followed by a space, and then the number of seats requested.</li>
  <li>A line in the input file will be in the form of R001 2</li>
  <b>Output:</b>
  <li>Each row in the file should include the reservation number followed by a space, and then a comma-delimited list of the assigned seats.</li>
  <li>Example: R001 I1,I2</li>
  </ul>
  
<h2>Assumptions</h2>
<ul>
  <li>The seats will be allotted in the order in which reservations are present in the input file.</li>
  <li>Seats will be allotted from the top row(J) for a better view</li>
  <li>Seat Allocation will be done based on the customer's safety requirements</li>
  <li>The maximum number of seats in a particular reservation is 20. Reservations larger than that will be taken offline and discussed with the customers.</li>
  <li>If the same reservation ID occurs multiple times, it is read as one reservation.</li>
  <li>The theater cannot reserve seats for a group if the requested number of seats is greater than the available seats. In that case, the customers are  informed about the insufficient number of available seats.</li>
 </ul>
<h2>Program Description</h2>
<ul>
  <p><b>Classes</b></p>
  <li>Main: Will read the input file, creates the necessary objects and calls the relevant functions.
  <li>Reservation: Stores the information of each reservation such as the ID, seats or errorMessge if any</li>
  <li>TheatreScreen: Stores the information about the Movie Theatre such as the occupancy and the seating arrangement</li>
  <li>TheatreService: Implements methods to createreservations, showReservations and storeReservations in a file.</li>
 </ul>
 <ul>
  <b>The algorithm follows following rules:</b>
  <li>Customers that come first will be allocated seats starting from the last rows.</li>
  <li>After every reservation there will be a buffer of 3 seats and seats will be assigned only for the alternate rows</li>
  <li>If the numbers of requested seats are not available in the theater then, inform the customer about insufficient seats.</li>
  </ul>
  <ul>
  <b>Output</b>
  <li>Prints the reservation ID and the seat alloted to each reservation in the order in which the reservations were recieved.</li>
  <li>In case the reservation was not accepted, the ID of the reservation and the reason for not accepted it will be printed.</li>
  <li>The directory and the filename of the output will also be printed.</li>
  <li>Output for one of my Test Case:
    <p>R001 J1,J2</p>
    <p>R002 J6,J7,J8,J9</p>
    <p>R003 J13,J14,J15,J16</p>
    <p>Output file (path): /Users/sreepriyanka/Downloads/MovieTheatreBooking-main/output.txt</p>

</ul>
<h2>Steps to run</h2>
<ul>
  <li>Open Terminal and go to the path where your project is available</li>
  <li>Compile the java files. In my program it is:javac Main.java Reservation.java TheatreScreen.java TheatreService.java</li>
  <li>Run the java file. Java Main /path of the input.txt file/</li>
</ul>
