package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_With_TestNG 
{
	@Test
	public void OpenKiteLoginPage() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Hello() 
	{
	
		Reporter.log("Hello.........",true);
		
	}
	
	@Test
	public void T5()
	{
		//System.out.println("Ruunning Test.......");
		Reporter.log("Running Test............",true);
	}

}
