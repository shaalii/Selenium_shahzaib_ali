package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class remoteDriver {

	WebDriver driver=null;
	//WebDriver driver1=null;
		@Parameters({"bname","bversion","os","osversion"})
		@BeforeClass
		public void setup(String bname,String bversion,String os,String osversion) {
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			//DesiredCapabilities capabilities1=new DesiredCapabilities();
			
			URL url=null;
			try {
				url = new URL("https://shahzaibali_uYr4IV:3PsYPk9J1gypxTf4aD3s@hub-cloud.browserstack.com/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			capabilities.setCapability("browserName", bname);
			capabilities.setCapability("browserVersion", bversion);
			capabilities.setCapability("os", os);
			capabilities.setCapability("osVersion",osversion );
			
			
			/*capabilities1.setCapability("browserName", "Safari");
			capabilities1.setCapability("browserVersion", "16.0");
			capabilities1.setCapability("os", "OS X");
			capabilities1.setCapability("osVersion", "Ventura");
			*/			
			driver=new RemoteWebDriver(url, capabilities);
			//driver1=new RemoteWebDriver(url,capabilities1);
			
			driver.manage().window().maximize();
			//driver1.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			//driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
			//driver1.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		}
		@AfterClass
		public void TearDown() {
			driver.quit();
			//driver1.quit();
		}
        
		@Test
		public void test1() {
			driver.get("https://ineuron-courses.vercel.app/");
			Assert.assertTrue(driver.getTitle().contains("iNeuron Courses"));
		}
		
	

}
