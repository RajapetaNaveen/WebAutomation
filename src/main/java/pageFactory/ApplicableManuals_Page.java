package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class ApplicableManuals_Page extends SeleniumHelper {
	public SeleniumHelper Helper;
	public WebDriver driver;
	public ApplicableManuals_Page(WebDriver driver, SeleniumHelper Helper) {
		// TODO Auto-generated constructor stub
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//td[@class='gridViewCell']")
	WebElement rural;

	@FindBy(id="//td[@title='Monday, April 10, 2023']")
	WebElement text;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgMissingInfo_ctl00_ctl04_lblRuleMessage")
	WebElement click;

	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;



	@Step("Applicable manuals verified")
	public void tab7amfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}


}
