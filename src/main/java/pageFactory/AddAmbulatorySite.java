package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class AddAmbulatorySite extends BasePage {
	
	
	public SeleniumHelper Helper;
	public WebDriver driver;
	public AddAmbulatorySite(WebDriver driver, SeleniumHelper Helper) {
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_lbMissingInfo")
	WebElement click;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnSiteAdd")
	WebElement add;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_0")
	WebElement AHCCB;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement waiting;
	
	@FindBy(id="ctl00_ctl00_tjcTopMenu_TopMenuItem8TopMenuLinkCell")
	WebElement tab9;
	
	@FindBy(id="ctl00_ctl00_tjcTopMenu_TopMenuItem4TopMenuLinkCell")
	WebElement tab5;
	
	@FindBy(id="ctl00_ctl00_tjcTopMenu_TopMenuItem5TopMenuLinkCell")
	WebElement tab6;
	
	@FindBy(id="ctl00_ctl00_tjcTopMenu_TopMenuItem2TopMenuLinkCell")
	WebElement tab3;
	
	@FindBy(id="ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail6_hylkListSubItemLeftRail")
	WebElement tab6dist;
	
	@FindBy(id="ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail16_liListSub2ItemLeftRail0_hylkListSub2ItemLeftRail")
	WebElement tab6HOAMB;
	
	@FindBy(id="ctl00_ctl00_tjcTopMenu_TopMenuItem7TopMenuLinkCell")
	WebElement tab8;
	
	@Step("Added site for Ambulatory")
	public  void addsiteforambulatoryaftererror() throws Throwable {
		Helper.clickonElement(tab5);
		Helper.clickonElement(add);
		Helper.clickonElement(AHCCB);
		Helper.WaitforElementToDisappear(waiting);
		SiteInformation_Page  siteinfo=new SiteInformation_Page (driver,Helper);
		siteinfo.tab5sdfunction();
		siteinfo.tab5sdahcfunction();
		siteinfo.tab5sdahcSettingsfunction();
		siteinfo.tab5sdahcmdfunctionS();
		Helper.clickonElement(tab9);
		Helper.clickonElement(click);
		Helper.clickonElement(tab6);
		Helper.clickonElement(tab6dist);
		SurveyDetails_Page survdetails=new SurveyDetails_Page(driver,Helper);
		survdetails.tab6distfunctionwithambulatorysite();
		Helper.clickonElement(tab9);
		Helper.clickonElement(click);
		Helper.clickonElement(tab6);
		Helper.clickonElement(tab6HOAMB);
		survdetails.tab6hrsopahcfunction();
		Helper.clickonElement(tab9);
		Helper.clickonElement(click);
		Helper.clickonElement(tab3);
		FederalOrState_Page federal=new  FederalOrState_Page(driver,Helper);
		federal.SetAmbulatoryHealthCare();
		Helper.clickonElement(tab8);
		Summary_Page summary=new Summary_Page(driver,Helper);
		summary.tab8amfunction();
		summary.tab8oldfunction();
		summary.programvalidation();
		summary.tab8ssfunction();
	}
	
	@Step("Added site for Ambulatory")
	public  void addsiteforambulatory() throws Throwable {
		Helper.clickonElement(tab5);
		Helper.clickonElement(add);
		Helper.clickonElement(AHCCB);
		SiteInformation_Page  siteinfo=new SiteInformation_Page (driver,Helper);
		siteinfo.tab5sdfunction();
		siteinfo.tab5sdahcfunction();
		siteinfo.tab5sdahcSettingsfunction();
		siteinfo.tab5sdahcmdfunctionS();
		Helper.clickonElement(tab3);
		FederalOrState_Page federal=new  FederalOrState_Page(driver,Helper);
		federal.SetAmbulatoryHealthCare();
		Helper.clickonElement(tab6);
		
	}

}
