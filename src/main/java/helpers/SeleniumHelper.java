package helpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public SeleniumHelper(WebDriver driver) {
		this.driver = driver;
		new SeleniumHelper();
	}

	public SeleniumHelper() {

	}

	public void EnterText(WebElement ele, String txt) throws InterruptedException {
		if (WaitforElement(ele) != null) {
			//ele.click();
			ele.clear();
			ele.sendKeys(txt);
		}

	}

	public WebElement WaitforElement(WebElement ele) throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public Boolean WaitforElementToDisappear(WebElement ele) throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.invisibilityOf(ele));

	}

	public void clickonElement(WebElement ele) throws InterruptedException {
		WaitforElement(ele).click();
		
	}

	public String captureScreenShot() {
		String screenShotFilePath = null;
		try {
			/*
			 * File scrFile = (File)((TakesScreenshot)new
			 * Augmenter().augment(this.driver)).getScreenshotAs(OutputType.FILE);
			 * 
			 * final String screenShotPah = String.valueOf(this.sAutomationPath) + "Results"
			 * + File.separator + this.sProjectName + File.separator + this.instanceName +
			 * File.separator + this.b + File.separator + this.getDate1() + File.separator +
			 * this.sModuleName + File.separator + this.e + File.separator; final File fi;
			 * if (!(fi = new File(screenShotPah)).exists()) { fi.mkdirs(); }
			 * FileUtils.copyFile(scrFile, new File(String.valueOf(screenShotPah) +
			 * this.sECName + "_" + this.sBrowser + "_" + this.iStepCount + ".png"));
			 * FileUtils.copyFileToDirectory(new File(String.valueOf(screenShotPah) +
			 * this.sECName + "_" + this.sBrowser + "_" + this.iStepCount + ".png"), new
			 * File(String.valueOf(this.getTempPath()) + "CurrentRunReports" +
			 * File.separator)); screenShotFilePath = "Screenshot:" + this.sECName + "_" +
			 * this.sBrowser + "_" + this.iStepCount + ".png";
			 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return screenShotFilePath;
	}

	public void EnableCheckbox(WebElement ele) throws InterruptedException {
		// TODO Auto-generated method stub
		WaitforElement(ele);
		if(!ele.isEnabled())
		{
		ele.click();
		}
		
	}

	public String GetText(WebElement ele) throws InterruptedException {
		// TODO Auto-generated method stub
		WaitforElement(ele);
		return ele.getText();
		
	}
	
	public WebElement getElements(WebElement ele)
	{
		return null;
	}

	public void clearText(WebElement ele) throws InterruptedException {
		
		 WaitforElement(ele);
		ele.clear();
		
	}

	public WebElement WaitforElementToBeClickable(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public boolean isElementDisplayed(WebElement ele) throws InterruptedException {
		WaitforElement(ele);
		return ele.isDisplayed();
		
	}

}
