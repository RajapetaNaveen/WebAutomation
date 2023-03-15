package pageFactory;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class SurveyDetails_Page extends SeleniumHelper {
	public SeleniumHelper Helper;
	public WebDriver driver;
	public SurveyDetails_Page(WebDriver driver, SeleniumHelper Helper) {
		// TODO Auto-generated constructor stub
				this.Helper = Helper;
				this.driver = driver;
				PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_rbAttestation_0")
	WebElement AD;
	
	@FindBy(xpath="//td[@title='Sunday, April 09, 2023']")
	WebElement date1;
	
	@FindBy(xpath="//td[@title='Monday, April 10, 2023']")
	WebElement date2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement waiting;
	
	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl04_txtBoxMilesFromOrg")
	WebElement dist;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl06_btnRadioMainSite")
	WebElement mainsite;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl04_btnRadioMainSite")
	WebElement mainsite2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCEINQuestion_dlQuestion_ctl00_rblYesNoQuestion_0")
	WebElement Eid;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_radTextBoxTaxID")
	WebElement Enum;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnEINAdd")
	WebElement add;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecPrgQuestion_dlQuestion_ctl01_rbQuestion")
	WebElement EPR;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbxHealthRecordVendors")
	WebElement VN;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbxApplication")
	WebElement APPVER;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnVendorAdd")
	WebElement ADD;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecPrgQuestion_dlQuestion_ctl00_rbQuestion")
	WebElement PR;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenMondayHour")
	WebElement MON1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseMondayHour")
	WebElement MON2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenTuesdayHour")
	WebElement TUE1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseTuesdayHour")
	WebElement TUE2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenWednesdayHour")
	WebElement WED1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseWednesdayHour")
	WebElement WED2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenThursdayHour")
	WebElement THU1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseThursdayHour")
	WebElement THU2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenFridayHour")
	WebElement FRI1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseFridayHour")
	WebElement FRI2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenSaturdayHour")
	WebElement SAT1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseSaturdayHour")
	WebElement SAT2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenSundayHour")
	WebElement SUN1;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseSundayHour")
	WebElement SUN2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnApplyToAll")
	WebElement APPLY;
	
	@FindBy(xpath="//span[text()='Ok']")
	WebElement Okbtn;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestion_dlQuestion_ctl00_cbQuestion")
	WebElement CB;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCObserversQuestion_dlQuestion_ctl01_cbQuestion")
	WebElement CB2;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCObserversQuestion_dlQuestion_ctl02_cbQuestion")
	WebElement CB3;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecQuestion_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement OHR;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSecurityInst")
	WebElement iss;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtParkingInst")
	WebElement ins;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSurveyorAssemInst")
	WebElement survs;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHotelInst")
	WebElement accoms;
	
	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHotelInst")
	WebElement comm;
	
	public void setSurveyDetails() throws Exception
	{
		tab6adfunction();
		tab6coifunction();
		tab6eidfunction();
		tab6distfunctionwithoutambulatorsite();
		tab6obserfunction();
		tab6surambfunction();
		tab6trainsfunction();
		tb6ohrfunction();
		tab6hrahcfunction();
		tab6hrrhcfunction();
		tab6hrsoprhcfunction();
	}
	
	@Step("Survey Details AvoidDates")
	public void tab6adfunction() throws InterruptedException {
		Helper.clickonElement(AD);
		Helper.WaitforElementToBeClickable(date1);
		Helper.clickonElement(date1);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(date1);
		Helper.WaitforElementToDisappear(waiting);
		Helper.WaitforElementToBeClickable(date2);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(date2);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(date2);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(nxtbtn);	
	}
	
	@Step("Survey Details Conflicts Of Interest")
	public void tab6coifunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}
	
	public  void tab6distfunctionwithambulatorysite() throws InterruptedException {
		Helper.EnterText(dist, "827");
		Helper.clickonElement(mainsite);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details DBA")
	public void tab6distfunctionwithoutambulatorsite() throws InterruptedException {
		Helper.clickonElement(mainsite2);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details Employee id numbers")
	public void tab6eidfunction() throws Exception {
		Helper.clickonElement(Enum);
		for(int i=0;i<=12;i++) {
			Enum.sendKeys(Keys.BACK_SPACE);
		}
		Helper.EnterText(Enum, "123-456789"+Keys.ENTER);//need to check
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(add);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(nxtbtn);
		
		
	}
	
	@Step("Survey Details Health Record for Ambulatory Service")
	public void tab6hrahcfunction() throws InterruptedException {
		Helper.clickonElement(EPR);
		Helper.EnterText(VN, "hrmsorg");
		Helper.EnterText(APPVER, "1");
		Helper.clickonElement(ADD);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details Health Record for Rural Health Clinic")
	public void tab6hrrhcfunction() throws Exception {
		
		Helper.clickonElement(PR);
		Helper.clickonElement(nxtbtn);
		
	}
	
	@Step("Survey Details Hours of operations for Ambulatory Service")
	public void tab6hrsopahcfunction() throws InterruptedException {
		Select s1=new Select(MON1);
		Select s2=new Select(MON2);
		Select s3=new Select(TUE1);
		Select s4=new Select(TUE2);
		Select s5=new Select(WED1);
		Select s6=new Select(WED2);
		Select s7=new Select(THU1);
		Select s8=new Select(THU2);
		Select s9=new Select(FRI1);
		Select s10=new Select(FRI2);
		Select s11=new Select(SAT1);
		Select s12=new Select(SAT2);
		Select s13=new Select(SUN1);
		Select s14=new Select(SUN2);
		s1.selectByVisibleText("9:00 AM");
		
		s2.selectByVisibleText("10:00 AM");
		s3.selectByVisibleText("9:00 AM");
		s4.selectByVisibleText("10:00 AM");
		s5.selectByVisibleText("9:00 AM");
		s6.selectByVisibleText("10:00 AM");
		s7.selectByVisibleText("9:00 AM");
		s8.selectByVisibleText("10:00 AM");
		s9.selectByVisibleText("9:00 AM");
		s10.selectByVisibleText("10:00 AM");
		s11.selectByVisibleText("9:00 AM");
		s12.selectByVisibleText("10:00 AM");
		s13.selectByVisibleText("9:00 AM");
		s14.selectByVisibleText("10:00 AM");
		Helper.clickonElement(APPLY);
		Helper.clickonElement(Okbtn);
		Helper.clickonElement(CB);
		Helper.clickonElement(nxtbtn);
		
	}
	
	@Step("Survey Details for Rural Health Clinic")
	public void tab6hrsoprhcfunction() throws InterruptedException {
		Select s1=new Select(MON1);
		Select s2=new Select(MON2);
		Select s3=new Select(TUE1);
		Select s4=new Select(TUE2);
		Select s5=new Select(WED1);
		Select s6=new Select(WED2);
		Select s7=new Select(THU1);
		Select s8=new Select(THU2);
		Select s9=new Select(FRI1);
		Select s10=new Select(FRI2);
		Select s11=new Select(SAT1);
		Select s12=new Select(SAT2);
		Select s13=new Select(SUN1);
		Select s14=new Select(SUN2);
		s1.selectByVisibleText("9:00 AM");
		s2.selectByVisibleText("10:00 AM");
		s3.selectByVisibleText("9:00 AM");
		s4.selectByVisibleText("10:00 AM");
		s5.selectByVisibleText("9:00 AM");
		s6.selectByVisibleText("10:00 AM");
		s7.selectByVisibleText("9:00 AM");
		s8.selectByVisibleText("10:00 AM");
		s9.selectByVisibleText("9:00 AM");
		s10.selectByVisibleText("10:00 AM");
		s11.selectByVisibleText("9:00 AM");
		s12.selectByVisibleText("10:00 AM");
		s13.selectByVisibleText("9:00 AM");
		s14.selectByVisibleText("10:00 AM");
		
		Helper.clickonElement(APPLY);
		Helper.clickonElement(Okbtn);
		Helper.clickonElement(CB);
		Helper.clickonElement(CB);
		Helper.clickonElement(nxtbtn);
		
	}
	
	@Step("Survey Details Observers")
	public void tab6obserfunction() throws InterruptedException {
		Helper.clickonElement(CB2);
		Helper.clickonElement(CB2);
		Helper.clickonElement(CB3);
		Helper.clickonElement(CB3);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details Organization Health Record")
	public void tb6ohrfunction() throws InterruptedException {
		Helper.clickonElement(OHR);
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details Survey Ambulatory Service")
	public void tab6surambfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}
	
	@Step("Survey Details Travel Insurance")
	public void tab6trainsfunction() throws InterruptedException {
		Helper.clearText(iss);
		Helper.EnterText(iss, "test 1");
		Helper.clearText(ins);
		Helper.EnterText(ins, "test 2");
		Helper.clearText(survs);
		Helper.EnterText(survs, "test 3");
		Helper.clearText(accoms);
		Helper.EnterText(accoms, "test 4");
		Helper.clearText(comm);
		Helper.EnterText(comm, "testing summary");
		Helper.clickonElement(nxtbtn);
	}


	
	
	
	
	
	
}
