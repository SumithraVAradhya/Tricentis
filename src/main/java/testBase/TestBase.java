package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo{
	
    
	 
	
	public void LaunchBrowerAndNavigate() throws Exception
	{
		String browser =PropertiesOperations.getPropertyKey("browser");
		
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				WebDriverManager.iedriver().setup();
				 driver=new InternetExplorerDriver(); 
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(PropertiesOperations.getPropertyKey("URL"));
			
		}
		
	}
	@BeforeMethod
	public  void setupMethod () throws Exception {
		LaunchBrowerAndNavigate();
		HomePage = new HomePageObjects();
	
	}
   @AfterMethod
   public void cleanup() {
	   driver.quit();
   }

	
}
