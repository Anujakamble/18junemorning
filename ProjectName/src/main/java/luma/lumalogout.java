package luma;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lumalogout {
	WebDriver driver;
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement Anuja;
	@FindBy(xpath="(//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/'])[1]")
	private WebElement logout;
	
public lumalogout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickonanuja() {
	Anuja.click();
}
public void clickonlogout()  {
	logout.click();
    }
public void quit() {
	driver.quit();
}
}