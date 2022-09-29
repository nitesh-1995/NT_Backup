package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;

public class LoginPage 

{
	@FindBy(xpath = "//a[text()='Login']") private WebElement mainLoginLink;
	@FindBy(name = "email") private WebElement userId;
	@FindBy(name = "password") private WebElement pwd;
	@FindBy(xpath = "//div[text()='Login']") private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginlinkClick()
	{
		mainLoginLink.click();
	}
	
	public void insertUsername(String username)
	{
		userId.sendKeys(username);
	}
	
	public void insertPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void loginBtnClick()
	{
		loginBtn.click();
	}
}
