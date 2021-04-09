package sendPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.activi11;

import pageobjects.landingpage;
import resources1.base;

public class Sendkudo32 extends base {
	@Test
	public void basevavi11() throws IOException, InterruptedException, AWTException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened application");
		
		
		landingpage l=new landingpage(driver);
		l.Clickusername().sendKeys(prop.getProperty("un"));
		l.Clickpassword().sendKeys(prop.getProperty("psd"));
		l.Clicklogin().click();
		
		log1.info("successfully opened info");

		activi11 p= new activi11(driver);
		p.Clickkudos().click();
		
		p.Clickemail().sendKeys((prop.getProperty("email")));
		log1.info("name is entered successfully");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_ENTER);
        log1.info("successfully entered mail");
		driver.close();
	
}
}