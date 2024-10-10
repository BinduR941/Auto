package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOBINFBafterclickingCreateac {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.linkText("Create new account")).click();
   Thread.sleep(2000);
   WebElement date = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
   Select s=new Select(date);
   s.selectByVisibleText("29");
   WebElement month = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
   Select s1=new Select(month);
   s1.selectByVisibleText("Oct");
   WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
   Select s2=new Select(year);
   s2.selectByVisibleText("1995");
   
  driver.close();
	}

}
