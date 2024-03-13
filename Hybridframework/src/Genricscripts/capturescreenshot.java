package Genricscripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshot 
{
public static void get_photo(WebDriver driver)
{
      Date d = new Date();
     String d1=d.toString();
     String da=d1.replaceAll(":", "_");
     TakesScreenshot tsc = (TakesScreenshot)driver;
     File tmp = tsc.getScreenshotAs(OutputType.FILE);
     File pmt = new File("./element_photo/"+da+".jpg");
     try
     {
    FileHandler.copy(tmp, pmt);
     }
     catch(IOException e) {
    	 System.out.println("photo is not capture");
    	 e.printStackTrace();
     }
}
}


