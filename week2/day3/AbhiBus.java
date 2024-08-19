package week2.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(null)
	}
	
}
