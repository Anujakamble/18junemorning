package flipkart;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkarthomepage {
	WebDriver driver;
	@FindBy(xpath="(//img[@alt='Mobiles'])[1]")
	private WebElement mobiles;
	@FindBy(xpath="(//p[text()='Shop Now'])[2]")
	private WebElement poco;
	@FindBy(xpath="//div[text()='POCO M4 5G (Cool Blue, 64 GB)']")
	private WebElement CoolBlue;
	
	public flipkarthomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonMobiles() {
		mobiles.click();
	}
	public void clickonPOCOC31() {
		poco.click();
	}
	public void clickonCoolblue() {
		CoolBlue.click();
		
	}
	
	

    


}
