package com.actiTime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exec_GenFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		GenFile g=new GenFile();
		String url = g.getProp("URL");
		driver.get(url);
		String un = g.getProp("username");
		String pwd = g.getProp("Password");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		 
	}

	

}
