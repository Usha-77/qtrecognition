/*package TestPackage;



import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import resources1.base;

public class Sendrecent35 extends base {
	@Test

	public void basenavi12() throws IOException,InterruptedException {
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));	
		log1.info("successful");
		
		landingpage l=new landingpage(driver);
		l.Clickusername().sendKeys("usha.suresh@qualitestgroup.com");
		l.Clickpassword().sendKeys("P@ssw0rd");
		l.Clicklogin().click();
		log1.info("successfully opened info");

		
activi11 p= new activi11(driver);
p.Clickkudos().click();
p.Clickrecent().click();
p.Clickauto().click();
//Thread.sleep(5000);
//driver.close();

}}*/

package testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import resources1.base;

public class Sendrecent35 extends base {

@Test
public void basePageNavigation() throws IOException, InterruptedException, AWTException {

driver=initializeDriver();
driver.get(prop.getProperty("url"));
log1.info("Successfully opened the application");

landingpage l=new landingpage(driver);
l.Clickusername().sendKeys("usha.suresh@qualitestgroup.com");
l.Clickpassword().sendKeys("P@ssw0rd");
l.Clicklogin().click();
log1.info("successfully opened info");

log1.info("Successfully entered first name and last name the application");




activi11 p = new activi11(driver);

p.Clickrecent().click();

p.Clickauto().click();
Thread.sleep(5000);
driver.close();
}}
