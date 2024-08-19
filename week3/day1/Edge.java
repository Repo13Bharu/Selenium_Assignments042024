package week3.day1;

public class Edge extends Safari {
//	- Define takeSnap() and clearCookies() methods in Edge class
	public void takeSnap()
	{
		System.out.println("Take Snap");
	}
	public void clearCookies()
	{
		System.out.println("Clear Cookies");
	}
	public static void main(String[] args)
	{
		Edge e=new Edge();
		e.openURl();
		e.openIncognito();
		e.fullScreenMode();
		e.readerMode();
		e.takeSnap();
		e.navigateBack();
		e.clearCookies();
		e.clearCache();
		e.closeBrowser();
	}
}
