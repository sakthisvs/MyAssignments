package learnassignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnAccountSelectClass {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new  ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();		
		Thread.sleep(5000);		
		//Click on the "Accounts" tab.
		driver.findElement(By.partialLinkText("Accounts")).click();		
		//Click on the "Create Account" button
		driver.findElement(By.partialLinkText("Create Account")).click();
		//Enter an account name		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester1988");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
				
		//Select "ComputerSoftware" as the industry.
		WebElement sample = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select obj1 = new Select(sample);
		obj1.selectByIndex(2);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement sample1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select obj2 = new Select(sample1);
		obj2.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement datasource3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select obj3 = new Select(datasource3);
		obj3.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndedata
		WebElement datasource4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select obj4 = new Select(datasource4);
		obj4.selectByIndex(6);		
		
		//Select "Texas" as the state/province using SelectByValue. 
		WebElement datasource5 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select obj5 = new Select(datasource5);
		obj5.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
	//	driver.quit();

		
		
		
		
		
		
		
		
		

		
		
	}

}
