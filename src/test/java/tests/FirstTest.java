package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({helpers.Listener.class})
public class FirstTest extends BaseTest {

	public FirstTest() throws IOException {
		super();
	}

	@Test(enabled=true,priority = 1)
	@Description("This Scenario covers vaildating the errors while adding Ambulatory Service and resolving errors")
	@Epic("TJC-PROLIFICS")
	@Feature("TJC")
	@Story("POC")
	@Severity(SeverityLevel.BLOCKER)
	public void FirstTestCase() throws Throwable {
		Pages.LoginPage.login(envData.get("Username").toString(), envData.get("password").toString());

		Pages.HomePage.StartApplication();
		
		  Pages.OrgPage.FillDemograhicInfo(envData); Pages.OrgPage.moveToOwnerShip();
		  Pages.ProgramServicesPage.FillProgramServices();
		  Pages.FederalOrStatePage.setBureauOfPrimaryHealth();
		  Pages.FederalOrStatePage.setRuralHealthClinic();
		  Pages.InitialEarlySurveyPage.setInitialOrEarlySurvey();
		  Pages.SiteInformationPage.programsinsiteinfo();
		  Pages.SiteInformationPage.sitedetails();
		  Pages.SurveyDetailsPage.setSurveyDetails();
		  Pages.ApplicableManualPage.tab7amfunction(); Pages.SummaryPage.setSummary();
		  Pages.SubmissionPage.ambulatoryerror();
		  Pages.AddAmbulatorySitePage.addsiteforambulatoryaftererror();
		 
	}

	@Test(enabled=true,priority = 2) 
	@Description("This Scenario demonstrates removing Ambulatory Service and validating only Rural Health")
	@Epic("TJC-PROLIFICS")
	@Feature("TJC")
	@Story("POC")
	@Severity(SeverityLevel.BLOCKER)
	public void SecondTestCase() throws Throwable {
		Pages.LoginPage.login(envData.get("Username").toString(), envData.get("password").toString());
		Pages.HomePage.StartApplication();
		Pages.OrgPage.FillDemograhicInfo(envData);
		Pages.OrgPage.moveToOwnerShip();
		Pages.ProgramServicesPage.leaveAmbulatory();
		Pages.ProgramServicesPage.SetAsstLivingCommunity();
		Pages.ProgramServicesPage.SetBehavioralHealthCare();
		Pages.ProgramServicesPage.SetCriticalAccessHospital();
		Pages.ProgramServicesPage.SetHomeCare();
		Pages.ProgramServicesPage.LEAVEHOME();
		Pages.ProgramServicesPage.SetHositalServices();
		Pages.ProgramServicesPage.SetLaboratoryServices();
		Pages.ProgramServicesPage.SetNursingCareServices();
		Pages.ProgramServicesPage.SetOfficeBasedServices();
		Pages.ProgramServicesPage.OPTRHC();
		Pages.ProgramServicesPage.selectedpragrammesintab2();
		Pages.FederalOrStatePage.setBureauOfPrimaryHealth();
		Pages.FederalOrStatePage.setRuralHealthClinic();
		Pages.InitialEarlySurveyPage.setInitialOrEarlySurvey();
		Pages.SiteInformationPage.programsinsiteinfo();
		Pages.SiteInformationPage.sitedetails();
		Pages.SurveyDetailsPage.tab6adfunction();
		Pages.SurveyDetailsPage.tab6coifunction();
		Pages.SurveyDetailsPage.tab6eidfunction();
		Pages.SurveyDetailsPage.tab6distfunctionwithoutambulatorsite();
		Pages.SurveyDetailsPage.tab6obserfunction();
		Pages.SurveyDetailsPage.tab6trainsfunction();
		Pages.SurveyDetailsPage.tb6ohrfunction();
		Pages.SurveyDetailsPage.tab6hrrhcfunction();
		Pages.SurveyDetailsPage.tab6hrsoprhcfunction();
		Pages.ApplicableManualPage.tab7amfunction();
		Pages.SummaryPage.setSummary();
	}

	@Test(enabled=true,priority = 3)
	@Description("This Scenario Demonstrates Adding Ambulatory Service")
	@Epic("TJC-PROLIFICS")
	@Feature("TJC")
	@Story("POC")
	@Severity(SeverityLevel.BLOCKER)
	public void ThirdTestCase() throws Throwable {
		Pages.LoginPage.login(envData.get("Username").toString(), envData.get("password").toString());
		Pages.HomePage.StartApplication();
		Pages.OrgPage.FillDemograhicInfo(envData);
		Pages.OrgPage.moveToOwnerShip();
		Pages.ProgramServicesPage.SetAmbulatoryHealthCare();
		Pages.ProgramServicesPage.SetAsstLivingCommunity();
		Pages.ProgramServicesPage.SetBehavioralHealthCare();
		Pages.ProgramServicesPage.SetCriticalAccessHospital();
		Pages.ProgramServicesPage.SetHomeCare();
		Pages.ProgramServicesPage.LEAVEHOME();
		Pages.ProgramServicesPage.SetHositalServices();
		Pages.ProgramServicesPage.SetLaboratoryServices();
		Pages.ProgramServicesPage.SetNursingCareServices();
		Pages.ProgramServicesPage.SetOfficeBasedServices();
		Pages.ProgramServicesPage.OPTRHC();
		Pages.FederalOrStatePage.setBureauOfPrimaryHealth();
		Pages.FederalOrStatePage.setRuralHealthClinic();
		Pages.InitialEarlySurveyPage.setInitialOrEarlySurvey();
		Pages.SiteInformationPage.programsinsiteinfo();
		Pages.SiteInformationPage.sitedetails();
		Pages.AddAmbulatorySitePage.addsiteforambulatory();
		Pages.SurveyDetailsPage.tab6adfunction();
		Pages.SurveyDetailsPage.tab6coifunction();
		Pages.SurveyDetailsPage.tab6eidfunction();
		Pages.SurveyDetailsPage.tab6distfunctionwithambulatorysite();
		Pages.SurveyDetailsPage.tab6obserfunction();
		Pages.SurveyDetailsPage.tab6surambfunction();
		Pages.SurveyDetailsPage.tab6trainsfunction();
		Pages.SurveyDetailsPage.tb6ohrfunction();
		Pages.SurveyDetailsPage.tab6hrahcfunction();
		Pages.SurveyDetailsPage.tab6hrrhcfunction();
		Pages.SurveyDetailsPage.tab6hrsopahcfunction();
		Pages.SurveyDetailsPage.tab6hrsoprhcfunction();
		Pages.ApplicableManualPage.tab7amfunction();
		Pages.SummaryPage.setSummary();

	}
	
	
	@Test(enabled=true,priority = 4)
	@Description("Scenario 4 which demonstrates PDF Content comparision")
	@Epic("TJC-PROLIFICS")
	@Feature("TJC")
	@Story("POC")
	@Severity(SeverityLevel.BLOCKER)
	public void FourthtTestCase() throws Throwable {
		System.out.println("Fourth");
		
		utils.PdfExtractLinebyLine.pdfComparision(3);
		
	}
	
	@Test(enabled=true,priority = 5)
	@Description("Scenario 5 which demonstrates Failed Case")
	@Epic("TJC-PROLIFICS")
	@Feature("TJC")
	@Story("POC")
	@Severity(SeverityLevel.BLOCKER)
	public void FifthtTestCase() throws Throwable {
		System.out.println("Fifth");
		String loginStatus = Pages.LoginPage.login(envData.get("Username").toString(),"Welcome");		
		Assert.assertNotEquals(loginStatus, "Login Failed", "Login failed with the provided credentials");
		
	}

}
