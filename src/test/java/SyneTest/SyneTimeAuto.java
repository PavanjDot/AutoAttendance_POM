package SyneTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import PageObject.HomePageSyneui;
import PageObject.LoginPage;
import PageObject.RegularizationDetailsPage;
import PageObject.RegularizationRequestPage;
import resources.BaseClass;

public class SyneTimeAuto extends BaseClass {

	@Test
	public void Automate() throws InterruptedException, IOException {

		driver = initilizeDriver();

		//Creating Instances
		LoginPage lp = new LoginPage(driver);
		HomePageSyneui hp = new HomePageSyneui(driver);
		RegularizationDetailsPage rp = new RegularizationDetailsPage(driver);
		RegularizationRequestPage rq = new RegularizationRequestPage(driver);

		//Calling Action Methods
		
		//LoginPage
		lp.setusername(driver);
		lp.setPassword(driver);
		lp.signup(driver);
		
		//HomePage
		hp.attendenceDiscrepancy(driver);
		
		
		//Regularization Page
		rp.Regulization(driver);
		
		//Request Page
		rq.reason(driver);
		rq.InTimeSelectorMethod(driver);
		rq.OutTimeSelectorMethod(driver);
		rq.ApplyBtn(driver);
		
		
		

	}

			
		

	

}

