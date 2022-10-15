package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartlogout {
	WebDriver driver;
	@FindBy(xpath="//div[text()='Anuja']")
	private WebElement Anuja;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logout;
	
	public flipkartlogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  public void clickAnuja() throws InterruptedException {
		Actions account=new Actions(driver);
        account.moveToElement(Anuja).perform();
        Thread.sleep(2000);
        }
  //public void clickonlogoutbutton() {
	  //logout.click();
		
	public void closepage() {
		//driver.quit();
	}
}
