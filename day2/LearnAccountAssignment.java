package learnassignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAccountAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester1987");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.quit();

	}

}
