package POM_Page_Object_Module;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_TestClass 
{
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
		{
			//step-1
			//parameter-1=Name of the Browser
			//parameter-2=Path of chromeDriver.exe file
			
			System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
			
			//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
			WebDriver driver=new ChromeDriver();		//Upcasting
			
			//To Enter URL/open an Application
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
			//To read data from ExcelSheet
			FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
			
		     Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet9");
			
			//Create Object of POM-1 Class
			Insurance_Login Login=new Insurance_Login(driver);
			
			//Enter Email
			String EM=Sh.getRow(0).getCell(0).getStringCellValue();   //saradeg41@gmail.com
			Login.EnterEmail(EM);
			
			//Enter Password
			String PSW=Sh.getRow(1).getCell(0).getStringCellValue();
			Login.EnterPassword(PSW);
			
			//Click Log in Button
			Login.ClickLoginbtn();
			
			
			
			//Create object of POM-2 Class
			Insurance_Broker_Insurance_Webpage Broker=new Insurance_Broker_Insurance_Webpage(driver);
			
			//To get Expected Result
			String Expected=Sh.getRow(2).getCell(0).getStringCellValue();  //sardeg41@gmail.com
			
			Broker.VerifyEmailAddress(Expected);
			
			
			//Click Log Out Button
			Broker.Clicklogoutbtn();
		}
}
