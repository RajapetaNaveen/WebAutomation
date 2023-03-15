package pageFactory;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;


public class YourOrganizationPage extends BasePage {
	public WebDriver driver;
	public SeleniumHelper Helper;
	public YourOrganizationPage(WebDriver driver, SeleniumHelper Helper) {
		this.driver = driver;
		this.Helper = Helper;
		PageFactory.initElements(driver,this);
	}
	
	
	public YourOrganizationPage()
	{
		
	}
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtOrgName")
	WebElement Orgname;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtSAddress")
	WebElement orgstreertadress;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtDBA")
	WebElement dobussas;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_ddlSCountry")
	WebElement countrydd;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtSZipCode")
	WebElement zipcode;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_ddlSCityCd")
	WebElement citydd;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_chkSameAsAbove")
	WebElement mailcb;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_radMainPhoneNumber")
	WebElement orgphonenum;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtWebSite")
	WebElement orgwebsite;
	
	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement loadingIcon;
	
	@FindBy(xpath="//p[text()='Please wait while we are processing your request...']")
	WebElement tyxtele;
	
	@Step("Enterted details in YourOrganization")
	public void FillDemograhicInfo(Map<Object, Object> envData) throws InterruptedException
	{
		Helper.WaitforElementToDisappear(tyxtele);
		Helper.EnterText(Orgname,envData.get("org name").toString());
		Helper.EnterText(dobussas,envData.get("Bussiness").toString());
		Helper.EnterText(orgstreertadress,envData.get("org adress").toString());
		Helper.EnterText(zipcode,envData.get("zipcode").toString()+Keys.ENTER);
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.EnableCheckbox(mailcb);
		Helper.WaitforElementToDisappear(tyxtele);
		Helper.EnterText(orgphonenum, "9987654321");
		Helper.EnterText(orgwebsite, envData.get("orgwebsite").toString());
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(nxtbtn);
		
	}
	
	@Step("Verified details in ownership tab ")
	public void moveToOwnerShip() throws InterruptedException
	{
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(nxtbtn);
	}
	
	}


