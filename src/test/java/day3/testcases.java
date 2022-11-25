package day3;

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
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
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
	@Test(enabled=false)
	public void verifySocilaMediaCount() {
		
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(), 5);
	}
	@Test
	public void verifyForgotPasswordLink() {
		Assert.assertTrue(driver.getCurrentUrl().contains("requestPasswordResetCode"));
	}
	
	

}
