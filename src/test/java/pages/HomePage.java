package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
		
	@FindBy(xpath=".//*[@id='utilities-list-dd']")
	WebElement MyAeo;
	
	@FindBy(xpath=".//*[@id='utilities-list-ul']/li[1]/a")
	WebElement SignIn;
	
	@FindBy(xpath=".//*[@id='ember882']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='ember884']")
	WebElement pass;
	
	@FindBy(xpath=".//*[@id='ember894']")
	WebElement BtnSignIn;
	
	@FindBy(xpath=".//*[class='modal-content']")
	WebElement form;
	
	
	public void LoginForm()
	{
		form.click();
	}

	
	public void MyAeo()
	{
		MyAeo.click();
	}
	public void SignInLink()
	{
		SignIn.click();
	}
	public void UserName()
	{
		username.click();
	}
	public void Password()
	{
		pass.click();
	}
	public void SignInBtn()
	{
		BtnSignIn.click();
	}
	public String getApplicationTitle()
	{
		return driver.getTitle();
		
	}
}
