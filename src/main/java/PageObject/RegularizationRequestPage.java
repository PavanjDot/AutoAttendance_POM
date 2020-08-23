package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegularizationRequestPage {
	public WebDriver driver;
	
	By InTimePicker = By.id("fromPicker");
	By outTimePicker = By.id("Text1");
	By btnDone = By.xpath("//*[text() = 'Done']");
	By btnApply = By.xpath("//aside[@class='button-row']/input[2]");

	
	public RegularizationRequestPage(WebDriver driver) {
		 driver = this.driver;
	}
	
	public void reason(WebDriver driver) {
		Select src = new Select(driver.findElement(By.id("Remarks")));
		
		
		src.selectByVisibleText("Permit to Work Out of Office due to Covid-19");
		
		
		
	}
	
	public void InTimeSelectorMethod(WebDriver driver) {
		driver.findElement(InTimePicker).click();

		Select src = new Select(driver.findElement(By.xpath("//*[@class='ui_tpicker_hour_slider']/select")));
		
		
		src.selectByVisibleText("12");
		
		
		Select src2 = new Select(driver.findElement(By.xpath("//*[@class='ui_tpicker_minute_slider']/select")));
		
		
		src2.selectByVisibleText("30");
		
		driver.findElement(btnDone).click();
		
				
	}
	
	
	public void OutTimeSelectorMethod(WebDriver driver) {
		
		driver.findElement(outTimePicker).click();
		
		Select src = new Select(driver.findElement(By.xpath("//*[@class='ui_tpicker_hour_slider']/select")));
		
		
		src.selectByVisibleText("21");
		
		
		Select src2 = new Select(driver.findElement(By.xpath("//*[@class='ui_tpicker_minute_slider']/select")));
		
		
		src2.selectByVisibleText("30");
		
		driver.findElement(btnDone).click();
		
		
	}

	
	public void ApplyBtn(WebDriver driver) {
		driver.findElement(btnApply).click();
	}


}
