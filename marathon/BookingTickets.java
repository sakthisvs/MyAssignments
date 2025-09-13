package marathon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BookingTickets 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("guest");		
		ChromeDriver driver = new  ChromeDriver(opt);	
		driver.get("https://www.pvrcinemas.com/");	
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		//driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();	
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='MADHARAASI'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='10:30 PM'])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(@class,'p-button-label p-c')])[5]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:13']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Thread.sleep(5000);
		WebElement obj = driver.findElement(By.xpath("//div[@class='ticket-value']"));
        String obj1 = obj.getText();
        System.out.println(obj1);      
        WebElement obj2 = driver.findElement(By.xpath("//div[@class='seat-number']"));
        String obj3 = obj2.getText();
        System.out.println(obj3);
        WebElement obj4 = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']"));
        String obj5 = obj4.getText();
        System.out.println(obj5);
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        //Thread.sleep(5000);
        driver.findElement(By.xpath("(//span//i[@class='pi pi-times'])[2]")).click();
        String new1 = driver.getTitle();
        System.out.println(new1);
        driver.close();			
		
	}

}
