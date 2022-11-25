package Allfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript2 {

	@Test
	public void tool() {

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	
		driver.quit();
		/*
		WebElement username=driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		String url=driver.getCurrentUrl();
		
		if(url.contains("dashboard"))
		{
			System.out.println("Login done");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		*/
		
	}

}
