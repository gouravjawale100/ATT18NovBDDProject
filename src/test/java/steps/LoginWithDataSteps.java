package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User is at loginpage")
	public void user_is_at_loginpage() {
	   System.out.println("Given statement");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String uname) {
	    System.out.println("Entered username is "+uname);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pwd) {
	    System.out.println("Entered password as :"+pwd);
	}

	@When("User clicks on submit")
	public void user_clicks_on_submit() {
	  System.out.println("submitting the data");
	}
	
	@When("user selects {int} server")
	public void user_selects_server(Integer int1) {
	   System.out.println("Server is "+int1);
	}


	@Then("User gets logged in")
	public void user_gets_logged_in() {
	   System.out.println("User logged in"); 
	}


}
