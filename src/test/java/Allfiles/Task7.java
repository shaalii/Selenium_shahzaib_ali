package Allfiles;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task7 {

	@Test
	public void tool() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.quit();
	/*
		Actions act=new Actions(driver);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Manage')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Manage Categories')]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Set<String> allWindowHandle=driver.getWindowHandles();
		List<String> l=new ArrayList<>(allWindowHandle);
		driver.switchTo().window(l.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
		//Thread.sleep(2000);
		
		
		Alert alt=	driver.switchTo().alert();
		alt.sendKeys("Selenium work");
		alt.accept();
		
		driver.switchTo().window(l.get(1));
		
		driver.findElement(By.xpath("//td[contains(text(),'Selenium1')]//following::button[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		
*/
	}

}
