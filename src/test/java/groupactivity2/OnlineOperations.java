package groupactivity2;

import java.io.File;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class OnlineOperations {
	    @Before
	    public void beforeScenario(){
	          System.setProperty("webdriver.chrome.driver",
	                    "./src/main/resources/chromedriver.exe");
	            
	            driver = new ChromeDriver();
	    } 
	    WebDriver driver;

	 

	    @Given("^the user on the authentication form$")
	    public void open_the_Browser_and_launch_the_application() throws Throwable {
	        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	        System.out.println("Authentication page of the application is opened.");
	    }


	    @When("^user enter valid data on the page$")
	    public void enter_valid_data(DataTable table) throws Throwable {
	        //List<List<String>> data   = table.raw();
	        List<List<String>> data=table.raw();
	        driver.findElement(By.id("email")).sendKeys(data.get(1).get(1));
	        Thread.sleep(5000);
	        driver.findElement(By.id("passwd")).sendKeys(data.get(2).get(1));
	        Thread.sleep(5000);
	        driver.findElement(By.id("SubmitLogin")).click();
	        System.out.println("data entered in the application");
	        }
	    
	    @Then("^the page is navigated to my account page$")
	    public void successful_login() throws Throwable {
	        if(driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).isDisplayed())
	        {
	        TakesScreenshot takescreenshots =((TakesScreenshot)driver);
	        File SrcFile=takescreenshots.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File("./target/ScreenShots/AfterLogin.png");    
	        FileUtils.copyFile(SrcFile, DestFile);
	        }
	        else {
	        	TakesScreenshot takescreenshots =((TakesScreenshot)driver);
		        File SrcFile=takescreenshots.getScreenshotAs(OutputType.FILE);
		        File DestFile=new File("./target/ScreenShots/LoginUnsuccessfull.png");    
		        FileUtils.copyFile(SrcFile, DestFile);
	        }
	    }
	    @After()
	    public void cleanUp() {
	        driver.close();
	        System.out.println("This will run after every Scenario");
	        }
}