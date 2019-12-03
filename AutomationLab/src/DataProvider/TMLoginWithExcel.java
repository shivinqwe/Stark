package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class TMLoginWithExcel {
	WebDriver driver;

	@Test(dataProvider="TmLoginData")
	public void login(String username , String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kranthi\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		}
	@AfterMethod
	public void BrowserClose() {
		driver.quit();
	}
	
	
	@DataProvider(name="TmLoginData")
	public Object[][] PassData(){ //METHOD NAME
		ExcelDataConfig ec = new ExcelDataConfig("C:\\Users\\Kranthi\\eclipse-workspace\\AutomationLab\\TestData\\InputData.xlsx");
	    int rows =	ec.getRowCount(0);
	    System.out.println(rows);
	    
		

		
		Object[][] data = new Object[3][2];//OBJECT CREATION
		
		for(int i=0;i<rows;i++) {
			data[i][0]=ec.getData(0, i, 0);
			data[i][0]=ec.getData(0, i, 1);

		}
		return data;

}
}
