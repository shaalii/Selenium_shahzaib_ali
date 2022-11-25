package Allfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript {

	@Test
	public void tool() {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		//driver.quit();
		
		
	}

}
