package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Policy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("456");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s=new Select(month);
		s.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1995");
		driver.findElement(By.xpath("//a[text()='15']")).click();
		driver.findElement(By.xpath("//input[@name=\"alternative_number\"]")).sendKeys("9845098450");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		boolean text = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).isDisplayed();
		if(text==true)
	
			System.out.println("error message displayed and pass");
		
		else
		
			System.out.println("error message not dispalyed and fail");
		


		//driver.findElement(By.xpath("//a[text()='9']")).click();
		
		
		
}
}
