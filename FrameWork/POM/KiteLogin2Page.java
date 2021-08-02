package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Regula class----------POM class
public class KiteLogin2Page 
{
	
	//dec
	@FindBy(xpath="") private WebElement pin;
	@FindBy(xpath="") private WebElement contBtn;
	
	
	public KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void pin()
	{
		pin.sendKeys("959594");
	}
	public void clickcontBtn()
	{
		contBtn.click();
		
	}
}
