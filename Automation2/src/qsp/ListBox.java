package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement country = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(country);
	   s.selectByVisibleText("Canada");
	   Thread.sleep(2000);
	   s.selectByVisibleText("United Kingdom");
	   Thread.sleep(2000);
	   s.selectByVisibleText("Poland");
	   Thread.sleep(2000);
	   if(s.isMultiple())
	   {
	s.deselectByVisibleText("Poland");
	 Thread.sleep(2000);
	s.deselectByVisibleText("United Kingdom");
	 Thread.sleep(2000);
	s.deselectByVisibleText("Canada");
	 Thread.sleep(2000);
	System.out.println("all the elements are deselected");
	   }
		
	}

}
