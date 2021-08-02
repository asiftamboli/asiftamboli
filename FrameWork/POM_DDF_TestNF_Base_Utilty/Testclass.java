package POM_DDF_TestNF_Base_Utilty;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jdi.Value;

public class Testclass extends Baseclass

{
	
	login1 l1;
	login2 l2;
	Home hm;
	int tid;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		Reporter.log("--------Open Browser--------");
		
		initializeBrowser();
		l1=new login1(driver);
		l2=new login2(driver);
		hm=new Home(driver);
		
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		Reporter.log("--------Open ZeroDha App--------");
		
		l1.usename(Utility.getTestData(1, 0));
		l1.password(Utility.getTestData(1,1));
		l1.ButtonNext();
		
		l2.pinid(Utility.readPropertyFileData("Pin"));
		l2.clickBtn();
		
	}
	@Test
	public void verifyUserId() throws EncryptedDocumentException, IOException
	{
		Reporter.log("--------Verify UserId----------");
		tid=100;
		String id = hm.userid();
		String expetedId = Utility.getTestData(1,3);
		Assert.assertEquals(id, expetedId,"Both Are Diffn");
		
	}
	
	@AfterMethod
	
	public void logout(ITestResult result) throws IOException
	{
		Reporter.log("--------Logout from ZeroDha App-------");
		Reporter.log("----Cpature SCreenshot only Failed Test Cases-------");
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.captureScreenshot(driver, tid);
		}
	}

	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("-----close The Browser------");
		driver.close();
		l1=null;
		l2=null;
		hm=null;
	}
}
