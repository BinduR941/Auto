package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean login=driver.findElement(By.name("login")).isEnabled();
	if(login==true)
	{
		System.out.println("Login button is enabled");
	}
	else
		System.out.println("Login button is not enabled");
	driver.close();
}
}
