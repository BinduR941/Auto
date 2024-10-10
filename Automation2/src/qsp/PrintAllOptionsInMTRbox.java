package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsInMTRbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
	WebElement slv = driver.findElement(By.id("slv"));
	Select s=new Select(slv);
	List<WebElement> alloptions = s.getOptions();
	int count=alloptions.size();
	for(int i=0;i<count;i++)
	{
		s.selectByIndex(i);
	}
	Thread.sleep(2000);
	
}
}
