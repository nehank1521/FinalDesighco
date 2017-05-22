package Dashboard;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.dashboard;
import Pages.login;

public class reviewedCases {
	

	@Test
	public void user() throws InterruptedException, IOException
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
		
		System.out.println("Reviewed cases = "+driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[3]/div/div[2]/h1")).getText());
	    dashboard.Reviewedcases(driver).click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		dashboard.Lastpagearrowbutton(driver).click();
		dashboard.reviewedCases(driver).click();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);             
	    FileUtils.copyFile(scrFile, new File("/home/aj/Documents/screenshots/openUserProfile.png"));
			
		System.out.println("check the screen shot for Reviewed cases ");
			
			driver.quit();
		
	
}
}
