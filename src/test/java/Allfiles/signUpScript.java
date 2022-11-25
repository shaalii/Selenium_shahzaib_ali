package Allfiles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signUpScript {

	@Test
	public void tool() throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		chrome.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		chrome.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(chrome.getCurrentUrl().contains("login"));
		Thread.sleep(3000);
		chrome.quit();
		/*
		chrome.findElement(By.linkText("New user? Signup")).click();
		Thread.sleep(4000);
		
		chrome.findElement(By.xpath("//input[@id='name']")).sendKeys("shahzaib");
		chrome.findElement(By.xpath("//input[@id='email']")).sendKeys("shah@gmail.com");
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("shah@123");
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//label[contains(text(),Male)]")).click();
		WebElement weblist=chrome.findElement(By.xpath("//select[@name=state]"));
		Thread.sleep(2000);
		Select state =new Select(weblist);
		
		List<WebElement> list=state.getOptions();
		
		for(WebElement i:list) {
			if(i.getText().contains("Rajasthan")) {
				i.click();
				System.out.println(i.getText());
			break;
			}
		}
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//button[contains(text(),Sign Up]")).click();
		*/
	}

}
