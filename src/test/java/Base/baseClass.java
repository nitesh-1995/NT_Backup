package Base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class baseClass 
{

	public static WebDriver driver;
	
	public void openBrowser(String browserName, String URL)
	{
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Interview Project\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Interview Project\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public static void screenShot(String FolderName, String FileName, String ExtensionName) throws IOException
	{
		File sourcefile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile= new File("F:\\Interview Project\\Automated Screenshots\\"+FolderName+"\\"+FileName+ExtensionName);
		
		FileHandler.copy(sourcefile, destFile);
	}
}
