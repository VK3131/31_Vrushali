package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser2 
{
	//How to launch/open browser in selenium
	
	public static void main(String[] args)
	{
		//Step-1
		//parameter 1=Name of the Browser
		//parameter 2=Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//Step-2
		//Create object of Chromedriver class by providing reference of WebDriver(Interface)
		
		WebDriver driver=new ChromeDriver();     //Upcasting
	}
}
