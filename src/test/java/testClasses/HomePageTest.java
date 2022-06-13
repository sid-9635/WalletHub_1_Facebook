package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class HomePageTest extends BaseClass{
	
	HomePage homepage;
	LoginPage loginpage;
	 
	
	public HomePageTest() {
		super();	// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp()
	{
		initBrowser();
		homepage = new HomePage();
		loginpage = new LoginPage();
		loginpage.enterCredentials();
		
	}

	
	@Test
	public void creatingPostTest()
	{
	
		String st = homepage.creatingPost();
		Assert.assertEquals(st,"Hello World!!");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
