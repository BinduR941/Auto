package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosAllBrowExc_Parent {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
String pwh = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
	driver.switchTo().window(wh);
if(pwh.equals(wh)) {
	System.out.println(pwh);
}
else
{
	
	driver.close();
}
}
	}
	}


