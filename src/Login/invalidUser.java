package Login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.login;

public class invalidUser 
{
	@Test
	public void passengers() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://designco.sia.co.in/");
	  
		login.username(driver).sendKeys("superadmin.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/invalidUsername.png"));
        System.out.println("Entered Valid Username Successfully");
        
        login.password(driver).sendKeys("password123");
        
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/validPassword1.png"));
        System.out.println("Entered Valid Password Successfully");
        
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        login.submit(driver).click();
        System.out.println("Submitted Successfully");
        
        Thread.sleep(6000);
        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/Homepage1.png"));
     
	    
	    driver.quit();
	}
}
