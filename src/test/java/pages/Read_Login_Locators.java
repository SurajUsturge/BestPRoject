package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic_methods.Basic_data;

public class Read_Login_Locators 
{	
	static WebDriver driver=Basic_data.driver;


	public static void readloctrs(String username,String password) throws IOException, InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		login.properties=> locators properties file here
	String usernameloc=Basic_data.readlocators("usern","loginLocator.properties");
	WebElement user=driver.findElement(By.xpath(usernameloc));
	user.sendKeys(username);
	
	
	
	Thread.sleep(1000);
	
	String passwordloc=Basic_data.readlocators("passn","loginLocator.properties");
	WebElement pass=driver.findElement(By.xpath(passwordloc));
	pass.sendKeys(password);

	Thread.sleep(1000);

	//	login button
	String loginlocator=Basic_data.readlocators("loginbtn", "loginLocator.properties");
	WebElement loginbutton=driver.findElement(By.xpath(loginlocator));
	loginbutton.click();
		Thread.sleep(5000);
	}

}
