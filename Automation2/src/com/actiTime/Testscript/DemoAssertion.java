package com.actiTime.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
@Test
public void verifyTitle()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "soogle";
	String actualtitle = driver.getTitle();
	if(actualtitle.equals(eTitle))
	{
		Reporter.log("Title is matching and pass",true);
	}
	else
	{
		Reporter.log("Title is not matching and pass",true);
	}
	driver.quit();
	
}
}
