//1=open browser  2=Open Kite application  3=click on "Forgot User ID or Password"


package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_6 
{
	public static void main(String[] args) throws InterruptedException
	{
		//step-1
		//parameter-1=Name of the Browser
		//parameter-2=Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL/open an Application
		driver.get("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//Click "Forgot UserID or Password"
		driver.findElement(By.xpath("//a[@class='text-light forgot-link']")).click();
	}
}
