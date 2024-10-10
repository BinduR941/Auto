package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMobandLaptop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.linkText("Drag Position")).click();
		WebElement dest1 = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
		WebElement dest2 = driver.findElement(By.xpath("//div[@class=\"drop-column min-h-[200px] bg-slate-100\"]"));
		WebElement mbsrc = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mbsrc1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement Lapsrc = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement Lapsrc2 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Actions a =new Actions(driver);
		a.dragAndDrop(Lapsrc, dest2).perform();
		Thread.sleep(1000);
		a.dragAndDrop(Lapsrc2, dest2).perform();
		Thread.sleep(1000);
		a.dragAndDrop(mbsrc, dest1).perform();
		Thread.sleep(1000);
		a.dragAndDrop(mbsrc1, dest1).perform();
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
	}

}
