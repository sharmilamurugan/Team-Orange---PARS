package PARS;

public class CreditCard {

	 private int creditCardNo;
	 private String cardType;
	 private String nameOnCard;
	 private int expiryDate;
	 
	 public CreditCard(int creditCardNo, String cardType, 
			 String nameOnCard, int expiryDate){
		 this.creditCardNo = creditCardNo;
		 this.cardType = cardType;
		 this.nameOnCard = nameOnCard;
		 this.expiryDate = expiryDate;
	 }
}
