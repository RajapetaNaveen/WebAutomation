package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class Summary_Page extends SeleniumHelper {
	public SeleniumHelper Helper;
	public WebDriver driver;
	public Summary_Page(WebDriver driver, SeleniumHelper Helper) {
		// TODO Auto-generated constructor stub
				this.Helper = Helper;
				this.driver = driver;
				PageFactory.initElements(driver,this);
	}

	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;
	
	@FindBy(xpath="html/body/form/div[3]/div[5]/div[2]/div[1]/div[6]/div[3]/div[2]/div/table/tbody/tr")
	List<WebElement> totrows;
	

	public void setSummary() throws InterruptedException
	{
		tab8amfunction();
		tab8oldfunction();
		programvalidation();
		tab8ssfunction();
	}
	
	@Step("Summary Accredential Manuals")
	public void tab8amfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Summary Organisation Level Details")
	public void tab8oldfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Summary Site Summary")
	public void tab8ssfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Progarms Validation successful")
	public void programvalidation() {
		int rows=totrows.size();
		for(int i=2;i<=rows;i++ ) {
			String text=driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_gvSites']/tbody/tr["+i+"]/td[4]")).getText();
			if(text.equalsIgnoreCase("Rural Health Clinic")) {
				System.out.println("Rural health care validation successfull");
			}
			if(text.equalsIgnoreCase("Ambulatory Health Care")) {
				System.out.println("Ambulatory Health care validation successfull ");
			}
		}
	
	}
	
}
