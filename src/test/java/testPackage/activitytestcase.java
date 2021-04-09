package testPackage;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import resources1.base;

public class activitytestcase extends base {
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

		
activi11 p= new activi11(driver);
p.Clickkudos().click();

p.Clickemail().sendKeys("monika marudhavan(monika.marudhavanan@qualitestgroup.com)");
p.Clickbox().click();
String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Hard Worker","Team player"};
		for(int i=0;i<arr.length;i++) {
			p.kudostype(arr[i]);
			Thread.sleep(1000);
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot21.png"));
		}

p.Clickcomment().sendKeys("goodwork");
p.Clicksend().click();
}
}