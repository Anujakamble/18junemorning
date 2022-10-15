package flipkart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartcart {
	WebDriver driver;
	@FindBy(xpath="(//span[text()='Cart'])")
	private WebElement cart;
	public flipkartcart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Tocart() {
		cart.click();		
		}
	public void switchtowindow() throws InterruptedException {
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
	}
	
	
        
		
	
}
