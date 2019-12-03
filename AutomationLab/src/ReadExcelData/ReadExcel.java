package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Kranthi\\Music\\ExcelData\\TestData.xlsx");
		
		System.out.println(excel.getData(0, 0, 1));

	}

}
