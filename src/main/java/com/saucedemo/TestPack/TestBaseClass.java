package com.saucedemo.TestPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TestBaseClass 

{
	WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemo-15oct-Project");
	
	@Parameters("browserName")
	@BeforeMethod
	
	public void setup(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation java\\chromedriver_win32\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Automation java\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			
			
			 driver = new FirefoxDriver();	
		}
		else
			{
				System.out.println("throw error");
			}
		
		
		PropertyConfigurator.configure("Log4j.properties");
		log.info(" To open the browser");
		
		driver.manage().window().maximize();
		log.info("Maximize the window");
		
		driver.get("https://www.saucedemo.com");
		log.info(" To open the URL");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		UtilityClass.screenshot(driver, "TC01 LOGINPAGE screenshot");
		log.info("Screenshot is taken");
		
		
		LoginPOMClass lp = new LoginPOMClass(driver);
		
		lp.sendusername();
		log.info("Username is entered");
		
		lp.sendpassword();
		log.info("Password is entered");
		
		lp.mouseaction();
		log.info("Loginbutton is clicked");
		
		
		
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of program");
	}
	

}
