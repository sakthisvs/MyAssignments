package learnassignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.implementation.EqualsMethod;

public class DeleteLearnAssignments {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");	
		
		ChromeDriver driver = new  ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);	
		
		//Click the "crm/sfa" link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		//Thread.sleep(5000);		
		
		//Click the "Leads" link. 
		driver.findElement(By.partialLinkText("Lead")).click();
		
		//Click "Find leads." 
		//driver.findElement(By.xpath("//a[@class='selected']")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		//Enter the phone number. 
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[30]")).sendKeys("9840912402");
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		//driver.findElement(By.xpath("")).click();	
		Thread.sleep(5000);
		
		String photext=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(photext);	
		
		//Capture the lead ID of the first resulting lead.		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();	
		
		Thread.sleep(5000);
		//Click "Find leads" again.
		//driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
				
Thread.sleep(5000);		
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(photext);
		
		//Click "Find leads" button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		//Verify the presence of the message "No records to display" i
		String msgdisplay1 = driver.findElement(By.xpath("//div[text()='No records to display')]")).getText();
		System.out.println(msgdisplay1);
		
		String sample ="No records to display";
		
	if (msgdisplay1.equals(sample))
	{
		System.out.println("Account deleted Successfully");
	}
	else
	{
		System.out.println("Account Not deleted Successfully");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
