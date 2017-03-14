package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		driver=BrowserFactory.getDriver("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		//Thread.sleep(10000);
	}
	
	@Test
	public void testHomePage() throws InterruptedException
	{
		
	   
		//initElements method takes driver and the class we want to initialize
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		
		
		String title=home.getApplicationTitle();
		
		System.out.println(title);
		home.MyAeo();
		Thread.sleep(10000);
		home.SignInLink();
		System.out.println("SignIn Link clicked");
		Thread.sleep(10000);
	

	}
	@AfterMethod
	public void closeBrowser()
	{
		BrowserFactory.closeBrowser(driver);
	}

}
