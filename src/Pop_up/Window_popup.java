package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup 
{
	
	//How to handle window pop-up/child browser pop-up
	
	public static void main(String[] args) throws InterruptedException
	{
		//step-1
		//parameter-1=Name of the Browser
		//parameter-2=Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step-2= Create a object of chromeDriver class by providing the reference of WebDriver (interface)
		WebDriver driver=new ChromeDriver();		//Upcasting
		
		//To Enter URL /open an Application
		driver.get("https://skpatro.github.io./demo/links/");
		
		//wait
		Thread.sleep(2000);
		
		//Click New Tab Button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//To get ID's
		Set<String> IDs=driver.getWindowHandles();				//mainpageID //childwindowID
	
		System.out.println(IDs);
	
	   ArrayList<String> al=new ArrayList<String>(IDs);		//mainpageID //childwindowID
	
	   //To get MainpageID
	   String MPID=al.get(0);		//MainpageID
	   System.out.println( MPID);
	   
	   //To  get ChildwindowID
	   String CWID=al.get(1);		//ChildwindowID
	   System.out.println(CWID);
	 
	   
	   //To  switch to window pop-up
	   driver.switchTo().window(CWID);
	   
	   //Click Training link
	   driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
	   
	 //wait
	 Thread.sleep(2000);
	 
	 //To switch to Main page
	 driver.switchTo().window(MPID);
	 
	//wait
	Thread.sleep(2000);
	
	//click New Window Button
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	}
}
