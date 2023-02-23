package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method12 
{public static void main(String[] args) throws InterruptedException
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
	
	//To set position of the browser
	//Point P1=new Point(100,500); 		//X Y->pixels
	
	//driver.manage().window().setPosition(P1);			//100,500
	
	
	
	//To get position of the browser
	Point S2=driver.manage().window().getPosition();    //X and Y
	
	System.out.println(S2);
	
}
		
}
