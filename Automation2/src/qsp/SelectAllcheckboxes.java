package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllcheckboxes {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui?");
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	List<WebElement> check = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(int i=0;i<check.size();i++)
	{
		check.get(i).click();
	}
	
}
}
