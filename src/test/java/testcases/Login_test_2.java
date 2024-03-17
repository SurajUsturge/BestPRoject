package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basic_methods.Basic_data;
import pages.Logout_page;
import pages.Read_Login_Locators;



public class Login_test_2 {
	
	@BeforeMethod
	public void browserlaunch() throws InterruptedException
	{
		  System.out.println("setting the chrome browser");
		  Basic_data.getDriver("chrome");
		  System.out.println("opening the url in chrome");
		  Basic_data.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	  @Test (priority = 1)
	  public void login_test_with_valid_data() throws IOException, InterruptedException 
	  {
//  	  login.properties=> Test Data properties file "here"
		  System.out.println("fetching the test data to login");
		  String usern=Basic_data.readtestdata("username","login.properties");
		  String passwo=Basic_data.readtestdata("password","login.properties");
		
		  Logout_page.logoutlocators(usern, passwo);
	  }


		
		

	  
	  
	 
	  
	  
}
