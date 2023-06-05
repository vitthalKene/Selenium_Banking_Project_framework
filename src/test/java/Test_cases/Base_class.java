package Test_cases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Base_class {
	
	public String baseURL="https://demo.guru99.com/v4";
	public String username="mngr504994";
	public String password="Ysajyre";
	public static WebDriver driver;
	
	//for testtcase_oo2
	
	public String url="https://admin-demo.nopcommerce.com/login";
	public String Email="admin@yourstore.com";
	public String pass="admin";
	
	
	
	@BeforeClass
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MSSquare Global\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown ()
	{
		driver.quit();
	}
	

}
