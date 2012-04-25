package PARS;

public class Flight {

	  private int flightNo;
	  private String departureCity;
	  private String destinationCity;
	  private int travelDate;
	  private int availableSeats;
	  private static final int totalSeats = 30;
	  private static final int ticketCost = 150;
	  
	  public Flight(String departureCity, int travelDate){
		  this.departureCity = departureCity;
		  this.destinationCity = setDestinationCity();
		  this.travelDate = travelDate;
		  this.availableSeats = 30;
		  this.flightNo = setFlightNo();
	  }
	  
	  public int getFlightNo(){
		  return flightNo;
	  }
	  
	  public String getdepartureCity(){
		  return departureCity;
	  }
	  
	  public String getdestinationCity(){
		  return destinationCity;
	  }
	 
	  public int getTravelDate(){
		  return travelDate;
	  }
	  
	  public int getTotalSeats(){
		  return totalSeats;
	  }
	  
	  public int getAvailableSeats(){
		  return availableSeats;
	  }
	  
	  public int getTicketCost(){
		  return ticketCost;
	  }	  
	  
	  private String setDestinationCity(){
		  if(this.departureCity.equals("SJC")){
			  return "LAS";
		  }
		  else{
			  return "SJC";
		  }
	  }
	  
	  public void decreaseAvailableSeats(){
		  availableSeats--;
	  }
	  
	  private int setFlightNo(){
		  if(this.destinationCity.equals("LAS")){
			  return 1;
		  }
		  else{
			  return 2;
		  }
	  }
	  
}
