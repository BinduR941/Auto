package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Execute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
        LoginPage l=new LoginPage(driver);
        l.setLogin("admin", "manager");
        driver.close();
	}

}
