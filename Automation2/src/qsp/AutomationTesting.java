package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("(//a[contains(text(),'OK')])[2]")).click();
driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
 driver.switchTo().alert().dismiss();
 boolean text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
if(text==true)
{
	System.out.println("displayed and pass");
}
else 
{
	System.out.println("not displayed and fail");
}
driver.close();
	}

}
