package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBrowser {
	public static void main(String[] args)
	{
		//findelement -> find the first webelement using given method.
		//returs-> first mar
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		System.out.println(d1.getTitle());
		d1.close();
		
		EdgeDriver d2= new EdgeDriver();
		d2.get("https://www.facebook.com/");
		d2.manage().window().maximize();
		d2.getTitle();
		d2.close();
				
	}

}
