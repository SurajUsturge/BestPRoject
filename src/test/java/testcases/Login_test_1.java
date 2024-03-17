package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basic_methods.Basic_data;
import pages.Read_Login_Locators;

public class Login_test_1 
{
	@BeforeMethod
	public void launchapp() throws InterruptedException
	{
		  System.out.println("setting the chrome browser");
		  Basic_data.getDriver("chrome");
		  System.out.println("opening the url in chrome");
		  Basic_data.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	
	
	  @Test(priority = 1)
	  public void emptyUsername() throws IOException, InterruptedException 
	  {
//  	  login.properties=> Test Data properties file "here"
		  System.out.println("valid");
		  String passwo=Basic_data.readtestdata("password","login.properties");
	
		  Read_Login_Locators.readloctrs("",passwo);
		  System.out.println("not success");
	  }
	  
	
	
	  @Test(priority = 3)
	  public void invalid() throws IOException, InterruptedException 
	  {
//  	  login.properties=> Test Data properties file "here"
		  System.out.println("alogin_test_with_valid_data");
		  String usern=Basic_data.readtestdata("INVLAIDusername","login.properties");
		  String passwo=Basic_data.readtestdata("INVALIDpassword","login.properties");
		  Read_Login_Locators.readloctrs(usern,passwo);
	  }
	    
	  @Test(priority = 2)
	  public void valid() throws IOException, InterruptedException 
	  {
//  	  login.properties=> Test Data properties file "here"
		  System.out.println("valid");
		  String usern=Basic_data.readtestdata("username","login.properties");
		  String passwo=Basic_data.readtestdata("password","login.properties");
		  Read_Login_Locators.readloctrs(usern,passwo);
		  System.out.println("successfull");
	  }

}
