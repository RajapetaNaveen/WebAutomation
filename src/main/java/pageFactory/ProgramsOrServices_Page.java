package pageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;

public class ProgramsOrServices_Page extends BasePage {
	public WebDriver driver;
	public SeleniumHelper Helper;
	public  ArrayList<String>  programsselectedintab2=new ArrayList<String>();
	public ArrayList<String> programsdisplayedinsiteinfo=new ArrayList<String>();
	public String msg = "Please contact your Account Executive. The Rural Health Clinic service option must be removed by your Account Executive due to the Deemed Status selection and information within your application.";

	public ProgramsOrServices_Page(WebDriver driver, SeleniumHelper Helper) {
		this.Helper = Helper;
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgAhc")
	WebElement YESAHC;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgAhc_1")
	WebElement NOAHC;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucSelAhcPrgs_dlService_ctl00_cbService")
	WebElement dental;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucPCMH_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement pcmh;

	@FindBy(id = "ctl00_ctl00_tjcPageNavigation_NextButton")
	WebElement nxtbtn;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucrblSelNo_dlQuestion_ctl00_lblYesNoQuestionDesc")
	WebElement nodiag;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucrblSelNo_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement noOFB;

	@FindBy(xpath = "//span[text()='Ok']")
	WebElement Okbtn;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Yesbtn;

	@FindBy(xpath = "//div[@id='divDiscard']")
	WebElement err;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement cancel;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgAlc_1")
	WebElement ALC;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgBhc_1")
	WebElement BHCH;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail3_hylkListSubItemLeftRail")
	WebElement CAH;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail4_hylkListSubItemLeftRail")
	WebElement HC;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail4_hylkListSubItemLeftRail")
	WebElement HOME;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail5_hylkListSubItemLeftRail")
	WebElement HOSP;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail6_hylkListSubItemLeftRail")
	WebElement LAB;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail7_hylkListSubItemLeftRail")
	WebElement NCC;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail8_hylkListSubItemLeftRail")
	WebElement OBS;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgRhc_0")
	WebElement YESRHC;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgRhc_1")
	WebElement NORHC;

	@FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']//following::p")
	WebElement txtbox;

	@FindBy(xpath = "//li[@class='tjcLeftSubMenuCellCompleted']")
	List<WebElement> prgms;

	@FindBy(id = "ctl00_ctl00_tjcTopMenu_TopMenuItem1TopMenuLinkCell")
	WebElement tab2;

	@FindBy(xpath = "//li[@class='tjcLeftSubMenuCellNormal']")
	List<WebElement> nonprg;

	@FindBy(id = "ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail9_hylkListSubItemLeftRail")
	WebElement rurbtn;

	@FindBy(id = "ctl00_ctl00_tjcTopMenu_TopMenuItem2TopMenuLinkCell")
	WebElement tab3;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCNewYorkDOH_dlQuestion_ctl00_rblYesNoQuestion_1")
	WebElement FAHC;

	@FindBy(id = "ctl00_ctl00_cphBodyContent_imgLoading")
	WebElement loadingIcon;

	public void FillProgramServices() throws InterruptedException {
		SetAmbulatoryHealthCare();
		SetAsstLivingCommunity();
		SetBehavioralHealthCare();
		SetCriticalAccessHospital();
		SetHomeCare();
		LEAVEHOME();
		SetHositalServices();
		SetLaboratoryServices();
		SetNursingCareServices();
		SetOfficeBasedServices();
		RHCvalidation();
		OPTRHC();
		selectedpragrammesintab2();
		System.out.println(programsselectedintab2);

	}

	@Step("Ambulatory Service is opted")
	public void SetAmbulatoryHealthCare() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(YESAHC);
		Helper.clickonElement(dental);
		Helper.clickonElement(pcmh);
		Helper.clickonElement(nxtbtn);

	}

	@Step("Ambulatory service is not opted")
	public void leaveAmbulatory() throws InterruptedException {

		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(NOAHC);
		if (Helper.WaitforElement(nodiag) != null) {
			Helper.clickonElement(noOFB);
			Helper.clickonElement(Okbtn);
			Helper.clickonElement(Yesbtn);
		}
		Helper.clickonElement(nxtbtn);
	}

	@Step("Assistant Living Community is not opted")
	public void SetAsstLivingCommunity() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(ALC);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Behavioural Health Care is not opted")
	public void SetBehavioralHealthCare() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(BHCH);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Critical Access Hospital is not opted")
	public void SetCriticalAccessHospital() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(CAH);
		Helper.clickonElement(nxtbtn);
	}

	@Step("HomeCare is not opted")
	public void SetHomeCare() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(HC);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Homecare is not opted")
	public  void LEAVEHOME() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(HOME);
		Helper.clickonElement(nxtbtn);
	} 

	@Step("Hospital Service is not opted")
	public void SetHositalServices() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(HOSP);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Laboratory service is not opted")
	public void SetLaboratoryServices() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(LAB);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Nursing care Service is not opted")
	public void SetNursingCareServices() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(NCC);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Office Based Service is not opted")
	public void SetOfficeBasedServices() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(OBS);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Rural Health clinic Service is opted")
	public void OPTRHC() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(YESRHC);
		Helper.clickonElement(nxtbtn);
	}

	@Step("Rural Health Service is unremovable")
	public void RHCvalidation() throws InterruptedException {
		Helper.WaitforElementToDisappear(loadingIcon);
		Helper.clickonElement(NORHC);
		Helper.WaitforElement(txtbox);
		Helper.GetText(txtbox);
		if (Helper.GetText(txtbox).equalsIgnoreCase(msg)) {
			System.out.println("Rural Heath Clinic cannot be removed.Message Displayed:" + Helper.GetText(txtbox));
			Helper.clickonElement(Okbtn);
		} else {
			System.out.println("Rural Health Validation failed : ERROR IN TEXT OR NO TEXT");
		}
	}

	@Step("Programs seleceted in tab2")
	public void selectedpragrammesintab2() throws InterruptedException {
		Helper.clickonElement(tab2);
		Helper.clickonElement(rurbtn);
		String text1 = nonprg.get(0).getText();
		if (text1.contains("Ambulatory Health Care")) {
			Helper.clickonElement(tab2);
			for (int i = 0; i < prgms.size(); i++) {
				programsselectedintab2.add(prgms.get(i).getText());
			}
		} else {
			Helper.clickonElement(tab2);
			nonprg.get(0).click();
			for (int i = 0; i < prgms.size(); i++) {
				programsselectedintab2.add(prgms.get(i).getText());
			}
		}
		if (programsselectedintab2.contains("Ambulatory Health Care" + "\n" + "PCMH Certification")) {
			programsselectedintab2.remove("Ambulatory Health Care" + "\n" + "PCMH Certification");
			programsselectedintab2.add("Ambulatory Health Care");
		}
		if (programsselectedintab2.contains("Nursing Care Center" + "\n" + "Certification")) {
			programsselectedintab2.remove("Nursing Care Center" + "\n" + "Certification");
			programsselectedintab2.add("Nursing Care Center");
		}
		if (programsselectedintab2.contains("Laboratory")) {
			programsselectedintab2.remove("Laboratory");
		}
		if (programsselectedintab2.contains("Behavioral Health Care and Human Services" + "\n" + "Certification")) {
			programsselectedintab2.remove("Behavioral Health Care and Human Services" + "\n" + "Certification");
			programsselectedintab2.add("Behavioral Health Care and Human Services");
		}
		if (programsselectedintab2.contains("Critical Access Hospital" + "\n" + "PCMH Certification")) {
			programsselectedintab2.remove("Critical Access Hospital" + "\n" + "PCMH Certification");
			programsselectedintab2.add("Critical Access Hospital");
		}
		if (programsselectedintab2.contains("Hospital" + "\n" + "PCMH Certification")) {
			programsselectedintab2.remove("Hospital" + "\n" + "PCMH Certification");
			programsselectedintab2.add("Hospital");
		}
		Collections.sort(programsselectedintab2);
		Helper.clickonElement(tab3);

	}

}
