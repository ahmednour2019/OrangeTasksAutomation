package orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.Base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement usrname;

	
	@FindBy(id="txtPassword")
	WebElement passwrd;
	
	@FindBy(id="btnLogin")
	WebElement loginBTN;
	
	public void Login()
	{
		usrname.sendKeys("Admin");
		passwrd.sendKeys("admin123");
		loginBTN.click();
	}
	
}
