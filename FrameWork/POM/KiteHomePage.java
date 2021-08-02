package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyUserID()
	{
		String atulUserID = userID.getText();
		String expetedUserID = "DV1510";
		if(atulUserID.equals(expetedUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
