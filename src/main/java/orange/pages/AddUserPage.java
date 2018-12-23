package orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orange.Base.TestBase;

public class AddUserPage extends TestBase{
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement Employename;
	
	@FindBy(id="systemUser_userName")
	WebElement  username;
	
	@FindBy(id="systemUser_password")
	WebElement pawword;
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpassord;
	@FindBy(id="btnSave")
	WebElement  ClickSaveBTN;
	
	
	
	public AddUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddNewuser(String role, String employee,String user,String status,String pssword, String confrmpasswrd)
	{
		Select x= new Select(driver.findElement(By.id("systemUser_userType")));
		x.selectByVisibleText(role);
		Employename.sendKeys(employee);
		username.sendKeys(user);
		Select y= new Select(driver.findElement(By.id("systemUser_status")));
		y.selectByVisibleText(status);
		pawword.sendKeys(pssword);
		confirmpassord.sendKeys(confrmpasswrd);
		ClickSaveBTN.click();
	}


}
