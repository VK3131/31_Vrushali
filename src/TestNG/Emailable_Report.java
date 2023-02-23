package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test		//Test case/Test method
	public void V1()
	{
		Reporter.log("Running method V1", true);
	}
	
	@Test		//Test case/Test method
	public void K1()
	{
		//Assert.fail();
		Reporter.log("Running method K1", true);
	}
	
	@Test		//Test case/Test method
	public void D1()
	{
		Reporter.log("Running method D1", false);
	}
	
	@Test		//Test case/Test method
	public void V2()
	{
		Reporter.log("Running method V2");
	}
	
	@Test
	public void m5()
	{
		System.out.println("Running method m5");
	}
}
