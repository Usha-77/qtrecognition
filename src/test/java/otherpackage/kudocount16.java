package otherpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.activi11;
import pageobjects.landingpage;
import pageobjects.others;
import resources1.base;

public class kudocount16 extends base {
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
		}
		
	       
	      @Test
	        
	         public int  cnt1() throws InterruptedException {
	            others ok=new others(driver);
	            int vals=Integer.parseInt(ok.count().getText().split(" ")[0]);
	        return vals;
	        }
	      public void sendkudos() throws AWTException,InterruptedException{
	    	  activi11 p =new activi11(driver);
	    	  p.Clickkudos().click();
	    	  p.Clickemail().sendKeys((prop.getProperty("email")));
	    	  log1.info("name is entered");
	    	  Robot rb=new Robot();
	    	  rb.keyPress(KeyEvent.VK_DOWN);
	    	  Thread.sleep(1000);
	    	  rb.keyPress(KeyEvent.VK_ENTER);
	    	  log1.info("mail is entered successfully");
	    	  p.Clickbox().click();
	    	  p.Clickcomment().sendKeys("good work");
	    	  p.Clicksend().click();
	      }
	      public int countkudu2()  throws InterruptedException {
	    	  others ok=new others(driver);
	            int vals=Integer.parseInt(ok.count().getText().split(" ")[0]);
	        return vals;
	      }
	    	  
	   
	        @Test
	        public void testcase() throws IOException, InterruptedException, AWTException {
	            int bt=cnt1();
	            sendkudos();
	            Thread.sleep(10000);
	            int cmt=countkudu2();
	            if(bt<cmt)
	            {
	                System.out.println("count is increased");
	            }
	            else {
	                System.out.println("HI");
	            }
	      driver.close();  }
}
	     
