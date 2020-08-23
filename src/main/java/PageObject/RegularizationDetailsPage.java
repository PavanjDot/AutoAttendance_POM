package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegularizationDetailsPage {
	public WebDriver driver;

	By regulyze = By.xpath("//table[@class='listing-table']/tbody/tr[2]/td[6]/a[2]");
	
	public RegularizationDetailsPage(WebDriver driver) {
		 driver = this.driver;
	}
	
	public void Regulization(WebDriver driver) {
		driver.findElement(regulyze).click();
	}
}
