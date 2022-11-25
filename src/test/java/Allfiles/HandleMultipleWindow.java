package Allfiles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleMultipleWindow {

	@Test
	public void tool() throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));

		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.quit();
		/*
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window handle is "+parent);
		
		driver.findElement(By.xpath("//img[contains(@alt,'Facebook')]")).click();
		
		Set<String> allWindowHandle=driver.getWindowHandles();
		
		System.out.println("Total Set values "+allWindowHandle);
		
		int count=allWindowHandle.size();
		
		System.out.println("Total count is "+count);
		
		
		for(String child:allWindowHandle)
		{
			
			if(!child.equals(parent))
			{
				
				driver.switchTo().window(child);
				String newTitle=driver.getTitle();
				System.out.println("New title is "+newTitle);
				//driver.quit();
			}
			
			
		}
		
		driver.switchTo().window(parent);
		driver.quit();
		
*/
	}

}
