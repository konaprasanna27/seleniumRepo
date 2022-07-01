package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashBoard;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resource.Base;

public class Login extends Base{
	 WebDriver driver;
	 LoginPage  login;
	 DashBoard dashboard;
	   @Given("^Open any browser$")
	    public void open_any_browser() throws IOException  {
	      
		    driver = intializeDriver();
		   
	    }

	   @And("^Navigate to login page$")
	    public void navigate_to_login_page() throws InterruptedException  {
		   driver.get(prop.getProperty("url"));
		   LandingPage landingpage=new LandingPage(driver);
		   landingpage.loginButn().click();
		   Thread.sleep(2000);
		  
		   
	    }

	   @When("^gives valid user name as \"([^\"]*)\" and valid password as \"([^\"]*)\" into required fields$")
	    public void gives_valid_user_name_assomething_and_valid_password_assomething_into_required_fields(String email, String password) {
	    	
		   login=new LoginPage(driver);
	    
	    	login.emailField().sendKeys(email);
	    	login.emailField().sendKeys(Keys.ENTER);
	    	login.password().sendKeys(password);
	    	
	      
	    }

	    @And("^user should click on login button$")
	    public void user_should_click_on_login_button()  {
	    	login.continueButn().click();
	    	
	      
	    }
	    
	    @Then("^verify user should login successfully$")
	    public void verify_user_should_login_successfully() {
	    	
	    	dashboard=new DashBoard(driver);
	    	
	    	Assert.assertTrue(dashboard.dashBoard().isDisplayed());
	    }

	    @After
	   public void closer()
	   {
		   driver.close();
	   }


}
