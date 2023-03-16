package pageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class SiteInformation_Page  extends BasePage {
	public SeleniumHelper Helper;
	public WebDriver driver;
	public static ArrayList<String> programsdisplayedinsiteinfo=new ArrayList<String>();
	public SiteInformation_Page(WebDriver driver, SeleniumHelper Helper) {
		// TODO Auto-generated constructor stub
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_0")
	WebElement AHCCB;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_3")
	WebElement RHCCB;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSiteName")
	WebElement sitename;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtDBA")
	WebElement dobuss;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSAddress")
	WebElement SSA;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCountry")
	WebElement countrydd;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSZipCode")
	WebElement zipcode;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCityCd")
	WebElement citydd;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtBPHCSiteID")
	WebElement HRSA;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionBPHCtype_dlQuestion_ctl00_dlAttribute1_ctl02_rbAttribute")
	WebElement urbbtn;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionBPHCtype_dlQuestion_ctl00_dlAttribute1_ctl01_rbAttribute")
	WebElement ruralbtn;

	@FindBy(id="ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;

	@FindBy(id="ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement waiting;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCDesc2_dlQuestion_ctl00_rbQuestion")
	WebElement SDAHC;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbOpenHours")
	WebElement avghrs;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbLIP")
	WebElement Liscprac;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionFTE_dlQuestion_ctl00_tbTBQuestion")
	WebElement exclscpra;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionLCS_dlQuestion_ctl00_tbTBQuestion")
	WebElement liscstaff;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionPA_dlQuestion_ctl00_cbQuestion")
	WebElement procedure;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionLSC_dlQuestion_ctl00_dlAttribute1_ctl01_rbAttribute")
	WebElement lfccb;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionMD_dlQuestion_ctl00_rblYesNoQuestion_0")
	WebElement dental;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl00_cbService")
	WebElement services;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbVolume")
	WebElement visits;

	@FindBy(id="divDiscard")
	WebElement dialouge;

	@FindBy(xpath="//span[text()='Cancel']")
	WebElement cancel;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_rbService")
	WebElement settings;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionRHCDesc1_dlQuestion_ctl00_rbQuestion")
	WebElement SDRHC;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl00_cbService")
	WebElement nurserv;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_cbService")
	WebElement mobserv;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_dlAttribute1_ctl01_cbAttribute")
	WebElement monday;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_dlAttribute1_ctl03_cbAttribute")
	WebElement wednesday;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl02_cbService")
	WebElement diagimg;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService2_dlService_ctl07_cbService")
	WebElement mamograph;

	@FindBy(xpath="//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs']/tbody/tr[1]/td[1]")
	WebElement webtable;

	@FindBy(xpath="//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs']/tbody/tr")
	List<WebElement> tablerow;

	@FindBy(xpath="//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs']/tbody/tr[1]/td")
	List<WebElement>  tablecol;

	@FindBy(xpath="//input[@checked='checked']//following-sibling::label")
	List<WebElement> check;

	@FindBy(id="ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionRHCDesc1_dlQuestion_ctl00_rbQuestion")
	WebElement SD;



	public  void tab5sdfunction() throws  InterruptedException {
		Helper.WaitforElementToDisappear(waiting);
		Helper.EnterText(sitename,"AHC Site");
		Helper.EnterText(dobuss,"AHC");
		Helper.EnterText(SSA,"Elm street");
		Helper.EnterText(zipcode,"10012");
		Helper.WaitforElementToDisappear(waiting);
		Helper.clearText(HRSA);
		Helper.WaitforElementToBeClickable(HRSA);
		Helper.clickonElement(HRSA);

		Thread.sleep(2000);

		for(int i=0;i<=12;i++) {
			HRSA.sendKeys(Keys.BACK_SPACE);
		}
		HRSA.sendKeys("BPSH80987654"+Keys.ENTER);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(ruralbtn);
		Helper.clickonElement(nxtbtn);

	}

	public void tab5sd3fuction() throws Exception {
		Helper.EnterText(sitename,"Test3");
		Helper.EnterText(dobuss,"test3");
		Helper.EnterText(SSA,"Third Street");
		zipcode.clear();
		zipcode.sendKeys("60128"+Keys.ENTER);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(nxtbtn);

	}

	public  void tab5sdahcfunction() throws InterruptedException  {
		Helper.clickonElement(SDAHC);
		Helper.EnterText(avghrs,"203");
		Helper.EnterText(Liscprac,"30");
		Helper.EnterText(exclscpra,"5");
		Helper.EnterText(liscstaff,"5");
		Helper.clickonElement(procedure);
		Helper.clickonElement(procedure);
		Helper.clickonElement(lfccb);
		Helper.clickonElement(nxtbtn);
	}

	
	public  void tab5sdahcmdfunctionS() throws Exception {
		Helper.clickonElement(dental);
		Helper.clickonElement(services);
		Helper.EnterText(visits,"50");
		Helper.clickonElement(nxtbtn);
	}
	
	public void tab5sdahcSettingsfunction() throws InterruptedException {
		Helper.clickonElement(settings);
		Helper.clickonElement(nxtbtn);
	}

	public  void tab5sdrhcfunction() throws InterruptedException {
		Helper.clickonElement(SDRHC);
		Helper.clickonElement(nurserv);
		Helper.clickonElement(mobserv);
		Helper.clickonElement(mobserv);
		Helper.clickonElement(monday);
		Helper.clickonElement(wednesday);
		Helper.WaitforElementToBeClickable(diagimg);
		Helper.clickonElement(diagimg);
		Helper.WaitforElementToBeClickable(diagimg);
		Helper.clickonElement(diagimg);
		Helper.WaitforElementToBeClickable(mamograph);
		Helper.clickonElement(mamograph);
		Helper.clearText(visits);
		Helper.EnterText(visits,"500");
		Helper.clickonElement(nxtbtn);
	}

	public  void tab5sdrhcfunction2() throws Exception {

		Helper.EnterText(sitename,"RHC Test");
		Helper.EnterText(dobuss,"test 2");
		Helper.EnterText(SSA,"456 Main Street");
		zipcode.clear();
		zipcode.sendKeys("60130"+Keys.ENTER);
		Helper.WaitforElementToDisappear(waiting);
		Helper.clickonElement(nxtbtn);
	}

	public  void tab5sdrhcfunction3(String[] args) throws Exception {
		Helper.clickonElement(SD);
		Helper.clickonElement(nurserv);
		Helper.clickonElement(nurserv);
		Helper.clearText(visits);
		Helper.EnterText(visits,"50");
		Helper.clickonElement(nxtbtn);
	}

	public void tab5ssfunction() throws InterruptedException {
		Helper.clickonElement(nxtbtn);
	}



	@Step("programs displayed in  siteinfo")
	public void programsinsiteinfo() {
		int row=tablerow.size();
		int col=tablecol.size();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==3&&j==3) {
					break;
				}
				else {
					programsdisplayedinsiteinfo.add(driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
		}
		programsdisplayedinsiteinfo.removeAll(Arrays.asList("", null));
		Collections.sort(programsdisplayedinsiteinfo);
	}


	@Step("Site details verified succesfully")
	public void sitedetails() throws Exception {
		Thread.sleep(3000);
		List<WebElement> rowsbeforedel=driver.findElements(By.xpath("/html/body/form/div[3]/div[5]/div[2]/div[1]/div[11]/div/div[2]/div[2]/div/table/tbody/tr"));
		int j=rowsbeforedel.size();
		for(int i=0;i<j;i++) {
			Thread.sleep(2000);
			List<WebElement> programnames=driver.findElements(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[5]"));
			if(driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[5]")).getText().equalsIgnoreCase(" ")) {
				driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[7]")).click();
				driver.findElement(By.xpath("//span[text()='Yes']")).click();
				programnames.clear();
				i=i-i;
				j=j-1;
			}
		}
		Helper.clickonElement(nxtbtn);
		for(int i=1;i<=j;i++) {
			Thread.sleep(1000);
			String siteprogram=check.get(0).getText();
			if(programsdisplayedinsiteinfo.contains(siteprogram)) {
				if(siteprogram.equalsIgnoreCase("Ambulatory Health Care")) {
					tab5sdfunction();
					tab5sdahcfunction();
					tab5sdahcSettingsfunction();
					tab5sdahcmdfunctionS();
				}
				if(siteprogram.equalsIgnoreCase("Rural Health Clinic")) {
					tab5sdrhcfunction2();
					tab5sdrhcfunction();
				}
				if(siteprogram.equalsIgnoreCase(" Rural Health Clinic")) {
					tab5sdrhcfunction2();
					tab5sdrhcfunction();
				}

			}
			else {
				tab5sd3fuction();

			}
		}
	}

}
