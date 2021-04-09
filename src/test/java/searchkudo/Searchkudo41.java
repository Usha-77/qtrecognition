package searchkudo;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.landingpage;
import resources1.base;
import testPackage.Searchkudo;

public class Searchkudo41 extends base {
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

}
}