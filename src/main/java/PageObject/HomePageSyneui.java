package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSyneui {
	public WebDriver driver;
		
	By PlaceOfDiscrepancyNo = By.xpath("//div[@class='attendenceDiscrepancy']/span");
	
	
	
	 public HomePageSyneui(WebDriver driver) {
		 driver = this.driver;
	}
	
	 
	public void attendenceDiscrepancy(WebDriver driver) {
		 
	String number = driver.findElement(PlaceOfDiscrepancyNo).getText();
	
	if(number.equalsIgnoreCase("0")) {
		System.out.println("No Requests found");
	}
	else {
		driver.findElement(PlaceOfDiscrepancyNo).click();
	}
	
		
	}
	 
	 
}
;