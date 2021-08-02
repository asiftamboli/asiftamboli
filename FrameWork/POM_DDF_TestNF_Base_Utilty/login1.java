package POM_DDF_TestNF_Base_Utilty;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement uid;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement clickBtn;
	
	public login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void usename(String usename) throws EncryptedDocumentException, IOException
	{
		uid.sendKeys(usename);
		
	}
	
	public void password(String password) throws EncryptedDocumentException, IOException
	{
		pwd.sendKeys(password);
		
	}
	public void ButtonNext() 
	{
		clickBtn.click();
		
	}
 
}
