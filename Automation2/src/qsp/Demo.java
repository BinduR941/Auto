package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/bindu/Desktop/tagname.htmlqqq ");
driver.findElement(By.cssSelector("a[id='d1']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[name='n1']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[class='c1']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[href=\"https://www.jspiders.com/\"]")).click();
	}
}




