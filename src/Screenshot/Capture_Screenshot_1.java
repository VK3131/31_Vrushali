package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot_1 
{
	//How to capture screenshot of webpage
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//step 1
		//parameter 1=Name of the browser
		//parameter2=Path of ChromeDriver.exe
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step 2
		//create object of ChromeDriver class by providing reference of WebDriver(interface)
		
		WebDriver driver=new ChromeDriver();			//Upcasting
		
		//To Enter URL/open an Application
		driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//Take screenshot of webpage
		//Typecast/downcasting/convert
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
		File Destination=new File("D:\\AUTOMATION TESTING\\Screenshot\\Screenshot_3.jpg");
		
		FileHandler.copy(Source, Destination);
		
	}
}
