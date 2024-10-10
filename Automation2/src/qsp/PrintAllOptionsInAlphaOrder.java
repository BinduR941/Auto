package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsInAlphaOrder {
	public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
	      WebElement slv = driver.findElement(By.id("slv"));
	      Select s=new Select(slv);
	      List<WebElement> allopt = s.getOptions();
	      TreeSet<String>ts=new TreeSet<>();
	      int count=allopt.size();
	      
	    	for(int i=0;i<allopt.size();i++)
	    	{
	    		String text = allopt.get(i).getText();
	    		ts.add(text);
	    	}
	    	for(String option:ts)
	    	{
	    		System.out.println(option);
	    	}
	     
	      driver.quit();
		}

	}


