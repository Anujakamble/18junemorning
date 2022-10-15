package lenskartlogin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import lenskart.lenshomepage;
import lenskart.lenslogin;
import lenskart.lenslogin1;
import lenskart.lenslogout;

public class lenskartlogintestclasses {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.titaneyeplus.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lenslogin login=new lenslogin(driver);
		login.clickonsignin();
		lenslogin1 login1=new lenslogin1(driver);
		login1.enterusername();
		login1.enterpassword();
		login1.clickOnloginbutton();
		lenshomepage hmpg=new lenshomepage(driver);
		hmpg.moveonEyeglasses();
		hmpg.clickonwomen();
		hmpg.selectposition();
		hmpg.clickonBlue();
		hmpg.scrollupdown();
		hmpg.takess();
		lenslogout logout=new lenslogout(driver);
		logout.switchtowindow();
		logout.clickAnuja();
		driver.quit();
	}
}

