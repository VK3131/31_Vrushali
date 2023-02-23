package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		//step-1
		//parameter-1=Name of the Browser
		//parameter-2=Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL /open an Application
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//wait
		Thread.sleep(2000);
		
		//Enter customerID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
		
		//wait
		Thread.sleep(2000);
		
		//click submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//To switch to alert
		Alert Alt=driver.switchTo().alert();
		
		//wait
		Thread.sleep(2000);
		
		//click ok button
		Alt.accept();
		
		
		
		
	}
}
