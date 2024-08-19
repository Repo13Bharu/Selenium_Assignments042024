package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinElement {
	public static void main(String[] args)
	{
		
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//input[@name='email']")).sendKeys("testleaf.2023@gmail.com");
		d1.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]")).sendKeys("Tuna@321");
		d1.findElement(By.xpath("//button[@name='login']")).click();
		
		d1.findElement(By.xpath("//a[contains(text(),'Find your account')]")).click();
		System.out.println(d1.getCurrentUrl());
		System.out.println(d1.getTitle());
//		d1.close();
	}
}
