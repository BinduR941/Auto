package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imp_CloseAllWinWithoutUsingQuit {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
      driver.findElement(By.id("login-google-button")).click();
      driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
      Set<String> allwin = driver.getWindowHandles();
      for(String win:allwin)
      {
    	  driver.switchTo().window(win);
    	  driver.close();
      }
      
	}

}
