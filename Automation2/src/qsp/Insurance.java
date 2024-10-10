package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insurance {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-event='change']"));
		Select s=new Select(month);
		s.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1936");
	   driver.findElement(By.xpath("//a[text()='9']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean dis = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(dis==true)
		{
			System.out.println("Error message is disaplyed and pass");
		}
		else 
		{
			System.out.println("Error message is notdisaplyed and fail");
		}
		driver.close();
	}

}
