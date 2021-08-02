package POM_WIthDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement uid;
	@FindBy(xpath="//a[@class='logo']") private WebElement logo;
	
	public KiteHomePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	public void verifyUserID() 
	{
		String atualId=uid.getText();
		String ExpId="DV1510";
		if(atualId.equals(ExpId))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public void logoverify() 
	{
		boolean result = logo.isDisplayed();
		if(result==true)
		{
			System.out.println("Logo Is Displyed");
		}
		else
		{
			System.out.println("Logo is not Displyed");
		}
		System.out.println(result);
		
	}
}
