package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_Disable_Exeution_Fromlass 
{
	@Test
	public void Tc1()
	{
		Reporter.log("Running Test 1..",true);
	}

	@Test(enabled = false)
	public void Tc2()
	{
		Reporter.log("Running Test 2..",true);
	}

	@Test
	public void Tc3()
	{
		Reporter.log("Running Test 3..",true);
	}

	@Test
	public void Tc4()
	{
		Reporter.log("Running Test 4..",true);
	}
}
