package Allfiles;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class screenshot {

	@Test
	public void tool() {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		driver.quit();		/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./shah.png");
		try {
		FileHandler.copy(src, f);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
	}

}
