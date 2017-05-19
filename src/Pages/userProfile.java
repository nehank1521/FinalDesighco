package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userProfile {

	public static WebElement status(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Status']"));
	}
	
	public static WebElement statusPending(WebDriver driver)
	{	
		return driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon fa fa-circle'])"));	
     }
	
	public static WebElement ok(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-citizen > app-pending-cases > div.replyDiv > p-dialog > div > div.ui-dialog-content.ui-widget-content > div:nth-child(2) > div > button:nth-child(1) > span"));
	}
	public static WebElement textArea(WebDriver driver)
	{
			return driver.findElement(By.cssSelector("[placeholder= 'Reply']"));
					
	}
	
	public static WebElement reply(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Reply']"));
	}
	
	public static WebElement cancel(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'Cancel']"));
	}
    
	public static WebElement statusReviewed(WebDriver driver)
	{
		return driver.findElement(By.xpath("(div[@class='ui-radiobutton-icon fa fa-circle'])"));
	}
	public static WebElement allCases(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'ALL CASES']"));
	}
	
	public static WebElement pendingCases(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'PENDING CASES']"));
	}
	
	public static WebElement reviewedCases(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()= 'REVIEWED CASES']"));
	}
	
	public static WebElement radioButtonForPending(WebDriver driver)
	{
		return driver.findElement(By.xpath("//p-radiobutton[@name= 'groupname' and @value= 'Pending']"));
	}
	public static WebElement radioButtonForReviewed(WebDriver driver)
	{
		return driver.findElement(By.xpath("//p-radiobutton[@name= 'groupname' and @value= 'Reviewed']"));
	}
	
	
	
	
	
}
