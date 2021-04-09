
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class activi11
{

public WebDriver driver;
By kudos=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
By email=By.xpath("//input[@id='email_address']");
By box=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[6]/div[1]/div[1]");
By comment=By.xpath("//textarea[@id='comment']");
By send=By.xpath("//button[contains(text(),'Send')]");
By recent=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
By auto= By.xpath("//*[@id=\"email_address\"]");

public activi11(WebDriver driver) {
	this.driver=driver;
	}
	
public WebElement Clickkudos() {
	
	    return driver.findElement(kudos);
	}
	
	public void kudostype(String kudostype)	{
		WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
		kt.click();
	}
	public WebElement Clickemail() {
		return driver.findElement(email);}
	
	public WebElement Clickbox() {
		return driver.findElement(box);
}
	public WebElement Clickcomment() {
		return driver.findElement(comment);
}
	public WebElement Clicksend() {
		return driver.findElement(send);
		
}
	public WebElement Clickrecent() {
		return driver.findElement(recent);
	}
		
	
	public WebElement Clickauto() {
		return driver.findElement(auto);
	}
		
	
	}

