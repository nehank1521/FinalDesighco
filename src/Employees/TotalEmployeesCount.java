package Employees;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class TotalEmployeesCount {
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
		FileUtils.copyFile(scrFile, new File("/home/aj/Documents/scrcount/username.png"));
        System.out.println("Entered Valid Username Successfully");
        
        login.password(driver).sendKeys("password123");
        
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile1, new File("/home/aj/Documents/scrcount/password.png"));
        System.out.println("Entered Valid Password Successfully");
        
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        login.submit(driver).click();
        System.out.println("Submitted Successfully");
        
        Thread.sleep(6000);
        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile3, new File("/home/aj/Documents/scrcount/Homepage.png"));
      //Open Employee Module  
	    dashboard.employee(driver).click();
	    Thread.sleep(2000);
	    
	
	    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile5, new File("/home/aj/Documents/scrcount/EmployeeFullPage1.png"));
	  //Count No. Of Rows and Column of page1
	    List<WebElement>rows=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));	
	    System.out.println("Total no of rows="+rows.size());		
	    List<WebElement>cols=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));		
	    System.out.println("Total no of columns="+cols.size());
	  //Open page2
	    employeeList.forwardbutton(driver).click();
	    Thread.sleep(6000);
        File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		FileUtils.copyFile(scrFile6, new File("/home/aj/Documents/scrcount/EmployeeFullPage2.png"));
      //Open page3
		 employeeList.forwardbutton(driver).click();
		 Thread.sleep(6000);
	     File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
			FileUtils.copyFile(scrFile7, new File("/home/aj/Documents/scrcount/EmployeeFullPage3.png"));
	   //Open page4
		 employeeList.forwardbutton(driver).click();
		 Thread.sleep(6000);
		 File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		 FileUtils.copyFile(scrFile8, new File("/home/aj/Documents/scrcount/EmployeeFullPage4.png"));
				
	   //Open page5
		 employeeList.forwardbutton(driver).click();
		 Thread.sleep(6000);
		 File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		 FileUtils.copyFile(scrFile9, new File("/home/aj/Documents/scrcount/EmployeeFullPage5.png"));
	   //Open page6
		 employeeList.forwardbutton(driver).click();
		 Thread.sleep(6000);
		 File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
		 FileUtils.copyFile(scrFile10, new File("/home/aj/Documents/scrcount/EmployeeFullPage6.png"));
				
			
			
			
		   
	        dashboard.logout(driver).click();
		    System.out.println("Logged out Successfully");
		    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
			FileUtils.copyFile(scrFile4, new File("/home/aj/Documents/screenshots/Loginpage.png"));
			
			
			
			
			
			
			
			
			
			
			
			
	    driver.quit();
        
		
	}
}
