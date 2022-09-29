package StepDefinitionFile;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import Base.baseClass;
import POM.HomePage;
import POM.LoginPage;
import Utility.Utility;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StudyBDD extends baseClass
{
	@Given("^I want to enter URL$")
	public void i_want_to_enter_URL(DataTable urlRead)
	{
	List<List<String>> StringDataURL = urlRead.raw();
		
	openBrowser("chrome", StringDataURL.get(0).get(0));
	  
	}
	
	@Given("^I click on Login Link$")
	public void i_click_on_Login_Link()
	{
	   LoginPage LP=  new LoginPage(driver);
	   
	   LP.loginlinkClick();
	}
	
	@Then("^I enter the Username and Password$")
	public void i_enter_the_Username_and_Password(DataTable UIDnPWD) throws InterruptedException
	{
		LoginPage LP= new LoginPage(driver);
	  for (Map<String, String> UIDNPWDdata : UIDnPWD.asMaps(String.class, String.class))
	  {
		  Utility.implicitWaitsInMillis(5000);
		  LP.insertUsername(UIDNPWDdata.get("userName"));
		  LP.insertPassword(UIDNPWDdata.get("password"));
	  }

	  
	}

	@When("^I click on login button$")
	public void i_click_on_login_button()
	{
		LoginPage LP= new LoginPage(driver);
		LP.loginBtnClick();
	}

	@Then("^I confirm Login validation$")
	public void i_confirm_Login_validation() 
	{
		Utility.implicitWaitsInMillis(5000);
		HomePage HP= new HomePage(driver);
		HP.menuBlockOpen(driver);
		Utility.implicitWaitsInMillis(5000);
		Assert.assertEquals("Home", HP.getHomeLink(driver));
		Reporter.log("TC001 Login Validation Successful");
	}

	@When("^I click on Welcome link$")
	public void i_click_on_Welcome_link()
	{
	
	}

	@Then("^I do logout operation$")
	public void i_do_logout_operation() throws Throwable 
	{
	    
	}

	@Then("^I close the window$")
	public void i_close_the_window() throws InterruptedException
	{
	   driver.close();
	}
}
