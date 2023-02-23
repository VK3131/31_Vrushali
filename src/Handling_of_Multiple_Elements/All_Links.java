package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links 
{
	//Handling of Multiple Elements/ Click on all links at same time
	
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
		
		//To Identify Links
		List<WebElement>AllLinks=driver.findElements(By.xpath("//a"));	//46
		
		for(WebElement S1:AllLinks)						//Sign up Login groups ...
		{
			System.out.println(S1.getText());			//Sign Up Login groups ...
		}
		
	}
}
