package TestRun;

import org.testng.annotations.Test;

import Base.baseClass;
import Utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class TestingLogin extends baseClass{
  
  @Parameters("BrowserName")
  @BeforeTest
  public void beforeTest(String browser) 
  {
	openBrowser(browser, "");
	Utility.scrollByAxis(0, 600);
  }
	  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @Test
  public void validateTC001()
  {
	  Reporter.log("TC Run", true);
  }
  @AfterMethod
  public void afterMethod() 
  {
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
