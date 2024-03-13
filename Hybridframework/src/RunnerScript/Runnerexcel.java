package RunnerScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import Genricscripts.Launch;
import Genricscripts.excel;
import Pom.pom_facebook;

public class Runnerexcel extends Launch
{
	@Test
	public void data() throws InterruptedException
	{
		pom_facebook p = new pom_facebook(driver);
		p.passData(excel.getdata("sheet1",0, 0));
		Thread.sleep(500);
		p.passData1(excel.getdata("sheet1",1 , 0));
		Thread.sleep(500);
		p.passData2();
		Assert.fail();
	}
	}


