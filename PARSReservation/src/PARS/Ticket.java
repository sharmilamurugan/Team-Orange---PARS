package PARS;

public class Ticket {
	
	 private int ticketNo;
	 private Flight flight;
	 private int passengerId;
	 private String confirmationCode;
	 
	 public Ticket(Flight flight, Passenger passenger){
		 this.flight = flight;
		 this.passengerId = passenger.getPassengerId();
		 this.ticketNo = ticketNo();
		 this.confirmationCode = generateConfirmation();
	 }
	 
	 /**
	  * Generates the ticket number
	  * The ticketNo is a number from 1 to 30 in order of booking
	  * @return ticket number
	  */
	 private int ticketNo(){
		 int totalSeats = flight.getTotalSeats();
		 int availableSeats = flight.getAvailableSeats();
		 return totalSeats-availableSeats;
	 }
	 
	 /**
	  * Generates confirmation code
	  * Code consists of the flight date, destination No and seat
	  * @return confirmation code
	  */
	 private String generateConfirmation(){
		 String confirmation = Integer.toString(flight.getTravelDate()) + 
				 Integer.toString(flight.getFlightNo()) + Integer.toString(ticketNo);	 
		 return confirmation;
	 }
	 
}
