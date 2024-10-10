package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect_Canada_Poland {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    driver.findElement(By.xpath("//section[contains(text(),'Drop')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Multi Select")).click();
    WebElement country = driver.findElement(By.id("select-multiple-native"));
   Select s=new Select(country);
   Thread.sleep(2000);
   s.selectByVisibleText("Canada");
   s.selectByVisibleText("Germany");
   s.selectByVisibleText("Poland");
   if(s.isMultiple()==true)
   {
	   s.deselectByVisibleText("Canada");
	   s.deselectByVisibleText("Germany");
	   s.deselectByVisibleText("Poland");
	   System.out.println("All the elements are deselected");
   }
   
	}

}
