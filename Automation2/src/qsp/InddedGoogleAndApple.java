package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InddedGoogleAndApple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwid = driver.getWindowHandles();
		Iterator<String> i = allwid.iterator();
		String pwid=i.next();
		String applewid="";
		String googlewid="";
		while(i.hasNext())
		{
			String wid=i.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Google"))
			{
				googlewid=wid;
			}
			else if(driver.getTitle().contains("Apple"))
			{
				applewid=wid;
			}
		}
		driver.switchTo().window(googlewid);
		String text1=driver.findElement(By.xpath("//button[text()='Forgot email?']")).getText();
		System.out.println(text1);
		driver.switchTo().window(applewid);
		String text2=driver.findElement(By.id("iforgot-link")).getText();
		System.out.println(text2);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(googlewid);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(pwid);
		Thread.sleep(2000);
		driver.close();
			
		}
		
	}
