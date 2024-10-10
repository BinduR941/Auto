package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Click {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		boolean login = driver.findElement(By.id("loginbutton")).isEnabled();
		if(login==true)
		{
			System.out.println("login button is enabled and pass");
		}
		else
		{
			System.out.println("login button is not enabled and fail");
		}
		driver.quit();
		
		
		
	}

}
