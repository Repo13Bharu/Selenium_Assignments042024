package week3.day2.Collection1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList1 {
	public static void main(String[] args)
	{
//		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> mobiles=driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<Integer>();
		for (WebElement each : mobiles) {
			String text = each.getText();
			System.out.println(text);
			String replaveALL= text.replaceAll(",", "");
			int ActPrice= Integer.parseInt(replaveALL);
			list.add(ActPrice);
		}
		System.out.println(list);
	}
}
