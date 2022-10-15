package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public  class Baseclass  {
    public static WebDriver driver;
	public static void launchBrowser(String browser) throws InterruptedException {
	if(browser.equalsIgnoreCase("chrome")) {
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver",
			"F:\\New folder\\chromedriver.exe");
	 driver=new ChromeDriver();//browser launch
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		
	    driver=new EdgeDriver();//browser launch
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://magento.softwaretestingboard.com/");
	
	
}
}
