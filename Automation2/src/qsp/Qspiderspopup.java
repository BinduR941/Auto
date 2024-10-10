package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qspiderspopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bindugowda741@gmail.com");
		Thread.sleep(3000);
	WebElement productlist = driver.findElement(By.xpath("//select[@name]"));
	Select s=new Select(productlist);
	s.selectByVisibleText("Laptop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@class]")).sendKeys("Hidden divison popup");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();

	
	
		

		
		

}
}