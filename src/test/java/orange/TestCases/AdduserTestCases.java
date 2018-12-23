package orange.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orange.Base.TestBase;
import orange.pages.AddUserPage;
import orange.pages.LoginPage;
import orange.pages.SystemUserPage;
import orange.util.TestUtil;

public class AdduserTestCases extends TestBase{
	
	LoginPage loginpage;
	SystemUserPage systemuserpage;
	TestUtil testutil;
	AddUserPage adduserpage;
	

	public AdduserTestCases()
	{
		super();
	}
	
	@BeforeTest
	public void setups_1(){
		initialization();
		testutil= new TestUtil();
		loginpage= new LoginPage();
		systemuserpage= new SystemUserPage();
		adduserpage= new AddUserPage();
	}
	
	@Test
	public void addnewuser() throws InterruptedException
	{
		loginpage.Login();
		Thread.sleep(2000);
		adduserpage=systemuserpage.AddButton();
		adduserpage.AddNewuser("ESS", "John Smith","sameh123","Enabled","P@ssw0rd0312234aa22", "P@ssw0rd0312234aa22");
		systemuserpage.SearchForUser("sameh123", "ESS", "Enabled", "John Smith");
		
            try{
		    	Assert.assertTrue(driver.findElement(By.linkText("sameh123")).isDisplayed());
			    System.out.println("user sameh123 added successfully ");
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
