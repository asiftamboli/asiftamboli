package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_TestNg_annotations
{
	@BeforeClass
	public void openBrowse()
	{
		Reporter.log("Open To Browsee",true);
	}
	

	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("Open To App");
	}
	@Test(invocationCount = 4)
	public void enterUsername()
	{

		Reporter.log("Enter username");
	}
	@Test(priority = 1)
	public void pinverify()
	{
		Reporter.log("pin verify",true);
	}
	@AfterMethod
	
	public void logoutApp()
	{
		Reporter.log("logout to app",true);
		
	}
	
	@AfterClass
	public void quiteBrowser()
	{
		Reporter.log("quite Browser",true);
		
	}
}
