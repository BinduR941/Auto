package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwid = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> allwid = driver.getWindowHandles();
				Iterator<String> wid= allwid.iterator();
				String Applewid="";
				String Googlewid="";
		while(wid.hasNext())
		{
			String window=wid.next();
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Google"))
			{
				Googlewid=window;
			
				
			}
			else if(driver.getTitle().contains("Apple"));
			{
				 Applewid=window;
			}
			driver.switchTo().window(Applewid);
			String text = driver.findElement(By.id("iforgot-link")).getText();
			System.out.println(text);
			//String Text = driver.findElement(By.xpath("//input[@type='email']/../../../../../..//button[text()]")).getText();
			//System.out.println(Text);
		}
	}

}
