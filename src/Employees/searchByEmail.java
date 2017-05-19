package Employees;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;

public class searchByEmail {
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
     
	  //Search by Email
        employeeList.searchByEmail(driver).sendKeys("shahidali123@gmail.com");
		 Thread.sleep(9000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/validEmail.png"));
	    
	    driver.navigate().refresh();
	    Thread.sleep(6000);
	    employeeList.searchByEmail(driver).sendKeys("shahidali123gmail.com");
	    Thread.sleep(3000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/invalidEmail.png"));
	    
	    
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/Loginpage.png"));
		
		
		 driver.quit();
	   
	    
       
	}
	

}
