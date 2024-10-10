package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAcrions_RightClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.linkText("Right Click")).click();
	WebElement rightclick = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.contextClick(rightclick).perform();
    driver.findElement(By.xpath("//div[text()='Yes']")).click();
    boolean message = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
    if(message==true)
    {
    	System.out.println("You selected Yes is displayed and pass");
    }
    else 
    {
    	System.out.println("You selected Yes is not displayed and fail");
    }
    driver.close();
	
}
}
