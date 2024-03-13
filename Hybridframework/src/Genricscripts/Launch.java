package Genricscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Util.Fetchpropertyfile;

public class Launch extends capturescreenshot
{
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser() throws FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(Fetchpropertyfile.fetcprop());
		}
	@AfterMethod
	public void closebrowser(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
	
	{
		capturescreenshot.get_photo(driver);
	}
		driver.close();
	}
}	


