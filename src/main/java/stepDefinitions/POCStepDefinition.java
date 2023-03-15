package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.Given;

public class POCStepDefinition extends BaseTest   {
	
	@Given("launch Application from the url")
	public void launch_application_from_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Pages.LoginPage.login(envData.get("Username").toString(), envData.get("password").toString());
		Pages.HomePage.StartApplication();
	}



}
