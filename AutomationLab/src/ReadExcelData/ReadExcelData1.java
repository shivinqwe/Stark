package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData1 {

	public static void main(String[] args) throws Exception  {
		
		File src = new File("C:\\Users\\Kranthi\\Music\\ExcelData\\TestData.xlsx");
		
		//LOADING THE FILE
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//LOADING THE SHEET
		XSSFSheet sh1= wb.getSheetAt(0);
		
		int rowcount =sh1.getLastRowNum();
		System.out.println("Total no of rows" +rowcount);
		
		
		int col = sh1.getRow(rowcount).getLastCellNum();
		System.out.println(col);
		for (int i =0;i<rowcount;i++) {
			for(int j=0;j<sh1.getRow(rowcount).getLastCellNum();j++) {
				String Data0 = sh1.getRow(i).getCell(j).getStringCellValue();
			System.out.println("Test data from excel is" +Data0);
		}
	}
		wb.close();
		
		
		
		

	}

}
