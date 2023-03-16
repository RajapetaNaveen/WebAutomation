package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.BasePage;
import utils.ExcelUtil;






public class BaseTest {
	public Map<Object, Object> envData = new HashMap<Object, Object>();
	public Properties prop;
	public String browser;
	ExcelUtil excel = new ExcelUtil();
	public  WebDriver driver = null;
	public BasePage Pages;
	

	public BaseTest() {
		try {
			loadProperties();
			envData = ReadEnvironment();
			//getDriver();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadProperties() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
		prop.load(fis);
	}

	public Map<Object, Object> ReadEnvironment() throws IOException {
		envData = excel.GetRowData(new File(System.getProperty("user.dir")+prop.get("testEnvironmentPath").toString()),
				prop.get("SheetName").toString(), 1);
		String encryptedPassword=envData.get("password").toString();
		byte[] decrypt=Base64.getDecoder().decode(encryptedPassword);
		String decryptedPassword=new String(decrypt);
		envData.put("password", decryptedPassword);
		return envData;
	}

	
	@BeforeMethod
	public void LaunchApp(ITestResult result) {
		System.out.println("Before Method" + result.getMethod().getMethodName());
		if(!result.getMethod().getMethodName().contains("FourthtTestCase"))
		{
		getDriver().get(prop.getProperty("AUTurl"));
		}
	}
	
	public WebDriver getDriver()
	{
		if(hasQuit(driver))
		{
			browser = prop.get("browser").toString();
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			default:
				break;
			}
			Pages = new BasePage(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			return driver;
			
		}
		else
		{
			return driver;
		}
	}
	
	
	public String CaptureScreenshot(String testcaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File screen = new File(System.getenv("user.dir")+"//reports"+testcaseName+".png");
		FileUtils.copyDirectory(source, screen);
		return System.getenv("user.dir")+"//reports"+testcaseName+".png";
	}
	
	public static boolean hasQuit(WebDriver driver) {
		try {
	    return ((RemoteWebDriver)driver).getSessionId() == null;
		}
		catch (Exception e)
		{
			return true;
		}
	}
	
	@AfterMethod
	public void TearDown(ITestResult result)
	{
		System.out.println("After Method" + result.getMethod().getMethodName());
		if(!hasQuit(driver))
		{
		driver.quit();
		driver = null;
		}
	}
	@AfterTest
	public void quit()
	{
		System.out.println("After Test ");
		if(!hasQuit(driver))
		{
			driver.quit();
			driver = null;
		
		}
	}
}
