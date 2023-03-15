package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.SeleniumHelper;
import io.qameta.allure.Step;



public class LoginPage extends BasePage {
	public WebDriver driver;
	public SeleniumHelper Helper;
	public LoginPage(WebDriver driver, SeleniumHelper Helper)
	{
		this.driver = driver;
		this.Helper = Helper;
		PageFactory.initElements(driver,this);
		
	}
	public LoginPage()
	{
		
	}

	@FindBy(id="MainContent__login_UserName")
	WebElement txtUserName;
	
	@FindBy(id="MainContent__login_Password")
	WebElement txtPassword;
	
	@FindBy(id="MainContent__login_LoginButton")
	WebElement btnLogin;
	
	@FindBy(id="userLoginDetails")
	WebElement LoginDetails;
	
	@Step("Log In Step")
	public String login(String UserName,String Password) throws InterruptedException
	{
		try {
			Helper.EnterText(txtUserName, UserName);
			Helper.EnterText(txtPassword, Password);
			Helper.clickonElement(btnLogin);
			return LoginDetails.getText();
		}
		
		catch (Exception e) {
			// TODO: handle exception
			return "Login Failed";
		}
		
		
	}
	
	
	
}
