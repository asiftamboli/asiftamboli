package POM_DDF_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement uid;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement click;
	
	 public KiteLogin1(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	}
	 
	 public void username(String username) 
	 {
		 uid.sendKeys(username);
		
	}
	 public void password(String password) 
	 {
		 pwd.sendKeys(password);
		
	}
	 public void clickbtn() 
	 {
		 click.click();
		
	}

}
