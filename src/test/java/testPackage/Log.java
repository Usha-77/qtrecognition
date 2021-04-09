package testPackage;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import resources1.base;

public class Log extends base {
	
	
	@Test(dataProvider="getData")
	public void  basepagenavigation1(String username,String password) throws IOException {
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
	log1.info("successfully opened application");
	
	
	landingpage l=new landingpage(driver);
	l.Clickusername().sendKeys(prop.getProperty("un"));
	l.Clickpassword().sendKeys(prop.getProperty("psd"));
	l.Clicklogin().click();
	log1.info("successfully opened info");
	driver.close();
	}
	
		@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]="usha.suresh@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		data[1][0]="usha.suresh@qualitestgroup.com";
		data[1][1]="password2";
		log1.info("successfully entered first name and password");
		
		

		return data;
			
		
			}
		
		}


