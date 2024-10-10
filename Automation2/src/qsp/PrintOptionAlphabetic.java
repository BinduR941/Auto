package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionAlphabetic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
		 WebElement mtrlist = driver.findElement(By.id("mtr"));
       Select s=new Select(mtrlist);
       List<WebElement> allop = s.getOptions();
      
       int count=allop.size();
       for(int i=0;i<=count;i++)
       {
    	   String text = allop.get(i).getText();
    	   System.out.println(text);
       }
       
       driver.quit();
	}

}
