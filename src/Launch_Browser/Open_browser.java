package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_browser 
		//How to launch/open browser in selenium
{
		public static void main(String[] args)
		{
			//Step 1
			//parameter 1= Name of Browser
			//parameter 2=Path of ChromeDriver.exe file
			
			System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
			//D:\JAVA_SELENIUM\1_Oct
			
			//Step 2- Create object of ChromeDriver class
			ChromeDriver driver=new ChromeDriver();     //Classname objectname=new Classname();
			
		}
}
