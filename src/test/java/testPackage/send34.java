package testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import resources1.base;

public class send34 extends base {
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

		
activi11 p= new activi11(driver);
p.Clickkudos().click();
p.Clickemail().sendKeys((prop.getProperty("email")));
log1.info("name is  entered");
Robot rb =new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
rb.keyPress(KeyEvent.VK_ENTER);
log1.info("mail is entered successfully");
p.Clickbox().click();
p.Clickcomment().sendKeys("good work");
p.Clicksend().click();
log1.info(" email is sent successfully:confirmation msg is displayed");
log1.info("kudos sent is reflected in recent activity");
File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot7.png"));
log1.info("kudos sent is not reflected in activity page");
}}
