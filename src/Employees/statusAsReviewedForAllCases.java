package Employees;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;
import Pages.userProfile;

public class statusAsReviewedForAllCases
{
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
		
		employeeList.viewMore(driver).click();
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/viewMore.png"));
		
		userProfile.status(driver).click();
		Thread.sleep(8000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/viewMore.png"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])")).click();
		//userProfile.statusReviewed(driver).click();
		Thread.sleep(8000);
		System.out.println("Status is Reviewed");
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/statusPending.png"));
		
		userProfile.ok(driver).click();
		Thread.sleep(8000);
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/statusPending.png"));
		
		userProfile.status(driver).click();
		Thread.sleep(8000);
		userProfile.cancel(driver).click();
		
		   
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile5, new File("/home/aj/Documents/screenshots/Loginpage.png"));
		driver.quit();
		
		
		
		
	}
}
