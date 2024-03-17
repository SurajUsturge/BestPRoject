package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic_methods.Basic_data;


public class Logout_page 
{
	static WebDriver driver=Basic_data.driver;

	public static void logoutlocators(String username,String password) throws IOException, InterruptedException
	{
//login.properties=> locators properties file here
	
//  username
    String usernameloc=Basic_data.readlocators("usern","loginLocator.properties");
	WebElement user=driver.findElement(By.name(usernameloc));
	user.sendKeys(username);
	
//	password
	String passwordloc=Basic_data.readlocators("passn","loginLocator.properties");
	WebElement pass=driver.findElement(By.name(passwordloc));
	pass.sendKeys(password);
	
	Thread.sleep(2000);
//	login button
	String loginlocator=Basic_data.readlocators("loginbtn", "loginLocator.properties");
	WebElement loginbutton=driver.findElement(By.xpath(loginlocator));
	loginbutton.click();
	
	Thread.sleep(2000);
	
	//logout main menu
	String logoutopt=Basic_data.readlocators("logoutoption", "Logout.properties");
	WebElement logoutmanu=driver.findElement(By.xpath(logoutopt));
	logoutmanu.click();
	
	Thread.sleep(2000);
	
	//logout sub menu
	String outsub=Basic_data.readlocators("logout", "Logout.properties");
	WebElement subout=driver.findElement(By.xpath(outsub));
	subout.click();
	
	Thread.sleep(5000);
	}
}
