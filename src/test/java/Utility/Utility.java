package Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseClass;

public class Utility extends baseClass
{
	public static void implicitWaitsInMillis(int timeMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeMillis));
	}
	
	public static void implicitWaitsInSec(int timeSec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSec));
	}
	//=============================================================================
	
	public static void explicitWaitsInMillisTillVisibility(int timeMillis, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofMillis(timeMillis));
			WDW.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void explicitWaitsInMillisTillClickable(int timeMillis, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofMillis(timeMillis));
			WDW.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void explicitWaitsInMillisTillSelected(int timeMillis, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofMillis(timeMillis));
			WDW.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void explicitWaitsInSecTillVisibility(int timeSec, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofSeconds(timeSec));
			WDW.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void explicitWaitsInSecTillClickable(int timeSec, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofSeconds(timeSec));
			WDW.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void explicitWaitsInSecTillSelected(int timeSec, WebElement element)
	{
			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofSeconds(timeSec));
			WDW.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	//====================================================================================
	
	
	public static void scrollByAxis(int x, int y)
	{
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		JSE.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void scrollIntoView(WebElement element)
	{
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		JSE.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	//=====================================================================================
	
}
