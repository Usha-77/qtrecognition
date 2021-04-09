package otherpackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.others;
import resources1.base;

public class kudotome62 extends base {
	

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
} 
@Test 



	public void KudToMe() throws IOException, InterruptedException, AWTException { 
	basepagenavigation(); 
    others ok=new others(driver); 
    ok.kudotome().click(); 

    String str=ok.name().getText(); 
    String Names=str.substring(0,4)+str.substring(7,11);//Varsini Bala 
    boolean var; 
	if(Names.equals("Usha Suresh")) { 
	var=true; 
	} 
	else { 
	var=false; 
	} 
	boolean actname=ok.username1().getText().contains("Usha Suresh"); 
	Assert.assertEquals(var, actname); 
	String str2=ok.username1().getText(); 

//System.out.println(str2); 
	String sender = str2.substring(str2.indexOf("") + 0, str2.indexOf("received an appreciation from")); 
	String check="appreciation from"; 
	String recepient = str2.substring(str2.indexOf(check) + check.length(), str2.indexOf(" on")); 
	log1.info("Sender Name is Valid"); 

	if(sender.equals(Names)) { 

	log1.info("Sender is correct"); 

	} 

	 if(!sender.equals(recepient)) { 

	log1.info("Sender received an kudos from other employee");  

	} 

	} 

	} 




	