package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler=\'selectMonth\']"));
	Select s=new Select(month);
	s.selectByValue("9");
	WebElement Year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
	Select s1=new Select(Year);
	s1.selectByValue("1995");
	driver.findElement(By.xpath("//a[text()='29']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	boolean text = driver.findElement(By.xpath("//span[text()=\"Please enter valid Policy No.\"]")).isDisplayed();
	if(text==true)
	{
		System.out.println("Please enter valid Policy No.is displayed and pass");
	}
	else
	{
		System.out.println("Please enter valid Policy No.is not displayed and pass");
	}
	}
}