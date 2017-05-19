package Login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;

public class pageLoadTime {
	@Test
	public void user() throws InterruptedException, IOException
	{		
		
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	
	WebDriver driver=new ChromeDriver();
	
	Thread.sleep(2000);
	
	long start=System.currentTimeMillis();			
	
	driver.get("http://designco.sia.co.in/");		
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	long finish=System.currentTimeMillis();		

	
	long totaltime=finish-start;				
	
	System.out.println("page load time :"+totaltime);
	
	   
    dashboard.logout(driver).click();
    System.out.println("Logged out Successfully");
    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/Loginpage.png"));
	
	driver.quit();	
	
	
	}

}
