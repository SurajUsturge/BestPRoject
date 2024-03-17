package basic_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_data 
{
	
public static WebDriver driver;
	
//	return type webdriver
	public static WebDriver getDriver(String browserName) throws InterruptedException
	{
//-----------------	site name	-----------
//		https://askomdch.com/account/
		
		
			if(browserName.equalsIgnoreCase("chrome")) 
			{
			System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice - Copy\\BEST_PROJECT_OrangeHRM_Data_driven_testing_by_ID_and_xpath\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			}

			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","E:\\Java Project for github practice - Copy\\BEST_PROJECT_OrangeHRM_Data_driven_testing_by_ID_and_xpath\\driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			}
		return driver;
	}
	
	public static void openUrl(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
	}
	
	
	
	public static void closeborwser() throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
	}
	

public static String readlocators(String locators,String filename) throws IOException 
{
	File src=new File("E:\\Java Project for github practice - Copy\\BEST_PROJECT_OrangeHRM_Data_driven_testing_by_ID_and_xpath\\src\\test\\java\\locators\\"+filename);
//	to read the properties file in packages
	FileInputStream input=new FileInputStream(src);
	
	Properties obj=new Properties();   //location of "locators" package
	obj.load(input);
	String locatorName=obj.getProperty(locators);
	return locatorName;
	
}



public static String readtestdata(String data,String filename) throws IOException 
{
	
//	to read the properties file in packages
File src=new File("E:\\Java Project for github practice - Copy\\BEST_PROJECT_OrangeHRM_Data_driven_testing_by_ID_and_xpath\\src\\test\\java\\testdata\\"+filename);
	FileInputStream input=new FileInputStream(src);
	Properties obj=new Properties();
	
	obj.load(input);
	String testdata=obj.getProperty(data);
	return testdata;
	
}




}
