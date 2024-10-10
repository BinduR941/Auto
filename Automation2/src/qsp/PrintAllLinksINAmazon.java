package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksINAmazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Amazon");
	Thread.sleep(2000);
    List<WebElement> alllinks = driver.findElements(By.xpath("//span[contains(text(),'amazon')]"));
    int count=alllinks.size();
    for(int i=0;i<count;i++)
    {
    	String text = alllinks.get(i).getText();
    	System.out.println(text);
    alllinks.get(count-1).click();
    	
    	
    }
    
}
}
