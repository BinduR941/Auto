package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement ele = driver.findElement(By.xpath("//img[@alt=\"Bajaj Pulsar N 250 UG Motorbike/Motorcycle | Brooklyn Black\"]"));
	Actions a=new Actions(driver);
	a.scrollByAmount(0, 500).perform();
	a.scrollToElement(ele).perform();
}
}
