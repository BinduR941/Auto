package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePrintallHeadinginChilwindandclosePWthenCWIN {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
		driver.findElement(By.xpath("(//div[@class=\"popup_menu_label\"])[3]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
	    Set<String> allwin = driver.getWindowHandles();
	    List<String>wins=new ArrayList<>(allwin);
	    String pwid = wins.get(0);
	    String cwid = wins.get(1);
	    driver.switchTo().window(cwid);
	     List<WebElement> allheadings = driver.findElements(By.tagName("h2"));
	    for(int i=0;i<allheadings.size();i++ )
	    {
	    	String headings = allheadings.get(i).getText();
	    	System.out.println(headings);
	    }
	    driver.switchTo().window(pwid);
	    driver.close();
	    Thread.sleep(2000);
	    driver.switchTo().window(cwid);
	    Thread.sleep(2000);
	    driver.close();
		
			
		}
				
	}


