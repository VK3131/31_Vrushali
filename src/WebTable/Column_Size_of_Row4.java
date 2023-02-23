package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column_Size_of_Row4 
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
		driver.get("D://AUTOMATION TESTING//Table1.html");
		
		//wait
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//Find column size of Row 4
		
		 List<WebElement>AllColumn=driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));		//3
		
		 int Count=AllColumn.size();
		 
		 System.out.println(Count);
		
	}
}
