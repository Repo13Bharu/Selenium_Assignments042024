package week2.ass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateACCT {
//	Enter a username and password.
//	- Click the "Login" button.
//	- Click on the "CRM/SFA" link.
//	- Click on the "Accounts" tab.
//	- Click on the "Create Account" button.
//	- Enter an account name.
//	- Enter a description as "Selenium Automation Tester."
//	- Select "ComputerSoftware" as the industry.
//	- Select "S-Corporation" as ownership using SelectByVisibleText.
//	- Select "Employee" as the source using SelectByValue.
//	- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
//	- Select "Texas" as the state/province using SelectByValue.
//	- Click the "Create Account" button.
//	- Verify that the account name is displayed correctly.
//	- Close the browser window.
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Bharathy");
		
		WebElement industryEnumId = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industry = new Select(industryEnumId);
		industry.selectByValue("ComputerSoftware");
		
		WebElement ownershipEnumId = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownership= new Select(ownershipEnumId);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source= new Select(findElement);
		source.selectByValue("Employee");
		
		WebElement marketingCampaignId = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketting= new Select(marketingCampaignId);
		marketting.selectByIndex(6);
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement generalStateProvinceGeoId = driver.findElement(By.xpath("//select[contains(@id,'State')]"));
		Select state=new Select(generalStateProvinceGeoId);
		state.selectByValue("Texas");
		
		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
		
		
	}
}
