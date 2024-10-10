package com.actiTime.Testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CustomerModule {
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
    @AfterTest
	
		public void closeBrowser()
		{
    	Reporter.log("closeBrowser",true);
		}
    @BeforeMethod
    public void login()
    	{
    		Reporter.log("login",true);
    	}
    @AfterMethod()
    public void logout()
    {
    Reporter.log("logout",true);
    
	}
}
