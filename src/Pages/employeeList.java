package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class employeeList {
	private static WebElement element;
	
	public static WebElement view(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'View']"));
	}
	
	public static WebElement suspendUser(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Suspend']"));
	}
	
	public static WebElement employee(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Employee']"));
	}
	
	public static WebElement view1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'View']"));
	}
	
	public static WebElement selectCheckbox(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"));	
	}
	
	public static WebElement forwardbutton(WebDriver driver)
	{	
		return driver.findElement(By.xpath("(//span[@class='fa fa-forward'])"));	
     }
    
	public static WebElement lastforwardbutton(WebDriver driver)
	{	
		return driver.findElement(By.xpath("(//span[@class='fa fa-step-forward'])"));	
     }
     
	
	public static WebElement deselectCheckbox(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//span[@class= 'ui-chkbox-icon ui-c fa fa-check')"));	
	}
	
	public static WebElement selectCheckbox2(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]"));	
	}
	
	public static WebElement activeUser(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Activate']"));
	}
	
	public static WebElement viewMore(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'View More']"));
	}

	public static WebElement searchByUsername(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[placeholder= 'Username']"));
	}
	
	public static WebElement searchByEmail(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[placeholder= 'Email']"));
	}
	public static WebElement selectCheckbox3(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]"));	
	}
	public static WebElement selectCheckbox4(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]"));	
	}
	public static WebElement selectCheckbox5(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]"));	
	}
	public static WebElement selectCheckbox6(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]"));	
	}
	public static WebElement selectCheckbox7(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]"));	
	}
	public static WebElement selectCheckbox8(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]"));	
	}
	
	public static WebElement selectAllCheckbox(WebDriver driver)
	{
	     return driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']) "));	
	}
	
	public static WebElement homeIcon(WebDriver driver)
	{
	     return driver.findElement(By.xpath("//img[@ src='assets/images/home.png'] "));	
	}
	
	
}
