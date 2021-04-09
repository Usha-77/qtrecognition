package testPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources1.base;

public class qttitle extends base {
	@Test
	public void nav() throws IOException {
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
	log1.info("successfully opened application");
	Assert.assertEquals(driver.getTitle(), "QTRecognition");
	log1.info("title is correct");
	
}
}
