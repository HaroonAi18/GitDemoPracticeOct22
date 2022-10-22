package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class retailPageObjects extends Base{

	public retailPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//----------------Locators for Retail Page Features login information--------------------
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]")
	private WebElement textToValidate;
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement logInMyAccout;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmailTexBox;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement inputPasswordTextBox;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	//------------------End of Locators for login feature---------------------------------------
	
	//------------------------First Scenario Login on retail page features-----------------------
	public void validateMainPage()
	{
		String text = textToValidate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("Text Verified user is on the right page. ");
		}
		else
		{
			logger.info("Text is not matching.");
		}
	}
	
	public void clickOnMyAccount()
	{
		myAccountButton.click();
	}
	
	public void clickOnLogInRetailFeatureFirstLogin()
	{
		logInMyAccout.click();
	}
	
	public void enterUsername()
	{
		inputEmailTexBox.sendKeys("Ahmad.sherrif@gmail.com");
	}
	
	public void enterPassword()
	{
		inputPasswordTextBox.sendKeys("Password123@");
	}
	
	public void clickLogInButton()
	{
		loginButton.click();
	}
	//-------------------------End of First Scenario--------------------------------------------------
}
