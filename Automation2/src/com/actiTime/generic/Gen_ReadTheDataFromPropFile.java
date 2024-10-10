package com.actiTime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gen_ReadTheDataFromPropFile {
	public static String getPropertyNotepadData(String username1,String Password) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		FileInputStream fis=new FileInputStream("C:\\Users\\bindu\\Desktop\\actitime1.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(username1);
		String data2 = p.getProperty(Password);
	    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(data);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data2);
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    return "";

	   
	}
	}


