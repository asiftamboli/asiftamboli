package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_grouping1
{
	@Test(groups = "Orders")
	public void Tc1()
	{
		Reporter.log("Running Test 1..",true);
	}

	@Test(groups = "fund")
	public void Tc2()
	{
		Reporter.log("Running Test 2..",true);
	}

	@Test(groups = "profile")
	public void Tc3()
	{
		Reporter.log("Running Test 3..",true);
	}

	@Test(groups = "profile")
	public void Tc4()
	{
		Reporter.log("Running Test 4..",true);
	}
	@Test(groups = "fund")
	public void Tc5()
	{
		Reporter.log("Running Test 5..",true);
	}

}
