package homeassignmentweek4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	WebElement frames =	driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(frames);
	
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	Alert alert = driver.switchTo().alert();
	//alert.dismiss();
	alert.accept();
	
	//display the text
	String dispmsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(dispmsg);
	
	if(dispmsg.contains("How are you today?"))
	{
		System.out.println("Message success");
	}
	else {
		System.out.println("Message Failedd");
	}
	
	
	
	
	
	
		
		
		
	}

}
