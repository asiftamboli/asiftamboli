package POM_DDF_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement clikbtn;
	
	public KiteLogin2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void upin(String upinid) 
	{
		pin.sendKeys(upinid);
		 
		
	}
	public void bntnext()
	{
		clikbtn.click();
	}

}
