package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;
	public DashBoard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	private WebElement dashBoard;
	public WebElement dashBoard()
	{
		return dashBoard;
	}
	
}
