# MovieTheatreSeatingChallenge
<h2>Goal</h2>
  <ul>
  <li>The prominent goal is to design and write a seating assignment program that maximizes both customer satisfaction and customer safety.</li>
  </ul>
  <ul>
  <b>Input:</b> 
  <li>Each line in the file comprises of a reservation ID, followed by a space, and then the number of seats requested.  "R001 2"</li>

  <b>Output:</b>
  <li>Each row in the file should include the reservation number followed by a space, and then a comma-delimited list of the assigned seats. "R001 I1,I2"</li>
  </ul>
  
<h2>Assumptions & Approach</h2>
<ul>
Customer Satisfaction:
Since customers are reserving seats for groups, they would prefer sitting next to each other. So the first priority will be to allocate seats for the group in a single row.
</ul>
  <li>The seats will be allotted in the order of reservations that are present in the input file.</li>
  <li>Seats will be allotted from the top row(J) for a better screen view.</li>
  <li>Seat Allocation will be done based on the customer's best viewing satisfaction and safety requirements.</li>
  <li>The maximum number of seats in a particular reservation is 20. Reservations larger than that will be taken offline and discussed with the customers.</li>
  <li>The theater cannot reserve seats for a group if the requested number of seats is greater than the available seats. In that case, the customers are  informed about the insufficient number of available seats.</li>
<li>If the same reservation ID occurs multiple times, it is read as one reservation.</li>
</ul>
<h2>Programming language used: Java</h2>
<ul>
 </ul>
<h2>Program Description</h2>
<ul>
  <p><b>Classes</b></p>
  <li>Main: This will read the input file, creates the necessary objects and calls the relevant functions.
  <li>Reservation: Stores the information of each and every reservation made as the ID, seats or errorMessge</li>
  <li>TheatreScreen: Stores the information about the Movie Theatre such as the occupancy and the seating arrangement</li>
  <li>TheatreService: Implements methods to createReservations, showReservations and storeReservations in a file.</li>
 </ul>
 <ul>
  <b>The algorithm follows the below rules:</b>
  <li>As first in first served; Customers that comes first will be allocated seats starting from the last rows.</li>
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
    <p>R003 J13,J14,J15,J16, J17</p>
    <p>Output file (path): /Users/sriharati/eclipse-workspace/Movie/output.txt</p>

</ul>
<h2>Steps to run the program</h2>
<ul>
  <li>Open Terminal and go to the path where the project is available</li>
  <li>Compile the java files. In my program it is:javac Main.java Reservation.java TheatreScreen.java TheatreService.java</li>
  <li>Run the java file. Java Main /path of the input.txt file/</li>
</ul>

