package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Example_TestNGAnnotations 
{
	
	//private ChromeDriver driver;
@FindBy(xpath = "//input[@id='userid']") private WebElement uid;
@FindBy(xpath="//input[@id='password']") private WebElement pwd;
@FindBy(xpath="//button[@class='button-orange wide']") private WebElement clickBtn;
@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
@FindBy(xpath = "//img[@alt='Kite logo']") private WebElement logo;
@FindBy(xpath = "//a[@href='/logout']") private WebElement logoutclick;



public Example_TestNGAnnotations (WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
	

	@BeforeClass
	public void openBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		uid.sendKeys("DV1510");
		pwd.sendKeys("Year@123");
		clickBtn.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void EnterPin() throws InterruptedException 
	{
		pin.sendKeys("959594");
		clickBtn.click();
		
		Thread.sleep(1000);
	}
   @Test(priority = 3)
	public void useidVerify() throws InterruptedException 
	{
		String atualId = userid.getText();
		String exptedualId = "DV1510";
		if(atualId.equals(exptedualId))
		{
			Reporter.log("User DV1510 are verifyed user----Test Pass",true);
		}
		else
		{
			Reporter.log("User Id Not verify-----Test Fail",false);
		}
		Thread.sleep(1000);
		
	}
    
    @Test(priority = 2)
    public void logoVerfy() throws InterruptedException
    {
    	boolean result = logo.isDisplayed();
    	System.out.println(result);
    	if(result==true)
    	{
    		Reporter.log("logo Displyed Verify is Suessfully",true);
    	}
    	else
    	{
    		Reporter.log("logo is Not displyed Sueesfuuly----Test Fail",false);
    	}
    	Thread.sleep(1000);
    }
    
	@AfterMethod
	public void logoutToApp() throws InterruptedException
	{
		userid.click();
		logoutclick.click();
		Thread.sleep(1000);
		
	}
@AfterClass
	public void closeToBrowser()
	{
	
		//driver.close();
	}
}
