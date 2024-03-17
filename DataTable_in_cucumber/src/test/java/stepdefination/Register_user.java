package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register_user 
{
	public static WebDriver driver;
	
	@Given("launch browser and open app")
	public void launch_browser_and_open_app() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\sdet+\\SEED COURSE\\selenium automation testing\\automation program revision\\DataTable_in_cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	

	@When("user enter all details")
	public void user_enter_all_details(DataTable dataTable) 
	{
		List<List<String>> data=dataTable.asLists();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(data.get(2).get(1));
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(data.get(3).get(1));
	}

	@Then("user registered successfull")
	public void user_registered_successfull() 
	{
		System.out.println("registered successfully");
	}


}
