package Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.login;

public class invalidUser
{

	@Test
	public void method() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver();
	   driver.get("http://designco.sia.co.in/");
	  
		login.username(driver).sendKeys("superadmingmail.com");
        System.out.println("Entered Valid Username Successfully");
        login.username(driver).sendKeys("123");
        System.out.println("Entered alid Username Successfully");
        
        login.password(driver).sendKeys("password123");
        System.out.println("Entered Valid Password Successfully");
        login.submit(driver).click();
        System.out.println("Submitted Successfully");
        Thread.sleep(3000);
        dashboard.logout(driver).click();
	
       }
		
	
}
