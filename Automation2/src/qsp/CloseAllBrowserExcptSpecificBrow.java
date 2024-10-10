package qsp;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExcptSpecificBrow {
	public static void main(String[] args) {
System.out.println("Enter the title of the window to be closed");
Scanner sc=new Scanner(System.in);
String expectedtitle = sc.nextLine();
		
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
String pwid = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
	driver.switchTo().window(wh);
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	
	if(actualtitle.contains(expectedtitle))
			{
		driver.close();
			}
	
}
	}

}

