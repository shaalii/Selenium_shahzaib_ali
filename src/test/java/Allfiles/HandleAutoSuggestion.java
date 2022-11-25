package Allfiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAutoSuggestion {

	
	@Test
	public void tool() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Assert.assertTrue(driver.getCurrentUrl().contains("how-to-handle"));
		WebElement f=driver.findElement(By.id("datepicker"));
		f.click();
		//f.findElement(By.xpath("//a[contains(text(),'25')]")).click();
		Thread.sleep(3000);
		List<WebElement> l=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		Thread.sleep(2000);
		for(WebElement e:l) {
			if(e.getText().contains("26"))
			{
				System.out.println("selected");
				e.click();
			}
		}
		
		

		

		
		
	}

}
