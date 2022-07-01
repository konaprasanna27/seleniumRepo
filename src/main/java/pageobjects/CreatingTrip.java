package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingTrip {
	
	WebDriver driver;
	public CreatingTrip(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[.='Create New Trip ']")
	private WebElement clickOncreateNewTrip;
	
	public WebElement clickOncreateNewTrip() {
		return clickOncreateNewTrip;
	}
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement enterTitle;
	
	public WebElement enterTitle()
	{
		return enterTitle;
	}
	
	@FindBy(xpath="//label[@class='book_type_radio radio inline tab tab-1']")
	private WebElement businessTrip;
	
	public WebElement businessTrip()
	{
		return businessTrip;
	}
	
	@FindBy(xpath="//input[@id='ow']")
	private WebElement tripTypeRadioButn;
	
	public WebElement tripTypeRadioButn()
	{
		return tripTypeRadioButn;
	}
	
	@FindBy(id="Train")
	private WebElement modeOfTravel;
	
	public WebElement modeOfTravel()
	{
		return modeOfTravel;
	}
	
	@FindBy(id="travelfrom1")
	private WebElement enterFromField;
	
	public WebElement enterFromField()
	{
		return enterFromField;
	}
	
	@FindBy(id="travelto1")
	private WebElement enterToField;
	
	public WebElement enterToField()
	{
		return enterToField;
	}
	
	@FindBy(id="traveldate1")
	private WebElement travelDate;
	
	public WebElement travelDate()
	{
		return travelDate;
	}
	@FindBy(xpath="//input[@id='traveldate1']")
	private WebElement selectMonth;
	
	public WebElement selectMonth()
	{
		return selectMonth;
	}
	
	
}
