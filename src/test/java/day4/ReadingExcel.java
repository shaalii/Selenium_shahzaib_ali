package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel {
	
@Test
public void getTestData() {
	
	
	File f=new File("./testData/sapientData.xlsx");
	Object arr[][]=null;
	
	try {
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("logindata");
		int r=sh.getPhysicalNumberOfRows();
		int c=sh.getRow(0).getPhysicalNumberOfCells();
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
}


}
