package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import testData.DataReader;
import utilities.Waits;

public class HomePage extends  BaseClass{

	@FindBy(xpath ="//span[contains(text(),\"What\")]") WebElement createPostTextbox;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div") WebElement createpostModalWindow;
	@FindBy(xpath = "//span[contains(text(),\"Post\")][1]") WebElement postButton;
	@FindBy(xpath = "//*[@id='ssrb_top_nav_start']/following-sibling::div/div/a") WebElement facebookHomePageButton;
	@FindBy(xpath = "//*[contains(text(),\"Hello World\")]") WebElement helloWorldText;
	
	
	public WebDriverWait wait; 
	public static String text = DataReader.ReadTextFile();
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String creatingPost()
	{
		
		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(facebookHomePageButton));
		facebookHomePageButton.click();


		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(createPostTextbox));
		createPostTextbox.click();
		
	
		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(createpostModalWindow));
		createpostModalWindow.sendKeys(text);
		
		
		Waits.waits(20).until(ExpectedConditions.elementToBeClickable(postButton));
		postButton.click();
		
		
		Waits.waits(20).until(ExpectedConditions.visibilityOf(helloWorldText));
		
		return helloWorldText.getText();
	}
		
}
