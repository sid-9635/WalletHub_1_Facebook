package utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class Waits extends BaseClass{

	public static WebDriverWait wait;
	
	public static WebDriverWait waits(int seconds)
	{
		 wait = new WebDriverWait(driver, seconds);
		 return wait;
	}
}
