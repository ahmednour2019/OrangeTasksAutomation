package orange.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orange.Base.TestBase;
import orange.pages.LoginPage;
import orange.util.TestUtil;

public class LoginTest extends TestBase {
	
	LoginPage loginpage;
	TestUtil testutil;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeTest
	public void setups_1(){
		initialization();
		testutil= new TestUtil();
		loginpage= new LoginPage();
	}
	
	@Test
	public void TestLogin()
	{
		loginpage.Login();
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
