package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.LoginPage;

public class testcase_001 extends Base_class {
	
	@Test
	public void loginTest ()
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		
		
		lp.setUserPassword(password);
		lp.clickSubmit();
		
		
		//For checking whether our home page is displayed or not
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}
	

}
