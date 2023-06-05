package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.nop_login_POM;

public class testcase_002 extends Base_class {
	
	@Test
	public void nop_login()
	{
		driver.get(url);
		
		nop_login_POM np=new nop_login_POM(driver);
		
		np.email(Email);
		np.pass(pass);
		np.login();
		
		
		if (driver.getTitle().equals("your store!"))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	

}
