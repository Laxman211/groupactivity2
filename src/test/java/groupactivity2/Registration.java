package groupactivity2;

import java.io.File;
//import java.io.FileOutputStream;
//import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
//import cucumber.table.DataTable;

public class Registration {
	 @Before
	    public void beforeScenario(){
	          System.setProperty("webdriver.chrome.driver",
	                    "./src/main/resources/chromedriver.exe");
	            
	            driver = new ChromeDriver();
	    } 
	    WebDriver driver;

	 

	    @Given("^open the chrome and launch the application$")
	    public void open_the_Browser_and_launch_the_application() throws Throwable {
	        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	        System.out.println("Authentication page of the application is opened.");
	    }


	    @When("^user enter valid email on the page$")
	    public void enter_valid_data() throws Throwable {
	    	 driver.findElement(By.id("email_create")).sendKeys("abcde@gmail.com");
	    	 Thread.sleep(5000);
	    	 driver.findElement(By.id("SubmitCreate")).click();
	    	 Thread.sleep(5000);
}
	    @Then("^the page is navigated to create account page$")
	    public void successful_login() throws Throwable {
	        driver.findElement(By.id("account-creation_form")).isDisplayed();
	        Thread.sleep(2000);
	        TakesScreenshot takescreenshots =((TakesScreenshot)driver);
	        File SrcFile=takescreenshots.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File("./target/ScreenShots/Registration page.png");    
	        FileUtils.copyFile(SrcFile, DestFile);
}

	    @When("^the user enter the valid registration data$")
	    public void enter_registration_data() throws Throwable {
	    	driver.findElement(By.id("uniform-id_gender1")).click();
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("customer_firstname")).sendKeys("Amarendara");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("customer_lastname")).sendKeys("Bahubali");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("passwd")).sendKeys("Bahubali123");
	    	Thread.sleep(3000);
	    	
	    	Select date = new Select(driver.findElement(By.id("days")));
	        date.selectByValue("2");
	        Thread.sleep(2000);
	        
	        Select month = new Select(driver.findElement(By.id("months")));
	        month.selectByValue("2");
	        Thread.sleep(2000);
	        
	        Select year = new Select(driver.findElement(By.id("years")));
	        year.selectByValue("1999");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("newsletter")).click();
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("company")).sendKeys("Google");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("address1")).sendKeys("5E,Mark street");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("city")).sendKeys("Albany");
	    	Thread.sleep(3000);
	    	
	    	Select cityname = new Select(driver.findElement(By.id("id_state")));
	        cityname.selectByValue("32");
	        
	        driver.findElement(By.id("postcode")).sendKeys("12084");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("other")).sendKeys("Mother-4638365732");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("phone_mobile")).sendKeys("9360654287");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("submitAccount")).click();
	    	Thread.sleep(2000);
	    	
	    	TakesScreenshot takescreenshots =((TakesScreenshot)driver);
	        File SrcFile=takescreenshots.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File("./target/ScreenShots/RegisteredSuccessful.png");    
	        FileUtils.copyFile(SrcFile, DestFile);
	        
	        driver.quit();
	    }
	  
}









































