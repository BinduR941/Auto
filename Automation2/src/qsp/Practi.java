package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practi {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.get("C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
	    WebElement lib = driver.findElement(By.id("mtr"));
	    Select s=new Select(lib);
	    List<WebElement> alloptions = s.getOptions();
	    TreeSet<String>hs=new TreeSet<>();
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
	
	


