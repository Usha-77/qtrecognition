package sendPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.activi11;

import pageobjects.landingpage;
import resources1.base;

public class Sendkudo31 extends base {
	@Test
	public void basevavi11() throws IOException, InterruptedException {
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
	Thread.sleep(5000);
	driver.close();
	}
}