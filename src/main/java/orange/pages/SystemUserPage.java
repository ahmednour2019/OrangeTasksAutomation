package orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orange.Base.TestBase;

public class SystemUserPage extends TestBase{
	
	
	@FindBy(id="searchSystemUser_userName")
    WebElement  UsrnameBTN;
	@FindBy(id="searchSystemUser_employeeName_empName")
    WebElement  EmployeeNameBTN;
	@FindBy(id="searchBtn")
	WebElement  SearchBTN;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminTAB;
	@FindBy(id="btnAdd")
	WebElement AddBTN;
	

	
	public SystemUserPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void SearchForUser(String username,String role,String status,String employeename)
	{
		AdminTAB.click();
		UsrnameBTN.sendKeys(username);	
		Select x= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		x.selectByVisibleText(role);
		Select y= new Select(driver.findElement(By.id("searchSystemUser_status")));
		y.selectByVisibleText(status);
		EmployeeNameBTN.sendKeys(employeename);
		SearchBTN.click();
	}
	public AddUserPage AddButton()
	{
		AdminTAB.click();
		AddBTN.click();
		return new AddUserPage();
	}


}
