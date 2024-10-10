package com.actiTime.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Act_Expected_Res_without_Using_ifelse {
@Test
public void verifyTitle()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle="Soogle";
	String aTitle=driver.getTitle();
	Assert.assertEquals(eTitle, aTitle);
	driver.quit();
}
}
