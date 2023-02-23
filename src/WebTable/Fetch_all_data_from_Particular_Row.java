package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_all_data_from_Particular_Row
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
		
		//Fetch all data from particular Row
		
		for(int i=1; i<=3; i++)
		{
			WebElement S1=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]"));		//100
														//LHS(String)		"+i+"	RHS(String)
			
			String text=S1.getText();	//"100"
			
			System.out.println(text);
			
		}
	}
}
