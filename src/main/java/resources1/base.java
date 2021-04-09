/*package resources1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class base {
public WebDriver driver;
public Properties prop;
public static org.apache.logging.log4j.Logger log1;

@BeforeSuite
public void bsuite() throws FileNotFoundException, IOException{
	String log4jConfigFile=("C:\\Users\\intern 8\\eclipse-workspace\\QTRegonition\\src\\main\\java\\resources1\\log4j2.xml");
ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4jConfigFile));
log1 = (Logger) LogManager.getLogger(base.class.getName());
}
public WebDriver initializeDriver() throws IOException {
	prop = new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\intern 8\\eclipse-workspace\\QTRegonition\\src\\main\\java\\resources1\\data.properties");

prop.load(fis);
String browsername = prop.getProperty("browser");
if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
}
else if(browsername.equals("Firefox")) {
	driver=new FirefoxDriver();
}
else {
	driver=new InternetExplorerDriver();
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
}*/
package resources1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class base {
public WebDriver driver;
public Properties prop;
public static org.apache.logging.log4j.Logger log1;
@BeforeSuite
public void Bsuite() throws FileNotFoundException, IOException {
String log4jConfigFile=("C:\\Users\\intern 8\\eclipse-workspace\\QTRegonition\\src\\main\\java\\resources1\\log4j2.xml");
ConfigurationSource source=new ConfigurationSource(new FileInputStream(log4jConfigFile));
Configurator.initialize(null,source);
log1=LogManager.getLogger(base.class.getName());
}
public WebDriver initializeDriver() throws IOException {
prop=new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\intern 8\\eclipse-workspace\\QTRegonition\\src\\main\\java\\resources1\\data.properties");
prop.load(fis);
String browsername=prop.getProperty("browser");
if(browsername.equals("chrome")) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
}
else if(browsername.equals("firefox")) {
driver=new FirefoxDriver();
}
else {
driver=new InternetExplorerDriver();
}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
return driver;
}
}
