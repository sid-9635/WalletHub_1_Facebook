package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop; 
	public static WebDriver driver; 
	public static FileInputStream fis;
	public static WebDriverWait wait;
	
	public BaseClass()
	{
		try
		{
			String currentDirectory = System.getProperty("user.dir");
			prop = new Properties();
			//fis = new FileInputStream("C:\\Users\\Shree\\wps\\WalletHub_Facebook\\src\\main\\java\\configProperties\\config.properties");
			fis = new FileInputStream(currentDirectory+"\\src\\main\\java\\configProperties\\config.properties");
			prop.load(fis);
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initBrowser()
	{
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		}
	
	
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	public static void ExplicitlyWaits(int seconds)
	{
		wait = new WebDriverWait(driver, seconds);
		
	}
	
}
