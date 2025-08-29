package learnassignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssign {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		
				
		 //Click on the Create new account button. 
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			
		 //Enter the First name. 
			driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("sakthivel balaji ");
			
		 //Enter the Surname. 
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("s");
		
		 //Handle all three dropdowns in Date of birth
			//starts with zero
		    WebElement Days1 = driver.findElement(By.xpath("//select[@id='day']"));
		    Select obj1 =new Select(Days1);
		    obj1.selectByIndex(13);
		    
		    WebElement Days2 = driver.findElement(By.xpath("//select[@id='month']"));
		    Select obj2 = new Select(Days2);
		    obj2.selectByValue("4");
		    
		    WebElement Days3 = driver.findElement(By.xpath("//select[@id='year']"));
		    Select obj3 = new Select(Days3);
		    obj3.selectByVisibleText("1989");   		    
		
		    //Select the radio button in Gender.
		    driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();	
		    
		  //Enter the Mobile number or email address. 		    
		    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("9840912402");
		    
		  //Enter the New password. 
		    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[7]")).sendKeys("sakthi007");
		
		    driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']")).click();
		    Thread.sleep(5000);
		
		    String title1 = driver.getTitle();
		    System.out.println(title1);
		

	}

}
