package PARS;

public class ReservationSystem {
	
	 private void addFlight(Flight flight){
		 //FlightNo, Time, Seats, DepCity, ArrivalCity, TicketCost
	 }
	 
	 private boolean checkAvailability(Flight flight){
		return (flight.getTotalSeats()-flight.getAvailableSeats() > 0);
		 // Date, DepCity, ArrivalCity, PassengerCount
	 }
	 
	 private void addPassenger(Passenger passenger){
		//Id, Name, CreditCardNumber, ÊPhoneNumber, Address, ...
	 }
	
     private Ticket bookTicket(Passenger passenger, Flight flight){
    	 flight.decreaseAvailableSeats();
    	 Ticket ticket = new Ticket(flight, passenger);
    	 return ticket;
     }
     
     private WeeklyRevenue createReport(Flight flight){
    	 //FlightNo, PassengerCount, TicketCost, Days
     }
     
     public static void main(String[] args){
    	 
     }
}
