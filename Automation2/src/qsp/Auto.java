package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) {
    
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.automationtesting.in/Alerts.html");
    driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
    driver.findElement(By.xpath("(//button[contains(text(),'display')])[2]")).click();
    driver.switchTo().alert().dismiss();
    boolean text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
    if(text==true)
    {
    	System.out.println("displayed");
    }
    else
    {
    	System.out.println("not displayed");
    }
    

	}

}
