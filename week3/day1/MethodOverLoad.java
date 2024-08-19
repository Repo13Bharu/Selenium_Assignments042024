package week3.day1;

public class MethodOverLoad {
	
	public void reportStep(String msg,String status)
	{
		System.out.println("Message: "+msg);
		System.out.println("Status as: "+status);
		
	}
	public void reportStep(String msg,String status,boolean snap)
	{
		System.out.println("Message: "+msg);
		System.out.println("Status as: "+status);
		System.out.println("Indication of Screen shot: "+snap);
		
	}
	
	public static void main(String[] args)
	{
		MethodOverLoad mOverLoad= new MethodOverLoad();
		mOverLoad.reportStep("User in creating te report", "on track");
		mOverLoad.reportStep("The report steps are","Completed",true);
		
	}
}
