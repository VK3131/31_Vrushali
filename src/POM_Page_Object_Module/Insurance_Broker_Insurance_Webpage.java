package POM_Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_Insurance_Webpage 
{
	//POM-2
	
		//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
		
		@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")private WebElement Signedinas; //private WebElement Signedinas=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
		
		@FindBy(xpath="//input[@class='btn btn-danger']")private WebElement LogoutBtn;  //private WebElement LogoutBtn=driver.findElement(aby.xpath("//input[@class='btn btn-danger']"));
		
		//2. Initialize within a constructor with access level public using pagefactory
		
		public Insurance_Broker_Insurance_Webpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilize within a method with access level public
		
		public void VerifyEmailAddress(String ExpectedEmail)
		{
			 String ActualEmail=Signedinas.getText();		//saradeg41@gmail.com
			 
			if(ExpectedEmail.equals(ActualEmail)) 
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		
		public void Clicklogoutbtn()
		{
			LogoutBtn.click();
		}
	}


