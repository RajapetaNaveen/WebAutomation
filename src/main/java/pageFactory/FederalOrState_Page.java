package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class FederalOrState_Page extends BasePage {

	public WebDriver driver;
	public SeleniumHelper Helper;
	public FederalOrState_Page(WebDriver driver, SeleniumHelper Helper) {
		this.driver = driver;
		this.Helper = Helper;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCNewYorkDOH_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement FAHC;
	
	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHRSANo")
	WebElement HRSA;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionDeemedRequest_dlQuestion_ctl00_rblYesNoQuestion_0")
	WebElement FRHC;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtCMSLegalName")
	WebElement orglegname;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionCCNNumber_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement MC;
	
	@FindBy(id = "ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement loadingIcon;
	
	public void SetFederalorState() throws InterruptedException
	{
		SetAmbulatoryHealthCare();
		setBureauOfPrimaryHealth();
		setRuralHealthClinic();
	}
	
	@Step("Federal for Ambulatory Healthcare")
	public  void SetAmbulatoryHealthCare() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(FAHC);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Federal for Bureauofprimaryhealth")
	public  void setBureauOfPrimaryHealth() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.EnterText(HRSA, "H80CS46567");
		Helper.clickonElement(nxtbtn);
		
	}
	@Step("Federal for Rural Health Clinic")
	public  void setRuralHealthClinic() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(FRHC);
		Helper.EnterText(orglegname, "CMS legal name on 855 for RHC");
		Helper.clickonElement(MC);
		Helper.clickonElement(nxtbtn);
		
	}
	
	
	
}
