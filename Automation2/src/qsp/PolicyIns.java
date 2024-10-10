package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PolicyIns {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@name=\"policynumber\"]")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler=\'selectMonth\']"));
        Select s=new Select(month);
        s.selectByVisibleText("Oct");
        WebElement year = driver.findElement(By.xpath("//select[@data-handler=\'selectYear\']"));
        Select s1=new Select(year);
        s1.selectByVisibleText("1995");
        driver.findElement(By.xpath("//a[text()='29']")).click();
        driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
        driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
         boolean text = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).isDisplayed();
        if(text==true)
        {
        	System.out.println("correct message ");
        }
        else 
        	System.out.println("wrong message");
       

 

        
	}
}