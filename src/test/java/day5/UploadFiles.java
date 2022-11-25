package day5;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFiles {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");

		//driver.findElement(By.id("file-upload")).click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();

		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\shaali13\\Desktop\\FileUpload.exe");

		//Runtime.getRuntime().exec("C:\\Users\\shaali13\\Desktop\\uploadFile.exe");
		
		driver.findElement(By.id("file-submit")).click();

	}

}
