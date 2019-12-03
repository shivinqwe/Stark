package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HmrLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kranthi\\Downloads\\chromedriver_win32 (1).exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		

	}

}
