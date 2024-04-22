package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = {"src\\test\\resources\\appfeatures\\Orders.feature"},
			
			glue = {"steps", "apphooks"},
			
			plugin = {"pretty"},
			
			publish = true,
			
			tags = "@sanity or @regression"
				
			
			
			)
	public class OrderRunner extends AbstractTestNGCucumberTests 
	{
	
	}
