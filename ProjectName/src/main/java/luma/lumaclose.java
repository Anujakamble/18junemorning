package luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class lumaclose {
	WebDriver driver;
	public lumaclose(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
public void close() {
	driver.close();
}
}
