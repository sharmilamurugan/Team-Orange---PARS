package PARS;

public class Passenger {
	
	 private int passengerId;
	 private String name;
	 private String address;
	 private int dateOfBirth;
	 private int phoneNo;
	 private CreditCard creditCard;
	 
	 public Passenger(int passengerId, String name, String address, int dateOfBirth, 
			 int phoneNo){
		 this.passengerId = passengerId;
		 this.name = name;
		 this.address = address;
		 this.dateOfBirth = dateOfBirth;
		 this.phoneNo = phoneNo;
	 }
	 
	  public int getPassengerId(){
		  return passengerId;
	  }
	  
	  public String getName(){
		  return name;
	  }
	  public String getAddress(){
		  return address;
	  }
	  
	  public int getDateOfBirth(){
		  return dateOfBirth;
	  }
	  
	  public int getPhoneNo(){
		  return phoneNo;
	  }
	  
	  public CreditCard getCreditCard(){
		  return creditCard;
	  }
	  
	  public void setCreditCard(int creditCardNo, String cardType, 
				 String nameOnCard, int expiryDate){
		  
		  this.creditCard = new CreditCard(creditCardNo, cardType, nameOnCard, expiryDate);
	  }

}
