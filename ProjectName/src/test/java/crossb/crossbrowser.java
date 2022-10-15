package crossb;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Base.Baseclass;
import luma.lumalogin;

public class crossbrowser extends Baseclass {
	WebDriver driver;
	lumalogin login;
	@Parameters("browsers")
	@BeforeClass
	public void launchB(String browser) throws InterruptedException {
		launchBrowser(browser);
		login=new lumalogin(driver);
	}
	

}
