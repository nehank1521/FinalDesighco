package Employees;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
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
     
	
	}
	

}
