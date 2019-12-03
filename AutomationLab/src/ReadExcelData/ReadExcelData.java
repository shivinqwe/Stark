package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception  {
		
		File src = new File("C:\\Users\\Kranthi\\Music\\ExcelData\\TestData.xlsx");
		
		//LOADING THE FILE
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//LOADING THE SHEET
		XSSFSheet sh1= wb.getSheetAt(0);
		
		String data0 = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is "+data0);
		
		String data1 = sh1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is "+data1);
		wb.close();
		
		

	}

}
