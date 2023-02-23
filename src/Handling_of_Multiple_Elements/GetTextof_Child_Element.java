package Handling_of_Multiple_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextof_Child_Element 
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
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
			//Close Hidden division pop-up
			driver.findElement(By.xpath("//button[@class='']")).click()
			
			//wait
			Thread.sleep(2000);
			
			//Enter "redmi note 10s"
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
			
			//wait
			Thread.sleep(2000);
			
			//Click on search Symbol
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			//Identify rating element 
			WebElement Rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
					
			//wait
			Thread.sleep(2000);
			
			//To get text of an element
			String S1=Rating.getText();
			
			System.out.println(S1);
					
					
		}
}
