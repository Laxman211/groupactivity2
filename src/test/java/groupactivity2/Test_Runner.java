package groupactivity2;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
//@Cucumber.Options( format={"json:target/cucumber/cucumber.json"}) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},tags = {"@Registration"}) 

public class Test_Runner {

}
