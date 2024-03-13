package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Genricscripts.basepage;

public class pom_facebook extends basepage {
	//declaration
			@FindBy(name="email")
			private WebElement Username;
			
			@FindBy(id="pass")
			private WebElement password;
			
			@FindBy(name="login")
			private WebElement login;
			
			//initialization
			public pom_facebook(WebDriver driver)
			{
				super(driver);
			}
			//utilization
			public void passData(String un)
			{
				Username.sendKeys(un);
			}
			public void passData1(String pwd)
			{
				password.sendKeys(pwd);
			}
			public void passData2()
			{
				login.click();
			}
		}


