package orange.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orange.Base.TestBase;
import orange.pages.LoginPage;
import orange.pages.SystemUserPage;
import orange.util.TestUtil;

public class SearchTestCase  extends TestBase{
	
	
	SystemUserPage systemuserpage;
	LoginPage   loginpage;
	TestUtil testutil;
	

	public SearchTestCase()
	{
		super();
	}
	
	@BeforeTest
	public void setups_1(){
		initialization();
		testutil= new TestUtil();
		loginpage= new LoginPage();
		systemuserpage= new SystemUserPage();
	}
	
	@Test
	public void TestLogin() throws InterruptedException
	{
		loginpage.Login();
		systemuserpage.SearchForUser("sameh123", "ESS", "Enabled","John Smith");
		Thread.sleep(2000);
	
		try{
			
			Assert.assertTrue(driver.findElement(By.linkText("sameh123")).isDisplayed());
			System.out.println("this user is exist");
		   }catch(Exception e)
		   {
			e.printStackTrace();
		   }

		
		
	}
	
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}


	
}
