package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\registration.feature"},
		
		glue = {"steps"},
		
		publish = true,
		
		plugin = {"pretty"}
		
		)

public class RegistrationRunner extends AbstractTestNGCucumberTests
{

}
