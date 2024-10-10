package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class PrintTitleOfAllBrowsersInIndeedGA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(7000);
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			driver.close();
			//String title=driver.getTitle();
			//System.out.println(title);
		}
		//driver.quit();
	}

}
