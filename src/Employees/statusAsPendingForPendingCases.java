package Employees;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;
import Pages.userProfile;

public class statusAsPendingForPendingCases {
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
      //Open User Profile
        employeeList.view(driver).click();
        Thread.sleep(8000);
        System.out.println("Open User Profile");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/openUserProfile.png"));
		
	  //Open Pending Cases
		userProfile.pendingCases(driver).click();
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/pendingCases.png"));
		System.out.println("PENDING CASES");	
		
		
	  //Pending Cases View More
		WebElement viewMoreHyperlink= employeeList.viewMore(driver);
	
		if(viewMoreHyperlink.isEnabled())
		{	
		employeeList.viewMore(driver).click();
	    Thread.sleep(8000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/pendingCasesViewMore.png"));
		}
		else
		{
			System.out.println("There is no case");
		}
		
	   //Status As Pending
		userProfile.status(driver).click();
		Thread.sleep(8000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/viewMore.png"));
		
		userProfile.radioButtonForPending(driver).click();
		Thread.sleep(8000);
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/statusPending.png"));
		
		userProfile.ok(driver).click();
		Thread.sleep(8000);
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/statusPending.png"));
		System.out.println("Status is Pending ");
	
		userProfile.status(driver).click();
		Thread.sleep(8000);
		userProfile.cancel(driver).click();
			
		
	  //Logout	
		Thread.sleep(8000);
        dashboard.logout(driver).click();
        Thread.sleep(8000);
	    System.out.println("Logged out Successfully");
	    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile5, new File("/home/aj/Documents/screenshots/Loginpage.png"));
		
		driver.quit();
	}	

	
	
	
	
	
	
	
}
