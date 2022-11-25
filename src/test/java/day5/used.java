package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class used {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.id("kils")).sendKeys("dsdd");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
	}

}
