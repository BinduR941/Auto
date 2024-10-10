package com.actiTime.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
@Test
public void verifyTitle(){
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String etitle = "Soogle";
	String atitle=driver.getTitle();
	System.out.println(atitle);
	SoftAssert s=new SoftAssert();
	s.assertEquals(etitle, atitle);
	driver.quit();
	s.assertAll();
	System.out.println("hi");
	
	
}
}
