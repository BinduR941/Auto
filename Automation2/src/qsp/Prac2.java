package qsp;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
		WebElement slv = driver.findElement(By.id("mtr"));
		Select s=new Select(slv);
		List<WebElement> alloptions = s.getOptions();
		HashSet<String> ts=new HashSet();
		int count=alloptions.size();
		for(int i=0;i<count;i++)
		{
			String text = alloptions.get(i).getText();
			 ts.add(text);
		}
		for(String alphaorder:ts)
		{
			System.out.println(alphaorder);
		}
		
   driver.close();

		
			
		}
		
	}
