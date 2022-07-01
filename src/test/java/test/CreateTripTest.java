package test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.CreatingTrip;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resource.Base;

public class CreateTripTest extends Base {

	public WebDriver driver;

	@Test
	public void createtrip() throws InterruptedException {

		CreatingTrip creatingtrip = new CreatingTrip(driver);

		creatingtrip.clickOncreateNewTrip().click();
		Thread.sleep(2000);
		Assert.assertFalse(creatingtrip.businessTrip().isDisplayed());
		creatingtrip.enterTitle().sendKeys("test-trip");
		Thread.sleep(2000);
		creatingtrip.tripTypeRadioButn().click();
		creatingtrip.modeOfTravel().click();
		creatingtrip.enterFromField().sendKeys("del");
		int i=0;
		while(i<4)
		{
			Thread.sleep(2000);
			creatingtrip.enterFromField().sendKeys(Keys.DOWN);
			i++;
			
		}
      creatingtrip.enterFromField().sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      
      creatingtrip.enterToField().sendKeys("bang");
      int j=0;
      while(j<1)
      {
    	  Thread.sleep(2000);
    	  creatingtrip.enterToField().sendKeys(Keys.DOWN);
    	  j++;
      }
      creatingtrip.enterToField().sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      
      creatingtrip.travelDate().click();
      Thread.sleep(2000);
     creatingtrip.selectMonth().sendKeys("27 jul,2022");
     Thread.sleep(3000);
      System.out.println("this is creattriptest");
	}

	@BeforeMethod
	public void getDriver() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));

		LandingPage landingpage = new LandingPage(driver);
		landingpage.loginButn().click();
		LoginPage login = new LoginPage(driver);
		login.emailField().sendKeys(prop.getProperty("emailid"));
		login.emailField().sendKeys(Keys.ENTER);
		login.password().sendKeys(prop.getProperty("password"));
		login.continueButn().click();
		
		
	}

	@AfterMethod
	public void closer() {
		driver.close();
		
	}
}
