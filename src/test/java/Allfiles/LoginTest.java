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

public class LoginTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void tear() {
		driver.quit();
	}
	
	
	@Test
	public void verifyNoUsername() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("gghg");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
		
	}
	@Test
	public void verifyNoPassword() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ghsvdg");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Password cannot be empty"));
		
	}
	
	@Test
	public void NoCredintial() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
	}
	
	@Test
	public void validUsernameInvalidPassword() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ghgvhg");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Invalid credentials"));
		
	}
	@Test
	public void validPasswordInvalidUsername() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admikn");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ghgvhg");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Invalid credentials"));
		
	}
	@Test
	public void invalidCredential() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ghgvhg");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Invalid credentials"));
	}
	@Test
	public void validCredential() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
	}


}
