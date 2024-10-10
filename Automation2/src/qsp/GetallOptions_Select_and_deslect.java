package qsp;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetallOptions_Select_and_deslect {
	

		public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		for(int i=0;i<count;i++)
		{
			String options = alloptions.get(i).getText();
			System.out.println(options);
			s.selectByIndex(i);
			
		}
		Thread.sleep(2000);
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}

		}
		
		}
		

