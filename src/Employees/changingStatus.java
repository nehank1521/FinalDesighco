package Employees;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;

public class changingStatus {
	@Test
	public void method() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver();
	   driver.get("http://designco.sia.co.in/");
	  //Login
		login.username(driver).sendKeys("superadmin@gmail.com");
        System.out.println("Entered Valid Username Successfully");
        login.password(driver).sendKeys("password123");
        System.out.println("Entered Valid Password Successfully");
        Thread.sleep(3000);
        login.submit(driver).click();
        System.out.println("Submitted Successfully");
        Thread.sleep(6000);
      //Open Employee 
        dashboard.employee(driver).click();	
        Thread.sleep(8000);
        
      //Searching by Username
      	employeeList.searchByUsername(driver).sendKeys("sumi");
      	Thread.sleep(9000);
      		
      //Open User Profile
        employeeList.view(driver).click();
        Thread.sleep(8000);
        System.out.println("Open User Profile");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/openUserProfile.png"));
	
	
		
	  //Changing the Status From Suspend to Active or Active to Suspend
		 Thread.sleep(3000);
		 WebElement Active= employeeList.activeUser(driver);
         WebElement Suspend= employeeList.suspendUser(driver);
        		  
        
        if(Active.isEnabled())
        {
        	 System.out.println("Active button is Enable");
        	 employeeList.activeUser(driver).click();
        }
       
        else
        {
        	System.out.println("Suspend is Enable");
        }
        if(Suspend.isEnabled())
	    {
		System.out.println("Suspend button is Enable");
		employeeList.suspendUser(driver).click();
	     }
	   else
	   {
		System.out.println("Active is Enable");
	    }
        
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/Loginpage.png"));
	
		
		driver.quit();
	}
}
