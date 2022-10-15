package luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lumalogin {
WebDriver driver;
	
	@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	private WebElement password;

	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement loginButton;
	
	public lumalogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickonsign() {
		login.click();
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



