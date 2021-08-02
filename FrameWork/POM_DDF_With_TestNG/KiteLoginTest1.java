package POM_DDF_With_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest1 
{
	
	
	WebDriver driver;
	KiteLogin1 login1;
	KiteLogin2 login2;
	Sheet sh;
	KiteHome home;
	KiteDashboard_Options options;

	@BeforeClass
	
	public void openBrowser() throws EncryptedDocumentException, IOException ,Exception
	{
		Reporter.log("------------Open Browser------------");
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\workspace\\April21_A_Selenium\\TestData\\April21_A.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		
		login1=new KiteLogin1(driver);
		login2=new KiteLogin2(driver);
		home=new KiteHome(driver);
		
	}
	
	
	@BeforeMethod
	public void openApp() 
	{
		Reporter.log("---------------Open Kite App-------------");
	
		login1.username(sh.getRow(0).getCell(0).getStringCellValue());
		login1.password(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickbtn();
		login2.upin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.bntnext();
	}

	@Test
	
	public void HomePageVerfiy()
	{
		Reporter.log("---------Verify User ID-------------");
		
		String atulId = home.verifyUserID();
		String expId=sh.getRow(0).getCell(3).getStringCellValue();
		
		Reporter.log("------------Assertion----------");
		Assert.assertEquals(atulId, expId,"Both are Different");
	}
	
	@Test
	public void DashboardOptions()
	{
		Reporter.log("------------DashBoardoptions-------------");
		System.out.println(options);
		
	}
	@AfterMethod(enabled = false)
	public void close_App()
	{
		home.logoutBtN();
		home.logoutBtN();
	}
	
	@AfterClass
	public void close_Browser()
	{
		driver.close();
		
	}
}

