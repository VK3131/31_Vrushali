package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Curser 
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
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//wait
		Thread.sleep(2000);
		
		//Step-1= Identify element and Store it into an object
		 WebElement dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		//Step-2= Create objeect of Actions class
		Actions act=new Actions(driver);
		
		//Step-3=Call the method(Move Cursor)
		act.moveToElement(dropdown).perform();
		
		//wait
		Thread.sleep(2000);
		
		//Click windows option
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		
	}
}
