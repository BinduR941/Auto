package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_PrintwithoutDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
	driver.manage().window().maximize();
	WebElement slv = driver.findElement(By.id("mtr"));
	Select s=new Select(slv);
	List<WebElement> options = s.getOptions();
	HashSet <String>hs=new HashSet<>();
	int count=options.size();
	for(int i=0;i<options.size();i++)
	{
		String text = options.get(i).getText();
		hs.add(text);
	}
	for(String option:hs)
	{
		System.out.println(option);
	}
	driver.quit();
}
}
