package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links_In_Amazon {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("Amazon");
List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
int count=alllinks.size();
for(int i=0;i<count;i++)
{
	String text = alllinks.get(i).getText();	
	System.out.println(text);
}
driver.quit();

	}

}
