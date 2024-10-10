package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYAxisOfLogFb {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	int X = driver.findElement(By.name("login")).getLocation().getX();
	System.out.println(X);
	int Y=driver.findElement(By.name("login")).getLocation().getY();
	System.out.println(Y);
	driver.close();
	
	
}
}
