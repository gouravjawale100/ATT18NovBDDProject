package uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeatures"},
		
		glue = {"uiappfeatures"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		
		publish = true,
		
		tags = "@basic"
		
		
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests
{

}
