package luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lumahomepage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Women']")
	private WebElement women;
	@FindBy(xpath="(//span[text()='Tops'])[1]")
	private WebElement tops;
	@FindBy(xpath="(//a[@href='https://magento.softwaretestingboard.com/breathe-easy-tank.html'])[2]")
	private WebElement tank;
	@FindBy(xpath="(//div[text()='XL'])[1]")
	private WebElement s;
	@FindBy(xpath="//div[@option-label='Purple']")
	private WebElement purple;
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement add;
	
public lumahomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void moveonwomen() {
		Actions w=new Actions(driver);
		w.moveToElement(women).perform();
		
	}
	public void clickontops() {
		tops.click();
	}
	public void clickontank() {
		tank.click();
		}
	public void clickons() {
		s.click();
	}
	public void clickonpurple() {
		purple.click();
	}
	public void clickonadd() {
		add.click();
		
	}






}
