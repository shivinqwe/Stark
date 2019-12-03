package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TMLogin {
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
		
		Object[][] data = new Object[3][2];//OBJECT CREATION
		
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="user02";
		data[1][1]="TM1234";
				
	    data[2][0]="admin2";
		data[2][1]="demo2";
		return data;

}
}
