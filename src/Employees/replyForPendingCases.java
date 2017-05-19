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
import Pages.userProfile;

public class replyForPendingCases {
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
        Thread.sleep(8000);
        dashboard.employee(driver).click();	
        Thread.sleep(8000);
        
      //Search by Username
        
      	employeeList.searchByUsername(driver).sendKeys("sumi");
      	Thread.sleep(9000);
      	
        
      //Open User Profile
        employeeList.view(driver).click();
        Thread.sleep(8000);
        System.out.println("Open User Profile");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/openUserProfile.png"));
		
	  //Open Pending Cases
		Thread.sleep(8000);
		userProfile.pendingCases(driver).click();
		Thread.sleep(9000);
		File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile7, new File("/home/aj/Documents/screenshots/pendingCases.png"));
		System.out.println("PENDING CASES");	
		employeeList.viewMore(driver).click();
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/viewMore.png"));
	
	  
		
	   //Open Reply 
		Thread.sleep(8000);
		userProfile.reply(driver).click();
		Thread.sleep(8000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/reply.png"));
		userProfile.textArea(driver).sendKeys("Reply For Pending Case");
		Thread.sleep(8000);
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/reply.png"));
		userProfile.ok(driver).click();
		System.out.println("Replied Successfully");
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/reply.png"));
		
		
	   //Logout	   
		Thread.sleep(8000);
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile6, new File("/home/aj/Documents/screenshots/Loginpage.png"));
		driver.quit();
	}
}
