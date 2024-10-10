package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doble_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(4000);
		WebElement click = driver.findElement(By.xpath("//div[@class=\"zoom-button \"]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);

		a.clickAndHold(click).perform();
        
	}

}
