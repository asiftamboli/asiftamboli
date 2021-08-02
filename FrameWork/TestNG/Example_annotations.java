package TestNG;

import org.testng.Reporter;

public class Example_annotations 
{
	public void loginToApp()
	{
		Reporter.log("Open Browser",true);
		Reporter.log("Open App", true);
		
	}
	
	
	public void VerifyPIN() 
	{
		Reporter.log("Running App Verify PIn",true);
	}

	private void logout() 
	{
		Reporter.log(" ");
		
	}
	
}
