package Employees;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;

public class TotalEmployees {
	@Test
	public void passengers() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://designco.sia.co.in/");
	   //Login
		login.username(driver).sendKeys("superadmin@gmail.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/username.png"));
        System.out.println("Entered Valid Username Successfully");
        
        login.password(driver).sendKeys("password123");
        
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/password.png"));
        System.out.println("Entered Valid Password Successfully");
        
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        login.submit(driver).click();
        System.out.println("Submitted Successfully");
        
        Thread.sleep(6000);
        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/Homepage.png"));
      //Open Employee Module  
	    dashboard.employee(driver).click();
	    Thread.sleep(2000);
	   
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy(0,250)", "");
	    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile5, new File("/home/aj/Documents/screenshots/EmployeeFullPage1.png"));
	  //Open Last Page 
	   employeeList.lastforwardbutton(driver).click();
	   Thread.sleep(6000);
	    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile6, new File("/home/aj/Documents/screenshots/EmployeeFullLastPage.png"));
	    
	    
	    
	   //logout 
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/Loginpage.png"));
	    
	    
	    
	    
	    
	    
	    
	    driver.quit();
}
}
