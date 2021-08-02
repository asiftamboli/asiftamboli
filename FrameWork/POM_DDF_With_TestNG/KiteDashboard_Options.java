package POM_DDF_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteDashboard_Options
{
	@FindBy(xpath = " //div[@class='app-nav']") private WebElement optiops;
	
	
	 public KiteDashboard_Options(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	 
	 public void home_diplay_option()
	 {
		 String Dashboard_options = optiops.getText();
		 System.out.println(Dashboard_options);
		
	}

}
