package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalloptionsWithoutDuplicatesInmtr {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
    WebElement lib = driver.findElement(By.id("mtr"));
    Select s=new Select(lib);
    List<WebElement> alloptions = s.getOptions();
    HashSet<String>hs=new HashSet<>();
    for(int i=0;i<alloptions.size();i++)
    {
    	String text=alloptions.get(i).getText();
    	hs.add(text);
    }
    for(String s1:hs)
    {
    	System.out.println(s1);
    }
    	
    }

}