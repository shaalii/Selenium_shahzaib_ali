package Allfiles;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertPromt {

	@Test
	
	public void tool(){
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		Assert.assertTrue(driver.getCurrentUrl().contains("alert-demo"));
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert();
        
	    try {
		String text = alert.getText();
		alert.accept();
		if(text.contains("Selenium"))
		{
			System.out.println("present");
		}
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
         
		
		
		  
		
		
		

		
	}

}
