package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF
{
	//Without Data Driver Framework
	
	public static void main(String[] args) throws InterruptedException
	{
		//step-1
		//parameter-1=Name of the Browser
		//parameter-2=Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL/open an Application
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		//wait
		Thread.sleep(2000);
		
		//Enter Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
		
		//wait
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
		
		//wait
		Thread.sleep(2000);
		
		//Click login button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Test case: Verify Email Address
		String ExpectedEmailAddress="saradeg41@gmail.com";
		
		WebElement S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
		
		String ActualEmailAddress=S1.getText();
		
		if(ExpectedEmailAddress.equals(ActualEmailAddress))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
