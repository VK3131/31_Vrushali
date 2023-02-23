package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_11
{
	public static void main(String[] args) throws InterruptedException
	{
		//Step 1
		//parameter 1=Name of Browser
		//parameter 2=Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");

		//Step 2 = Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL/ Open an Application 
		driver.get("file:///D:/Listbox/MultiSelectable%20Listbox.html");

		//wait
		Thread.sleep(2000);
		
		//Step-1 identify listbox and store it into an object
		WebElement Multiselectable=driver.findElement(By.xpath("//select[@id='1234']"));
		
		//Step-2 Create object of select class
		Select S1= new Select( Multiselectable);
		
		//step-3 call the methods
		 List<WebElement> S2=S1.getOptions();		//Addresses->4
		 
		 for(WebElement S3:S2)
		 {
			 String S4= S3.getText();
			 System.out.println(S4);
		 }
	}
}
