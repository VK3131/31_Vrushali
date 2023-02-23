package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_1 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open Browser", true);
	}
	
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Login To App", true);
	}
	
	
	@Test							//Test case/Test method
	public void TC1()
	{
		//Verify Email-Address
		Reporter.log("Running method V1", true);
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("Logout From App", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close  Browser", true);
	}
}
