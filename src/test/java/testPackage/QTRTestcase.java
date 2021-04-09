package testPackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.landingpage;

import java.io.File;
import java.io.IOException;



import resources1.base;

public class QTRTestcase extends base {
	@Test(dataProvider="getData")
	public void  basepagenavigation(String username,String password) throws IOException {
		
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened application");
		Assert.assertEquals(driver.getTitle(), "QTRecognition");
		log1.info("title is correct");
		
		//color
		
		WebElement element = driver.findElement(By.xpath("//div[@class='myHeading']"));
		String Golden=element.getCssValue("background-color");
		String hexHead=Color.fromString(Golden).asHex();
		if(hexHead.equals("#FECC160")) {
			System.out.println("color code is matched");
			
		}
		else {System.out.println("colour code is not matched ");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot.png"));
		}
		 element = driver.findElement(By.xpath("//div[@class='container']"));
		String white=element.getCssValue("background-color");
		String hexmid=Color.fromString(white).asHex();
		if(hexHead.equals("#939598")) {
			System.out.println("color code is matched");
			
		}
		else {System.out.println("colour code is not matched ");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot1.png"));
		}
		 element = driver.findElement(By.xpath("//div[@class='container']"));
		String navy=element.getCssValue("background-color");
		String hexfoo=Color.fromString(navy).asHex();
		if(hexHead.equals("#2A2559")) {
			System.out.println("color code is matched");
			
		}
		else {System.out.println("colour code is not matched ");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\intern 8\\Downloads\\Screenshot2.png"));
		}
		
		
		
		landingpage l=new landingpage(driver);
	l.Clickusername().sendKeys(prop.getProperty("un"));
	l.Clickpassword().sendKeys(prop.getProperty("psd"));
	l.Clicklogin().click();
	log1.info("successfully opened info");
	if(driver.getTitle().equals("QTrecognition")) {
		log1.info("title displayed");
	}
	
	
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