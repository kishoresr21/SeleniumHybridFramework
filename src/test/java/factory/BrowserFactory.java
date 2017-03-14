package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("web.driver.chrome",DataProviderFactory.getConfig().getChromePath());
			driver =new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("web.ie.chrome",DataProviderFactory.getConfig().getIEPath());
			driver =new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	public static void closeBrowser(WebDriver ldriver)
	{
		driver.quit();
	}

}
