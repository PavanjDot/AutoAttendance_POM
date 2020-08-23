package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	 By username = By.xpath("//input[@id='UserName']");
	 By pass = By.xpath("//input[@id='Password']");
	 By loginbtn = By.xpath("//input[@value='Sign In']");
	 
	 public LoginPage(WebDriver driver) {
		 driver = this.driver;
	}

	public void setusername(WebDriver driver) throws IOException {
		
		//Creating Instance of Properties class and getting the data from properties file using FIleInputStream
				Properties prop = new Properties();
				
				FileInputStream fis = new FileInputStream("D:\\Selenium\\SyneTimeAuto\\src\\main\\java\\resources\\data.properties");
				
				prop.load(fis);
				
				//Holding the Variables 
				String userName = prop.getProperty("userName");
				
				
				driver.findElement(username).sendKeys(userName);
				
				
				
		 
	 }
	
	public void setPassword(WebDriver driver) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SyneTimeAuto\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String password = prop.getProperty("password");
		
		driver.findElement(pass).sendKeys(password);
	}

	public void signup(WebDriver driver) {	
		driver.findElement(loginbtn).click();
	}
	
}
