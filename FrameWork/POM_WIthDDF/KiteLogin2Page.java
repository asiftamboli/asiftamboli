package POM_WIthDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement clikbtn;
	
	public KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void upin() 
	{
		pin.sendKeys("959594");
		
		
	}
	public void btn()
	{
		clikbtn.click();
		
	}
}
