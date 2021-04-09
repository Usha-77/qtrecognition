
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage{
	public WebDriver driver;
	By username=By.xpath("//body/div[2]/form[1]/input[1]");
	By password=By.xpath("//body/div[2]/form[1]/input[2]");
	By login=By.xpath("//button[contains(text(),'Login')]");
	public landingpage(WebDriver driver) {
		this.driver=driver;}
		public WebElement Clickusername() {
			return driver.findElement(username);
		}
		public WebElement Clickpassword() {
			return driver.findElement(password);}
		public WebElement Clicklogin() {
			return driver.findElement(login);
	}
}