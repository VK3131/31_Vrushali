package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser3 
{
			//How to launch browser in selenium
		public static void main(String[] args)
		{
			//Step-1
			//parameter 1=Name of the Browser
			//parameter 2=Path of ChromeDriver.exe file
			
			System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
			
			//Create object of ChromeDriver class by providing reference of WebDriver(Interface)
			
			WebDriver driver=new ChromeDriver();      //Upcasting  //13 methods
			
			//To Enter URL
			driver.get("https://www.onlinesbi.sbi/");
			
		}
}
