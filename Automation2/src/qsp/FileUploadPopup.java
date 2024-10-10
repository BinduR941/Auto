package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\bindu\\Desktop\\FileHandling\\file.html");
		File f=new File("./Data/Resume.docx");
		String abspath=f.getAbsolutePath();
		driver.findElement(By.id("file upload")).sendKeys(abspath);
		

	}

}
