package Dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.login;

public class comparingCases {
	@Test
	public void method() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","/home/aj/Desktop/chromedriver "); 
	WebDriver driver=new ChromeDriver();

	driver.get("http://designco.sia.co.in/");
	driver.manage().window().maximize();
	
	login.username(driver).sendKeys("superadmin@gmail.com");
    System.out.println("Entered Valid Username Successfully");
    login.password(driver).sendKeys("password123");
    System.out.println("Entered Valid Password Successfully");
    Thread.sleep(3000);
    login.submit(driver).click();
    System.out.println("Submitted Successfully");
	Thread.sleep(9000);
	
	WebElement one=driver.findElement(By.xpath("//*[contains(@class= 'ui-g-7 ui-lg-7 ui-md-7')]//img"));
	one.getText();
	String st1=one.getText();
			
	System.out.println("Total cases ="+st1);
	
	WebElement two=driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[3]/div/div[2]"));
	two.getText();
	String st2=two.getText();
	
	
	System.out.println("Reviewed cases ="+st2);
	WebElement three=driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[4]/div/div[2]"));
	three.getText();
	String st3=three.getText();
	System.out.println("Pending cases ="+st3);
	
	
	int value1=Integer.parseInt(st1);
	
	int value2=Integer.parseInt(st2);
	
	int value3=Integer.parseInt(st3);
	
	int total=value2+value3;
	
	if(total == value1)
	{
	System.out.println("Toal cases is Equals to reviewed cases plus pending cases");	
	}
	else
	{
		System.out.println("Toal cases is Not Equals to reviewed cases plus pending cases");
	}
		
		
	
	 	driver.quit();
	 	
	}
	
	
	
}
