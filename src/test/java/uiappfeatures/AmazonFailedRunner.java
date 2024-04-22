package uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
//		features = {"src\\test\\resources\\uiappfeatures"},
		
		features = {"@target/failedrun.txt"},
		
		glue = {"uiappfeatures"},
		
		plugin = {"pretty", 
				  "rerun:target/failedrun.txt"
		}
		
		
		
		
		)

public class AmazonFailedRunner extends AbstractTestNGCucumberTests{
	
	

}
