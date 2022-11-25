package Allfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript3 {

	@Test
	public void tool() {


		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	
		WebElement username=driver.findElement(By.name("email1"));
		
		username.sendKeys("SapientTraining@gmail.com");
		
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		
		driver.findElement(By.className("submit-btn")).click();
		
	
		
		
	}

}
