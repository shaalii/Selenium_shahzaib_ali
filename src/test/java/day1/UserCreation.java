package day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/validateCredentials");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Actions act=new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//act.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		WebElement e=driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
		Select s=new Select(e);
		s.selectByVisibleText("Admin");
		
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Mukesh Otwani");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("shahzaib1");
		driver.findElement(By.xpath("//option[normalize-space()='Enabled']")).click();
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Mukesh@123");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Mukesh@123");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("shahzaib");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Mukesh@123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.quit();

	}

}
