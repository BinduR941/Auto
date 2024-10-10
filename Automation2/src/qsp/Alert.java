package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Alerts.html");
     driver.findElement(By.xpath("//button[contains(text(),'alert')]")).click();
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.alertIsPresent());
    org.openqa.selenium.Alert a = driver.switchTo().alert();
    String text = a.getText();
    a.accept();
    System.out.println(text);
     
	}

}
