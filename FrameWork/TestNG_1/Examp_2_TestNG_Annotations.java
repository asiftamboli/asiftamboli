package TestNG_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examp_2_TestNG_Annotations 
{
	WebDriver driver;
	@BeforeClass
	public void openBrowser()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Open Browser",true);
	}
	
	@BeforeMethod
    public void openToApp()
    {
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Open The Kite App",true);
		
    }
	@Test
	public void LoginToApp()
	{
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
		Reporter.log("Enter the Details",true);
	}
	@Test
	public void clickBtn()
	{
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Reporter.log("Perform Button",true);
		
	}
	@Test(dependsOnMethods = "clickBtn")
	public void pinVerify()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='PIN']")).sendKeys("959594");
		Reporter.log("fill the Pin",true);
	}
	@AfterMethod
	public void logoutApp()
	{
		Reporter.log("logout App",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
		Reporter.log("close Browser",true);
	}
}
