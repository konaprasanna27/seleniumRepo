package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
    private WebElement emailField;
	
	public WebElement emailField()
	{
		return emailField;
	
	}
	
	@FindBy(id="password")
	private WebElement password;
	public WebElement password() {
		
		return password;
	}
   @FindBy(id="common-btn")
	private WebElement continueButn;
   public WebElement continueButn()
   {
	   return continueButn;
   }
   
}
