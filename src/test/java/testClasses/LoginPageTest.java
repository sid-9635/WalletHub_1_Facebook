package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class LoginPageTest extends BaseClass {
	
	HomePage homepage;
	LoginPage loginpage;
	
	public LoginPageTest() {
		super();// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp()
	{
		initBrowser();
		homepage = new HomePage();
		loginpage = new LoginPage();
		
	}
	
	@Test
	public void EnterCredentialsTest()
	{
		loginpage.enterCredentials();
		Assert.assertEquals(loginpage.str.contains("welcome"), true);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
