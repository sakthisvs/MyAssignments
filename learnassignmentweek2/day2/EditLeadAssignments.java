package learnassignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignments {

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
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		//Thread.sleep(5000);		
		driver.findElement(By.partialLinkText("Lead")).click();
		driver.findElement(By.partialLinkText("Create")).click();		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sakthivel Balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("sample");		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestDepartment");		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeafDescription");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sakthisvs@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+91 0 9840912402");		
		WebElement stpr1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));		
		Select sel1 =new Select(stpr1);	
		sel1.selectByVisibleText("New York");		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("(//a[@class ='subMenuButton'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updated importantNote");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();				
		String Title = driver.getTitle();
		System.out.println(Title);		
	    driver.close();

	}

}
