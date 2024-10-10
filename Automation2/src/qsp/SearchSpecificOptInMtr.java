package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOptInMtr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item");
		String s=sc.nextLine();
	 WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/bindu/Desktop/FileHandling/MTRbr.html");
    driver.manage().window().maximize();
    WebElement MTR = driver.findElement(By.id("mtr"));
    Select s1=new Select(MTR);
    List<WebElement> options = s1.getOptions();
    int count=options.size();
    for(int i=0;i<options.size();i++)
    {
    	String text = options.get(i).getText();
    	if(text.equalsIgnoreCase(s))
    	{
    		count++;
    		break;
    	}
    
    }
    	if(count>0)
    	{
    	System.out.println("item is present");	
    }
    	else
    	{
    	System.out.println("item is not present");
    	}
    
	}
}