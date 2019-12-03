package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sh1;

	public ExcelDataConfig(String excelpath) {

		try {
			File src = new File(excelpath);

			// LOADING THE FILE
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

			// LOADING THE SHEET
		
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
       }
	   
	public String getData(int sheetnumber ,int row,int column) {
		sh1 = wb.getSheetAt(sheetnumber);
		String data =sh1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetIndex) {
		int row =wb.getSheetAt(sheetIndex).getLastRowNum();
		row =row+1;
		return row;
		
	}
}
