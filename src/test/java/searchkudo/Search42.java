package searchkudo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.landingpage;
import resources1.base;
import testPackage.Searchkudo;

public class Search42 extends base {
	@Test

	public void  basepagenavigation() throws IOException, InterruptedException, AWTException {
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));	
		log1.info("successful");
		
		landingpage l=new landingpage(driver);
		l.Clickusername().sendKeys("usha.suresh@qualitestgroup.com");
		l.Clickpassword().sendKeys("P@ssw0rd");
		l.Clicklogin().click();
		log1.info("successfully opened info");
		
		Searchkudo sc=new Searchkudo(driver);
		sc.Clicksearch().click();
		sc.Clickusrname().sendKeys((prop.getProperty("email")));
		log1.info("ename is entered successfully");
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_DOWN);
  	  Thread.sleep(1000);
  	  rb.keyPress(KeyEvent.VK_ENTER);
  	  log1.info("mail is entered successfully");
  	sc.Clicksbt().click();
  	log1.info("kudo is sent ");
  	driver.close();
	}
}