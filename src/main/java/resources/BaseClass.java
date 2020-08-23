package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver initilizeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SyneTimeAuto\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://eag.synechron.com/SYNE.UI/Account/Common/Account/LogOn?ReturnUrl=%2fSYNE.UI");

		}
		else if(browserName == "Firefox") {
			//Set Path for geko and create an object 
		}
		else if(browserName == "IE") {
			//Set path for Ie and create onj
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
}
