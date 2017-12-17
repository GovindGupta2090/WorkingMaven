package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class implementation {

	WebDriver driver;
	
	@Given("^Open Chrome and start application with \"([^\"]*)\"$")
	public void open_Chrome_and_start_application_with(String urlString) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	 driver.get(urlString);
	 	
	}

	@When("^I eneter valid surname \"([^\"]*)\" and valid paasword \"([^\"]*)\"$")
	public void i_eneter_valid_surname_and_valid_paasword(String sname, String pass) throws Throwable {
	  
		driver.findElement(By.name("username")).sendKeys(sname);
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}

	@Then("^user should be able to login sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.quit();
		
	}
	
	
}
