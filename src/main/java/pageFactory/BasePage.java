package pageFactory;

import org.openqa.selenium.WebDriver;


import helpers.SeleniumHelper;

public class BasePage extends SeleniumHelper{
	public  WebDriver driver;
	public YourOrganizationPage OrgPage; 
	public  HomePage HomePage;
	public  LoginPage LoginPage;
	public ProgramsOrServices_Page ProgramServicesPage;
	public FederalOrState_Page FederalOrStatePage;
	public InitialOrEarlySurvey_Page InitialEarlySurveyPage;
	public SiteInformation_Page SiteInformationPage;
	public SurveyDetails_Page SurveyDetailsPage;
	public ApplicableManuals_Page ApplicableManualPage;
	public Summary_Page SummaryPage;
	public Submission_Page SubmissionPage;
	public AddAmbulatorySite AddAmbulatorySitePage; 
	public SeleniumHelper Helper;
	
	
	
	public BasePage()
	{
		
	}
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		//super(driver);
		this.driver = driver;
		new BasePage();
		initializePages();
		
		
	}
	
	public  void initializePages()
	{
		Helper = new SeleniumHelper(driver);
		LoginPage = new LoginPage(driver, Helper);
		OrgPage = new YourOrganizationPage(driver, Helper);
		HomePage = new HomePage(driver, Helper);
		ProgramServicesPage = new ProgramsOrServices_Page(driver, Helper);
		FederalOrStatePage = new FederalOrState_Page(driver, Helper);
		InitialEarlySurveyPage = new  InitialOrEarlySurvey_Page(driver, Helper) ;
		SiteInformationPage = new SiteInformation_Page(driver, Helper);
		SurveyDetailsPage = new SurveyDetails_Page(driver, Helper);
		ApplicableManualPage = new ApplicableManuals_Page(driver, Helper);
		SummaryPage = new Summary_Page(driver, Helper);
		SubmissionPage= new Submission_Page(driver, Helper);
		AddAmbulatorySitePage = new AddAmbulatorySite(driver, Helper);
		
		
	}

}
