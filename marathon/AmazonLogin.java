package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class AmazonLogin 
{

	 public static void main(String[] args)
	 {
		 ChromeDriver driver = new  ChromeDriver();
		 driver.get("https://www.amazon.in/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys");
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();	 
		 
String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
System.out.println(text);

driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
//driver.findElement(By.id("a-autoid-188-announce")).sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();


//WebElement sample = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
//Select obj1 = new Select(sample);
//obj1.selectByVisibleText("Newest Arrivals");

		 
		 
		 
		 
	}
	
	
	

}
