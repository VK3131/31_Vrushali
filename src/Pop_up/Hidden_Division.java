package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division 
{
	//Hidden Division pop-up
	public static void main(String[] args) throws InterruptedException
	{
		//step-1
		//parameter-1=Name of the Browser
		//parameter-2=Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL/open an Application
		driver.get("https://www.flipkart.com/");
		
		//wait
		Thread.sleep(2000);
		
		//Enter Email/Mobile number
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc123@gmail.com");
		
		//wait
		Thread.sleep(2000);
		
		//Click Request OTP button
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}
		
}
