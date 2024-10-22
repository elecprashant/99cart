package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
        features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty"}
		
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
