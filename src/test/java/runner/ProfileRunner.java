package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Profile.feature"},
		glue = {"steps"},
		
		dryRun = true
		
		
		
		
		)


public class ProfileRunner extends AbstractTestNGCucumberTests{

}
