

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import luma.lumaclose;
import luma.lumahomepage;
import luma.lumalogin;
import luma.lumalogout;
import utility.utilityclass;

public class Annotation extends Baseclass{
	utilityclass utility;
	lumalogin login;
	 lumahomepage hmpg;
     lumalogout logout;
	lumaclose quit;
	@BeforeClass
	public  void launchBrowser() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",
				//"F:\\New folder\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://magento.softwaretestingboard.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		launchBrowser("chrome");
        login=new lumalogin(driver);
        hmpg=new lumahomepage(driver);
        logout=new lumalogout(driver);
	}
     @BeforeMethod
     public void Login() {
    	 login.clickonsign();
    	 login.enterusername();
    	 login.enterpassword();
    	 login.clickOnloginbutton();
     }
   
     @Test
     public void hmpg() throws IOException, InterruptedException  {
    	 hmpg.moveonwomen();
    	 hmpg.clickontops();
    	 hmpg.clickontank();
    	 hmpg.clickons();
    	 hmpg.clickonpurple();
    	 hmpg.clickonadd();
    	 utility.ss();
     }
 @AfterMethod
     public void logout() throws InterruptedException{
    	 logout.clickonanuja();
    	 logout.clickonlogout();
    	 }
     @AfterClass
     public void close(){
     System.out.println("close");
    	 
     
	}
	
}
