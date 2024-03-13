package RunnerScript;

import org.testng.annotations.Test;

import Genricscripts.*;
import Pom.pom_facebook;

public class Runnerfacebook extends Launch {
	@Test
	public void login() throws InterruptedException
	{
		pom_facebook p = new pom_facebook(driver);
		p.passData("abc");
		Thread.sleep(500);
		p.passData1("abc");
		Thread.sleep(500);
		p.passData2();
	}
	}

