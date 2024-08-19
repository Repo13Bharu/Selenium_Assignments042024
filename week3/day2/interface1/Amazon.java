package week3.day2.interface1;

public class Amazon extends CanaraBank{
	
public void cashOnDelivery() {
	System.out.println("Interface Methods-Cash on Delivery");
}

public void upiPayments() {
	System.out.println("Interface Methods-UPI payment");
	
}

public void cardPayments() {
	System.out.println("Interface Methods-Card Payment is in progress");	
}

public void internetBanking() {
	System.out.println("Interface Methods-Interner Banking is not in use");
}
public static void main(String[] args)
{
	Amazon am=new Amazon();
	am.cardPayments();
	am.cashOnDelivery();
	am.internetBanking();
	am.upiPayments();
	System.out.println(am.recordPaymentDetails());
}

}