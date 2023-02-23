package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method1 
{
	public static void main(String [] args)
	{
		//stpe 1
		//parameter 1=Name of the browser
		//parameter2=Path of ChromeDriver.exe
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_selenium\\1_Oct\\chromedriver.exe");
		
		//step 2
		//create object of ChromeDriver class by providing reference of WebDriver(interface)
		
		WebDriver driver=new ChromeDriver();
		
		//To Enter URL/open an Application
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_3miucgpazi_b&adgrpid=58726256533&hvpone=&hvptwo=&hvadid=617654029188&hvpos=&hvnetw=s&hvrand=13807697971098922257&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007785&hvtargid=kwd-933795851&hydadcr=5870_2362052&gclid=Cj0KCQiA5NSdBhDfARIsALzs2EDvgC4JXXXxO_P91rdm_DBZOTvs5h4__bCBpJ206ocI-UQef-1A-i0aAnsyEALw_wcB");
		
		
	}
}
