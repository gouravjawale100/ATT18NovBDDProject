package uiappfeatures;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;

public class AppHooks {
	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void lauchBrowser() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String configFileBrowsername= prop.getProperty("browser");
		
		String commandPromptBrowserName = System.getProperty("cliBrowser");
		 
		if(commandPromptBrowserName != null)
		{
			configFileBrowsername= commandPromptBrowserName;
		}
		
		
		 df = new DriverFactory();
		
		 driver = df.initBrowser(configFileBrowsername);
		
		driver.manage().window().maximize();
		
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
	boolean isScenarioFailed = scenario.isFailed();
	
		if(isScenarioFailed)
		{
			String scenarioName = scenario.getName();
			
			String scenarioNameWithoutSpace = scenarioName.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", scenarioNameWithoutSpace);
			
		}
		
	}
	
	@After(order = 1)
	public void closingBrowser()
	{
		driver.quit();
	}
}
