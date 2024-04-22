package uiappfeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());

	@Given("I am at landing page")
	public void i_am_at_landing_page() {
	   WebDriver driver = DriverFactory.getDriver();
	   
	   driver.get("https://www.amazon.in/");
	   driver.navigate().refresh();
	}

	@Then("page title should have {string}")
	public void page_title_should_have(String expectedWord) {
		String title = homepage.getTitleOfPage();
		
		boolean isPresent = title.contains(expectedWord);
		
		Assert.assertEquals(isPresent, true);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	   
		boolean isGettingDisplayed = homepage.verifyCartIcon();
		
		Assert.assertTrue(isGettingDisplayed);
		
		
	}

	@When("I see the sport toys then I click on it")
	public void i_see_the_sport_toys_then_i_click_on_it() {
	    
		homepage.enteringDealSection();
		
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
	    homepage.goToSignIn();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String uname) {
	   homepage.enteringUsername(uname);
	}

	@When("user enters password as {string} with signin")
	public void user_enters_password_as_with_signin(String pwd) {
		homepage.finalSignIn(pwd);
	}

}
