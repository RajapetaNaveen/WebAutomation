package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;


public class HomePage extends BasePage {

	public WebDriver driver;
	public SeleniumHelper Helper;
	public HomePage(WebDriver driver, SeleniumHelper Helper)
	{
		
		this.driver = driver;
		this.Helper = Helper;
		PageFactory.initElements(driver,this);
		
	}
	public HomePage() {
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="ctl00_cphContentArea_imgbtnStartApp")
	WebElement btnStartApplication;
	
	@Step("Clicked on Start Application")
	public void StartApplication() throws InterruptedException
	{
		Helper.clickonElement(btnStartApplication);
		
	}
	
}
