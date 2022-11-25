package Allfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tear() {
		driver.quit();
	}
	
	
	@Test(description="checking url is meeting or not")
	public void verifyUrl() {
		
		
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
	
		
	}
	@Test
	public void verifyTitle() {
		
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
		
	}
	@Test
	public void verifySocilaMediaCount() {
		
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(), 4);
	}
	@Test
	public void verifyForgotPasswordLink() {
		Assert.assertTrue(true);
	}
	
	

}
