package Allfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropExample {

	@Test
	public void tool(){
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		

		driver.get("https://jqueryui.com/droppable/");
		Assert.assertTrue(driver.getCurrentUrl().contains("droppable"));
		
		WebElement child_frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
		driver.switchTo().frame(child_frame);
		
		WebElement src=driver.findElement(By.id("draggable"));

		WebElement destination=driver.findElement(By.id("droppable"));

		Actions act=new Actions(driver);
		
		act.clickAndHold(src)
		.pause(2000)
		.moveToElement(destination)
		.pause(2000)
		.release(destination).build().perform();
		
		
	}

}
