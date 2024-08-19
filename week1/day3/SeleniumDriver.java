package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDriver {
	public static void main(String[] args)
	{
		 		 
		 EdgeDriver driver1= new EdgeDriver();
		 driver1.get("http://leaftaps.com/opentaps/control/main");
		 driver1.manage().window().maximize();
		 driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("inavlid@gamil.com");
		 driver1.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("inavlid#14589");
		 driver1.findElement(By.xpath("//input[contains(@class,'decor')]")).click();
		 System.out.println(driver1.getTitle());
		 driver1.close();
	}
}
