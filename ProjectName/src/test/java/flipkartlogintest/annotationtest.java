package flipkartlogintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flipkart.flipkartcart;
import flipkart.flipkarthomepage;
import flipkart.flipkartlogin;
import flipkart.flipkartlogout;



public class annotationtest {
	WebDriver driver;
	flipkartlogin login;
	flipkarthomepage hmpg;
	flipkartcart cart;
	flipkartlogout logout;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        login=new flipkartlogin(driver);
        hmpg=new flipkarthomepage(driver);
        cart=new flipkartcart(driver);
        logout=new flipkartlogout(driver);
	}
     @BeforeMethod
     public void Login() {
    	 login.enterusername();
    	 login.enterpassword();
    	 login.clickOnloginbutton();
     }
     @Test
     public void hmpg() {
    	 hmpg.clickonMobiles();
    	 hmpg.clickonPOCOC31();
    	 hmpg.clickonCoolblue();
     }
     @Test//(priority=1,dependsOnMethods="hmpg")
     public void cart() throws InterruptedException, IOException {
         cart.switchtowindow();
    	 
    	 }
     @AfterMethod
     public void logout() throws InterruptedException{
    	 //logout.clickAnuja();
    	 System.out.println("logout here");
    	 }
     @AfterClass
     public void closepage(){
     //driver.quit();
    	System.out.println("close page"); 
     
	}
	


}
