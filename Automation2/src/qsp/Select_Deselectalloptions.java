package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselectalloptions {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
    WebElement slv = driver.findElement(By.id("slv"));
    Select s=new Select(slv);
    List<WebElement> options = s.getOptions();
    int count=options.size();
    for(int i=0;i<count;i++)//To select the options
    {
    	String text = options.get(i).getText();
    	Thread.sleep(500);
    	s.selectByIndex(i);
    }
    for(int i=count-1;i>=0;i--)//To deselect the options
    {
    	Thread.sleep(500);
    	s.deselectByIndex(i);
    }
	}
	

}
