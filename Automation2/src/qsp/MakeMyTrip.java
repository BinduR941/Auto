package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
    driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
    driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).click();
    driver.findElement(By.xpath("//label[@for=\"toCity\"]")).click();
    driver.findElement(By.xpath("//p[contains(text(),'Goa')]")).click();
    driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@aria-label=\"Thu Sep 05 2024\"]")).click();Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"fareCardItem \"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Search']")).click();
    Thread.sleep(3000);
    driver.close();
	}

}
