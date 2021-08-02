package POM_DDF_TestNF_Base_Utilty;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement BtN;
	
	public login2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pinid(String pinid) throws IOException
	{
		pin.sendKeys(pinid);
	}

	public void clickBtn()
	{
		BtN.click();
	}
}
