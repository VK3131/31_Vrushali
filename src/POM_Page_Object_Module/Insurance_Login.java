package POM_Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Login 
{
		//POM-1
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//input[@id='email']")private WebElement Email;  //private WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));  //WE can also use this @FindBy(id="email")
	
	@FindBy(xpath="//input[@name='password']")private WebElement Password; //private WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	
	@FindBy(xpath="//input[@name='submit']")private WebElement Loginbtn;  //private WebElement Loginbtn=driver.findElement(By.xpath("//input[@name='submit']"));
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public Insurance_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public.
	
	public void EnterEmail(String EmailAddress)  //you can take this also (String EM)
	{
		Email.sendKeys(EmailAddress);   //sardeg41@gmail.com
	}
	
	public void EnterPassword(String password)
	{
		Password.sendKeys(password);		//sai@1117
	}
	
	public void ClickLoginbtn()
	{
		Loginbtn.click();
	}
}
