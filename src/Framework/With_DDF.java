package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
	//With Data Driver Framework
	
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
			
			//wait
			Thread.sleep(2000);
			
			//To Read data from Excel Sheet
			FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
			
			 Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet9");
			 
			
			//Enter Email
			String EmailAddress= Sh.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailAddress);
			
			//wait
			Thread.sleep(1000);
			
			//Enter password
			String Password=Sh.getRow(1).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			
			//wait
			Thread.sleep(2000);
			
			//Click login button
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			//wait
			Thread.sleep(2000);
			
			//Test case: Verify Email Address
			String ExpectedEmailAddress=Sh.getRow(2).getCell(0).getStringCellValue();
			
			WebElement S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
			
			String ActualEmailAddress=S1.getText();
			
			if(ExpectedEmailAddress.equals(ActualEmailAddress))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			//wait
			Thread.sleep(2000);
			
			//Close Browser
			driver.close();
		}
		
}
