package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard
{
	private static WebElement element;

	public static WebElement logout(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Log Out']"));
		
	}
    
	public static WebElement employee(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Employee']"));
	
		
	}

	
	
	
}
