package flipkartlogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkart.flipkartcart;
import flipkart.flipkarthomepage;
import flipkart.flipkartlogin;
import flipkart.flipkartlogin2;
import flipkart.flipkartlogout;

public class flipkartlogintestclass {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",
			"F:\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	flipkartlogin login=new flipkartlogin(driver);
	login.enterusername();
	login.enterpassword();
	login.clickOnloginbutton();
	flipkarthomepage hmpg=new flipkarthomepage(driver);
	hmpg.clickonMobiles();
	hmpg.clickonPOCOC31();
	hmpg.selectMin();
	hmpg.clickonCoolblue();
	flipkartcart cart=new flipkartcart(driver);
	cart.switchtowindow();
	cart.scrollupdown();
	cart.takess();
	flipkartlogout logout=new flipkartlogout(driver);
	logout.clickAnuja();
	driver.quit();
	
	
	
	
	
	}
    

}
