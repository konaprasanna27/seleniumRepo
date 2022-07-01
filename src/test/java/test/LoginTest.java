package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.DashBoard;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resource.Base;

public class LoginTest extends Base{
	public WebDriver driver;
	Logger log;
	LoginPage login;
	@Test(dataProvider="getloginData")
	public void login(String email,String password,String expectedresult) throws IOException, InterruptedException {
			
		LandingPage landingpage=new LandingPage(driver);
		landingpage.loginButn().click();
		Thread.sleep(2000);
		 login=new LoginPage(driver);
		login.emailField().sendKeys(email);
		log.debug("emailfield entred");
		login.emailField().sendKeys(Keys.ENTER);
		login.password().sendKeys(password);
		log.debug("password entred");
		login.continueButn().click();
		
		DashBoard dashboard=new DashBoard(driver);
		String actualresult=null;
		try
		{
			if(dashboard.dashBoard().isDisplayed())
				actualresult="success";
			log.debug("login is sucessfull");
		}
		catch(Exception e)
		{
			actualresult="failure";
			log.debug("login is failed");
		}
	Assert.assertEquals(actualresult,expectedresult);
	log.info("login got passed");
	System.out.println("this is logintest");
	}
	
	@BeforeMethod
	public void getDrivers() throws IOException
	{
		 log = LogManager.getLogger(LoginTest.class.getName());
		driver = intializeDriver();
		log.debug("browser lanched sucessfully");
		 driver.get(prop.getProperty("url"));
		 log.debug("application lanched sucessfully");
	}

	@AfterMethod
	public void closer()
	{
		driver.close();
		log.debug("browser closed");
	}
	
	@DataProvider
	public Object[][] getloginData()
	{
		Object[][] data= {{"priyanka.pedamalla@team.itilite.com","Welcome@123","success"}};
		return data;
		
	}
}
