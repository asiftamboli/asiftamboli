package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example_MultiBrowser_Testing 
{
	@Parameters("browsername")
	@Test
	public void TC(String browsername) throws InterruptedException
	{		
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\April21_A_selenium_Software\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
		}
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");	
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
}
}
