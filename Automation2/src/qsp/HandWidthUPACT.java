package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandWidthUPACT {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.name("username"));
		WebElement pw = driver.findElement(By.name("pwd"));
		int height=un.getSize().getHeight();
		int width=un.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		int height1=pw.getSize().getHeight();
		int width1=pw.getSize().getWidth();
		System.out.println(height1);
		System.out.println(width1);
		if(height==height1 && width==width1)
		{
			System.out.println("UN and PWD height and width are same");
		}
		else
		{
			System.out.println("UN and PWD height and width are not same");
			
		}
		driver.close();
	}
}