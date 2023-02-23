package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method5
{
	public static void main(String [] args) throws InterruptedException
	{
		//step 1
		//parameter 1=Name of the browser
		//parameter2=Path of ChromeDriver.exe
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step 2
		//create object of ChromeDriver class by providing reference of WebDriver(interface)
		
		WebDriver driver=new ChromeDriver();				//Upcasting
		
		//To Enter URL/ OPen an Application
		driver.navigate().to("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//To Enter URL/Open an Application
		driver.navigate().to("https://www.w3schools.com/html/");
		
		//wait
		Thread.sleep(2000);
		
		//To move backward
		driver.navigate().back();
		
		//wait
		Thread.sleep(2000);
		
		//To move forward
		driver.navigate().forward();
		
		//wait
		Thread.sleep(2000);
		
		//Refresh Webpage
		driver.navigate().refresh();
	}
}
