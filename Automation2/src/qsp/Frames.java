package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
	    String copy = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(copy);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		String copy1 = driver.findElement(By.xpath("//p[text()='Default Password']/../p[4]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(copy1);
	    driver.switchTo().parentFrame();
	    String copy2=driver.findElement(By.xpath("//p[text()='Admin@1234']/../p[6]")).getText();
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys(copy2);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
