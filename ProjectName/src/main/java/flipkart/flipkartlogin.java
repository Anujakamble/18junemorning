package flipkart;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartlogin {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/account/login?ret=/']")
	private WebElement login;
	
	@FindBy(xpath="(//div[@class='IiD88i _351hSN'])[1]")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;
	
	public flipkartlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterusername() {
		username.sendKeys("7709058244");
		
	}
	public void enterpassword() {
		password.sendKeys("Anuja123");
	}
	public void clickOnloginbutton() {
		loginButton.click();
	}

}
