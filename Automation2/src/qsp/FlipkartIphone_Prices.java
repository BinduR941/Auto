package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone_Prices {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Apple iPhone 15 Pro");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 15 Pro')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),\"₹1\")]"));
		for(int i=0;i<name.size();i++)
		{
			String Mbname = name.get(i).getText();
			System.out.println(Mbname+":");
			String Mbprice = price.get(i).getText();
			System.out.println(Mbprice+":");
		}
		driver.close();
	}
}


