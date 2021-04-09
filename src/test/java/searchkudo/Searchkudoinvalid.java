package searchkudo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import resources1.base;
import testPackage.Searchkudo;

public class Searchkudoinvalid extends base{
@Test
public void  basepagenavigation() throws IOException, InterruptedException {
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
	sc.Clicksbt().click();
  	log1.info("displayed as please fill out the field ");
  	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot2.png"));
driver.close();
}
}
