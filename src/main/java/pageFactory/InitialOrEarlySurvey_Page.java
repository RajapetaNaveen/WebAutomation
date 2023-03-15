package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class InitialOrEarlySurvey_Page extends SeleniumHelper {

	public WebDriver driver;
	public SeleniumHelper Helper;
	public InitialOrEarlySurvey_Page(WebDriver driver, SeleniumHelper Helper) {
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;
	
	public void setInitialOrEarlySurvey() throws InterruptedException
	{
		setOrganizationEligibility();
		setSurveyOptions();
		setSurveyRequirements();
		
	}
	
	@Step("Orgnaiztion Eligibilty")
	public void setOrganizationEligibility() throws InterruptedException
	{
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Requirements")
	public void setSurveyRequirements() throws InterruptedException
	{
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Options")
	public void setSurveyOptions() throws InterruptedException
	{
		Helper.clickonElement(nxtbtn);
	}

}
