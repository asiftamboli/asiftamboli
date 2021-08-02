package POM_DDF_TestNF_Base_Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
	
	@FindBy(xpath = "//span[text()='DV1510']") private WebElement uid;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String userid()
	{
		String id = uid.getText();
		return id;
	}

}
