package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
@Given("I am at login screen")
public void i_am_at_login_screen() {
    System.out.println("Given");
}



@When("I enter username")
public void i_enter_username() {
  System.out.println("When statement"); 
}

@When("I enter password")
public void i_enter_password() {
    System.out.println("When statement for enting password");
}

@When("I click on login button")
public void i_click_on_login_button() {
  System.out.println("Login button");
}

@Then("I redirects to home page")
public void i_redirects_to_home_page() {
   System.out.println("Validating login");
}

//@Given("I should be at login page")
//public void i_should_be_at_login_page() {
//    System.out.println("On login screen");
//}

@Then("I should see title")
public void i_should_see_title() {
   System.out.println("Title verified");
}

	

}
