package com.actiTime.Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hompage_Title_Verification_UsingAssertion {
@Test
public void verifyTitle() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Login ")).click();
}
}
