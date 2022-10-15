package lenskart;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lenslogout {
	WebDriver driver;
	@FindBy(xpath="//div[text()='Anuja']")
	private WebElement Anuja;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logout;
	
	public lenslogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void switchtowindow() {
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(0));
	}
  public void clickAnuja()  {
		Actions account=new Actions(driver);
        account.moveToElement(Anuja).perform();
        }
  public void clickonlogoutbutton() {
	  logout.click();
		}
	public void close() {
		driver.quit();
	}
}


