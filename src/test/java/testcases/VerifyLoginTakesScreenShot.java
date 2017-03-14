package testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;
import utility.Helper;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginTakesScreenShot {
	WebDriver driver;
	org.testng.log4testng.Logger logger;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{ 
		PropertyConfigurator.configure("C:\\Users\\kishore\\OnlineStore\\com.automation.framework\\log4j.properties");
		logger =org.testng.log4testng.Logger.getLogger(VerifyLoginTakesScreenShot.class);
		driver=BrowserFactory.getDriver("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		//Thread.sleep(10000);
	}
	
	@Test
	public void testHomePage() throws InterruptedException
	{
        HomePage home=PageFactory.initElements(driver,HomePage.class);
		
		
		String title=home.getApplicationTitle();
		System.out.println(title);
		logger.info("The title is displayed");
		home.MyAeo();
		
		//Thread.sleep(1000);
		home.SignInLink();
		System.out.println("SignIn Link clicked");
		logger.warn("The title is displayed");
		logger.error("The title is displayed");
		logger.fatal("The title is displayed");
		Thread.sleep(1000);
	   
		//initElements method takes driver and the class we want to initialize
		LoginPage lpage=PageFactory.initElements(driver,LoginPage.class);
		lpage.Login(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0,0, 1));
		
		
		
	}
	@AfterMethod
	public void closeBrowser(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path=Helper.captureScreenShot(driver, result.getName());
			logger.info(LogStatus.FAIL);
			logger.info(path);
		}
			BrowserFactory.closeBrowser(driver);
		
		
	}

}
