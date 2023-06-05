package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nop_login_POM {
	
	WebDriver driver;
	
	public nop_login_POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Email")
	WebElement t_mail;
	
	@FindBy(id="Password")
	WebElement t_pass;
	
	@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
	WebElement login;
	
	public void email(String Email)
	{
		t_mail.clear();
		t_mail.sendKeys(Email);
	}
	public void pass (String pass)
	{
		t_pass.clear();
		t_pass.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
	
	

}
