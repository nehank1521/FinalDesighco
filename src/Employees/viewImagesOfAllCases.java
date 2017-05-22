package Employees;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.employeeList;
import Pages.login;
import Pages.userProfile;

public class viewImagesOfAllCases {

	@Test
	public void method() throws InterruptedException, IOException
	{
		Map prefs = new HashMap();	
		prefs.put("profile.default_content_setting_values.notifications", 2);  	
		prefs.put("credentials_enable_service", false);	
		prefs.put("profile.password_manager_enabled", false);	
		ChromeOptions options = new ChromeOptions();	
		options.setExperimentalOption("prefs", prefs);
		
		
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver(options);
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
		
		
		
	  // All Cases
		Thread.sleep(8000);
		userProfile.allCases(driver).click();
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/screenshots/allCases.png"));
		System.out.println("ALL CASES");
		Thread.sleep(8000);
		employeeList.viewMore(driver).click();
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/screenshots/allCasesViewMore.png"));
		System.out.println("Open a Case");
		
	
	  // Open an Images
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@class,'ui-g-12 ui-lg-12 ui-md-12')]/img")).click();
		//userProfile.viewImages(driver).click();
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile2, new File("/home/aj/Documents/screenshots/viewImages.png"));
		System.out.println("View Images");
		
	  //Close the Image
		userProfile.viewImages(driver).click();
		System.out.println("Close the Image");
		
		
	  //Logout	
        dashboard.logout(driver).click();
	    System.out.println("Logged out Successfully");
	    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/Loginpage.png"));
		
		driver.quit();
	}	
}
