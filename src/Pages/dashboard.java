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
		return driver.findElement(By.xpath("//*[text()='Employee']"));
	
		
	}

	public static WebElement all(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'All']"));
	
		
	}
	public static WebElement Totalcaseslink(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Total Cases']"));
	}


	public static WebElement Pendingcases(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Pending Cases']"));
	}
	public static WebElement Reviewedcases(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Reviewed Cases']"));
	}
	public static WebElement searchbyname(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[placeholder='Search']"));
	}
	public static WebElement All(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='All']"));
	}
	public static WebElement Lastyear(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ui-dropdown-item ui-corner-all'][1])"));
	}
	public static WebElement Last30days(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("(//*[@class='ui-dropdown-item ui-corner-all'])"));
	}
	public static WebElement Last7days(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("(//*[@class='ui-dropdown-item ui-corner-all'])"));
	}
	
	public static WebElement Lastpagearrowbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//span[@class='fa fa-step-forward'])"));
		
	}
	
	public static WebElement reviewedCases(WebDriver driver)

	{
		return driver.findElement(By.xpath("//*[@label='REVIEWED CASES']"));
		
	}
}
