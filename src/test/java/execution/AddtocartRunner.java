package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
        features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
        "rerun:target/Failed.txt"}
		
		
		)

public class AddtocartRunner extends AbstractTestNGCucumberTests {
	
	

}
