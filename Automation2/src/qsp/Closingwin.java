package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingwin {
	public static void main(String[] args) {
		System.out.println("enter the title to be closed");
		Scanner sc=new Scanner(System.in);
		String actualtitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
	Iterator<String> itr = allwh.iterator();
	while(itr.hasNext())
	{
		
		String i = itr.next();
		
		String title = driver.getTitle();
		if(title.contains(actualtitle))
		{
			
		}
		else 
		{
			driver.close();
		}
	}
	}

}
