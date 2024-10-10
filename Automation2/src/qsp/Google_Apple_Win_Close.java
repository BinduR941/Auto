package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Apple_Win_Close {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
}
}
