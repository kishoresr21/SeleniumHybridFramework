package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(xpath=".//*[@id='ember978']")
	WebElement formuser;
	@FindBy(xpath=".//*[@id='ember980']")
	WebElement formpass;
	@FindBy(xpath=".//*[@id='ember982']")
	WebElement formbtn;
	
	public void Login(String a,String b) throws InterruptedException
	{  // System.out.println(user);
		System.out.println("Login method called");
		formuser.sendKeys(a);
		Thread.sleep(1000);
		formpass.sendKeys(b);
		Thread.sleep(1000);
		formbtn.click();
		Thread.sleep(1000);
   }
   }
