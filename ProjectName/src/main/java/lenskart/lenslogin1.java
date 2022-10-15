package lenskart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lenslogin1 {
WebDriver driver;
	
	@FindBy(xpath="(//input[@name='login[username]'])[1]")
	private WebElement username;
	
	@FindBy(xpath="(//input[@name='login[password]'])[1]")
	private WebElement password;

	@FindBy(xpath="//button[@id='customerloginsubmit']")
	private WebElement loginButton;
	
	public lenslogin1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void enterusername() {
		username.sendKeys("anujakamble37@gmail.com");
		
	}
	public void enterpassword() {
		password.sendKeys("Anuja123");
	}
	public void clickOnloginbutton() {
		loginButton.click();
	}

	}



