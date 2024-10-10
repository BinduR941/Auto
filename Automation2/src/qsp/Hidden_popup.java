package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_popup {
	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abc@gmail.com");
			WebElement s = driver.findElement(By.xpath("//select[@name]"));
			Select s1=new Select(s);
			s1.selectByVisibleText("Laptop");
		    driver.findElement(By.xpath("//textarea[@class]")).sendKeys("Hidden division popup");
		    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		    driver.close();
		}
	}
	


