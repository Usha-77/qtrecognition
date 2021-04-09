package otherpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.others;
import resources1.base;


	public class Kudofromme extends base
	{
	    @Test
	    public void  basepagenavigation1() throws IOException {
	    	driver =initializeDriver();
	    	driver.get(prop.getProperty("url"));
	    	log1.info("successfully opened application");
	    	
	    	
	    	landingpage l=new landingpage(driver);
	    	l.Clickusername().sendKeys(prop.getProperty("un"));
	    	l.Clickpassword().sendKeys(prop.getProperty("psd"));
	    	l.Clicklogin().click();
	    	log1.info("successfully opened info");
	    
	   
	 
	         

	    others ok=new others(driver);
	    ok.kudosfromme().click();
	    String s1=ok.name().getText();
	    String s2=ok.username1().getText();
	    if(s1.equals(s2)) {
	      log1.info("Kudos is sent from me");}
	    }}
	    

	    

