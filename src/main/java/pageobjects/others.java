package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class others {
public WebDriver driver;
By kudosfromme=By.xpath("//span[contains(text(),'Kudos from me')]");
By kudotome=By.xpath("//span[contains(text(),'Kudos to me')]");
 By name = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[1]");
By username1 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
By count =By.xpath("//h5[@id='todayCount']");



public others(WebDriver driver) {
	this.driver=driver;
}
public WebElement name() {
	 return driver.findElement(name);
 }
 public WebElement username1() {
	 return driver.findElement(username1);
 }
 public WebElement count() {
	 return driver.findElement(count);
 }
 public WebElement  kudosfromme() {
	 return driver.findElement( kudosfromme);
 }
 public WebElement kudotome() {
	 return driver.findElement(kudotome);
 }
}
