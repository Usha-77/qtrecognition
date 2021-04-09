package sendPackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import resources1.base;

public class Citation extends base{
	@Test(dataProvider = "comment")
	public void basenavi(String comment) throws IOException,InterruptedException {
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

p.Clickcomment().sendKeys(comment);
p.Clicksend().click();
Thread.sleep(5000);
driver.close();

	}

@DataProvider
public Object []comment()
{

	Object data[]=new Object[2];
	data[0]="hi";
     data[1]="";
     return data;
}


		
	}
