package learnassignmentweek2.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadAssignments {

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
		
		driver.findElement(By.partialLinkText("Lead")).click();
		driver.findElement(By.partialLinkText("Create")).click();		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sakthivel Balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("sample");
		driver.findElement(By.className("smallSubmit")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.close();
		
		
		
		

	}

}
