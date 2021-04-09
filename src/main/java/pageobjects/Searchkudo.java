package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchkudo {
	public WebDriver driver;
	By search=By.xpath("//span[contains(text(),'Kudos Search')]");
	By usrname=By.xpath ("//input[@id='s_e_add']");
	By sbt= By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]");
	
	public Searchkudo(WebDriver driver) {
		this.driver=driver;
		}
		
	public WebElement Clicksearch() {
		
		    return driver.findElement(search);
		}
	public WebElement Clickusrname() {
		
	    return driver.findElement(usrname);
	}
	public WebElement Clicksbt() {
		
	    return driver.findElement(sbt);
	}


}
