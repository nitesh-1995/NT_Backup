package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	@FindBy (id = "main-nav") private WebElement MenuBlock; 
	@FindBy (xpath= "//span[text()='Home']") private WebElement HomeLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void menuBlockOpen(WebDriver driver)
	{
		Actions Act= new Actions(driver);
		
		Act.moveToElement(MenuBlock).build().perform();	
	}
	
	public String getHomeLink(WebDriver driver)
	{
		String ActualResult = HomeLink.getText();
		return ActualResult;
	}
}
