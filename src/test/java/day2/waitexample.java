package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("shahzaib");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		 driver.findElement(By.xpath("//input[@value='Show me]")).click();
		 
		 
		 WebElement e=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='passnew']"))));
		 e.sendKeys("shah@123");
		
		driver.quit();
		
		
		

	}

}
