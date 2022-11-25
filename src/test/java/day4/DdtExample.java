package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class DdtExample {
	
WebDriver driver;
@BeforeClass
public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	driver.get("https://ineuron-courses.vercel.app/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
}
	
@Test(dataProvider = "testdata")
public void test1(String username,String password) {
	
	driver.findElement(By.id("email1")).sendKeys(username);
	driver.findElement(By.id("password1")).sendKeys(password);
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).getText().equals("Sign out"));
	driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
	
}

@DataProvider(name="testdata")

public Object[][] getTestData() {
	
	File f=new File("./testData/sapientData.xlsx");
	Object arr[][]=null;
	
	try {
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("logindata");
		int r=sh.getPhysicalNumberOfRows();
		int c=sh.getRow(0).getPhysicalNumberOfCells();
		arr=new Object[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
	}
	
	catch(IOException e) {
		e.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}



/*public Object[][] data(){
	
	Object arr[][]=new Object[5][2];
	
	arr[0][0]="ineuron@ineuron.ai ";
	arr[0][1]="ineuron";
	arr[1][0]=" sample9@gmail.com";
	arr[1][1]="Mukesh1234";
	arr[2][0]="samplemukesh@gmail.com";
	arr[2][1]="Mukesh1234";
	arr[3][0]="samplemukesh1@gmail.com";
	arr[3][1]="Mukesh1234";
	arr[4][0]="samplemukesh2@gmail.com";
	arr[4][1]="Muke4";
	//arr[1][0]="harsh";
	//arr[1][1]="har@123";
	
	return arr;*/
	return arr;
}

@AfterClass
public void drop() {
	driver.quit();
}
	

}
