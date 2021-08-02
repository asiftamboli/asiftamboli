package POM_WIthDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin1Page
{
	
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement Pwd;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement cllick;
	
	 public Kitelogin1Page(WebDriver driver) 
	 {
		 
		PageFactory.initElements(driver, this);
	}
	 public void uname(String Username) 
	 {
		username.sendKeys(Username);
	 }
	 public void password(String pwd)
	 {
		 Pwd.sendKeys(pwd);
	}

	 public void clikBtn() 
	 {
		 cllick.click();
		
	}
}
