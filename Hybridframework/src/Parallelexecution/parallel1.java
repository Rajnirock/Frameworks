package Parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel1 
{
	public WebDriver driver;
	@Parameters({"browser"})
@Test
public void data1(String browser)	
{
 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
 System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
 if(browser.equals("firefox"))
 {
	 driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
 }
 else
 {
	 driver=new ChromeDriver();
	 driver.get("https://www.instagram.com");
 }
}

	}

