package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class Submission_Page extends SeleniumHelper {
	public SeleniumHelper Helper;
	public WebDriver driver;
	public Submission_Page(WebDriver driver, SeleniumHelper Helper) {
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_lbMissingInfo")
	WebElement click;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgMissingInfo_ctl00_ctl04_lblRuleMessage")
	WebElement text;
	
	@Step("Ambulatory Error verified")
	public  void ambulatoryerror() throws InterruptedException {
		Helper.clickonElement(click);
		if(Helper.GetText(text).contains("Ambulatory Health Care service/program has not been provided")) {
			System.out.println("Error in Ambulatory Service");
		}
	}
	
}
