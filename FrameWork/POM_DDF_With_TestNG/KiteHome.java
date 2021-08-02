package POM_DDF_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement uid ;
	@FindBy(xpath="//span[text()='DV1510']") private WebElement clickbtn;
	@FindBy(xpath = "//a[@href='/logout']") private WebElement logoutbtn;
	
	
	// 2. initialization
	public KiteHome (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyUserID() 
	{
		String atulText=uid.getText();
		return atulText;
	}
	
	public void logoutBtN()
	{

	
		clickbtn.click();
		logoutbtn.click();
	}

}
