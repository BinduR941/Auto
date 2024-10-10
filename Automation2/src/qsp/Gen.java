package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gen {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        int Y1=driver.findElement(By.xpath("//input[@type=\"radio\"])[1]")).getLocation().getY();
        int Y2=driver.findElement(By.xpath("//input[@type=\"radio\"])[2]")).getLocation().getY();
        int Y3=driver.findElement(By.xpath("//input[@type=\"radio\"])[3]")).getLocation().getY();
        if(Y1==Y2 && Y2==Y3)
        {
        	System.out.println("Gender radio buttons are properly alligned");
        }
        else
        {
        	System.out.println("Gender radio buttons are not properly alligned");
        }
        driver.quit();
        
	}



	}


