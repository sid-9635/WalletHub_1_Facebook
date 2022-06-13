package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;
import utilities.Waits;

public class LoginPage extends BaseClass{


	@FindBy(id ="email") WebElement username;
	@FindBy(id = "pass") WebElement password;
	@FindBy(name = "login") WebElement loginButton;
	//@FindBy(xpath = "//*[@id='ssrb_top_nav_start']/following-sibling::div/div/a") WebElement facebookHomePageButton;
	public static String str;
	
	public LoginPage() {
	
		PageFactory.initElements(driver,this);
			
	}
	
	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
	
	public HomePage enterCredentials()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		
		Waits.waits(20).until(ExpectedConditions.urlContains("welcome"));
		
		str = driver.getCurrentUrl();
		
		return new HomePage();
		
	}
	
}
