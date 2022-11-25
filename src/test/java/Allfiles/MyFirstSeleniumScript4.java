package Allfiles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript4 {

	@Test
	public void tool() throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
		driver.quit();
		/*
		Thread.sleep(5000);
	
		WebElement stateDropdown=driver.findElement(By.id("state"));
	
		Select state=new Select(stateDropdown);
		
		state.selectByIndex(2);
		
		Thread.sleep(2000);
		
		state.selectByVisibleText("Goa");
		
		Thread.sleep(2000);
		
		state.selectByValue("Karnataka");
		
		List<WebElement> allValues=state.getOptions();
		
		
		for(WebElement ele:allValues)
		{
			System.out.println(ele.getText());
		}
		
		//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.linkText("New user? Signup")).click();
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
