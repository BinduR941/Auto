package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Only_DuplicatesinMtr {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
WebElement mtr = driver.findElement(By.id("mtr"));
Select s=new Select(mtr);
List<WebElement> allopt = s.getOptions();
int count=allopt.size();
HashSet<String> hs=new HashSet<>();
for(int i=0;i<count;i++)
{
	String text = allopt.get(i).getText();
	if(hs.add(text))
	{
		
	}
	else 
	{
		System.out.println(text);
	}
}

	}

}
