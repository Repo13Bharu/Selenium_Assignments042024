package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

public class CreateAccount {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decor')]")).click();
			
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Random");
		
		driver.findElement(By.xpath("(//input[contains(@id,'Name')])[2]")).sendKeys("Bharathy");
		
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("A");
		
		driver.findElement(By.id("//textarea[@id='ext-gen602']")).sendKeys("Selenium Automation Tester.");
		
		driver.findElement(By.id("//select[@id='ext-gen620']")).sendKeys("ComputerSoftware");
				
		
		WebElement Source = driver.findElement(By.id("//select[@id='dataSourceId"));
		Select s=new Select(Source);
		s.selectByValue("Employee");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
//		Enter a username and password.
//		- Click the "Login" button.
//		- Click on the "CRM/SFA" link.
//		- Click on the "Accounts" tab.
//		- Click on the "Create Account" button.
//		- Enter an account name.
//		- Enter a description as "Selenium Automation Tester."
//		- Select "ComputerSoftware" as the industry.
//		- Select "S-Corporation" as ownership using SelectByVisibleText.
//		- Select "Employee" as the source using SelectByValue.
//		- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
//		- Select "Texas" as the state/province using SelectByValue.
//		- Click the "Create Account" button.
//		- Verify that the account name is displayed correctly.
//		- Close the browser window.
		
	}

}
