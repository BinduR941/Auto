package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs1asgn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class=\"popup_menu_label\"])[3]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		Set<String> allwid = driver.getWindowHandles();
	 List<String> allwidinlist=new ArrayList<>(allwid);
	 String pwid = allwidinlist.get(0);
	 Thread.sleep(2000);
	 String cwid = allwidinlist.get(1);
	 driver.switchTo().window(cwid);
	 Thread.sleep(2000);
	 List<WebElement> allheadings = driver.findElements(By.tagName("h2"));
	 System.out.println(allheadings.size());
	 for(int i=1;i<allheadings.size();i++)
	 {
		 String heading = allheadings.get(i).getText();
		 System.out.println(heading);
	 }
	 Thread.sleep(2000);
	 driver.switchTo().window(pwid);
	 driver.close();
	 Thread.sleep(2000);
	 driver.switchTo().window(cwid);
	 driver.close();
	 
	 }
	 
	}


