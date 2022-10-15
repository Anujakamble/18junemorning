package lenskartlogintest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lenskart.lenshomepage;
import lenskart.lenslogin;
import lenskart.lenslogin1;
import lenskart.lenslogout;


public class annotations {
	WebDriver driver;
	lenslogin login;
	lenshomepage hmpg;
	lenslogout logout;
	lenslogin1 login1;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.titaneyeplus.com/");
        login=new lenslogin(driver);
        login1=new lenslogin1(driver);
        hmpg=new lenshomepage(driver);
        logout=new lenslogout(driver);
	}
     @BeforeMethod
     public void Login() {
    	 login.clickonsignin();
    	 login1.enterusername();
    	 login1.enterpassword();
    	 login1.clickOnloginbutton();
     }
   
     @Test
     public void hmpg() throws IOException  {
    	 hmpg.moveonEyeglasses();
    	 hmpg.clickonwomen();
    	 hmpg.selectposition();
    	 
     }
     @AfterMethod
     public void logout() throws InterruptedException{
    	 logout.switchtowindow();
    	 logout.clickAnuja();
    	 }
     @AfterClass
     public void close(){
     driver.quit();
    	 
     
	}
	


}



