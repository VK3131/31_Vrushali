package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method9 
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
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
		//To set size of Browser
		Dimension D1=new Dimension(400,700);
		
		driver.manage().window().setSize(D1);
	}
}
