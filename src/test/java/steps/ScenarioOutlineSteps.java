package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	   System.out.println("Given statement");
	}

	@When("user enters {string} on form")
	public void user_enters_on_form(String string) {
		System.out.println("Entered name is "+string);
	}

	@When("user selects {string}")
	public void user_selects(String string) {
	   System.out.println("Selected gender is "+string);
	}

	@When("user select slot as {int}")
	public void user_select_slot_as(Integer int1) {
	   System.out.println("Selected slot value is "+int1);
	}

	@Then("user gets created")
	public void user_gets_created() {
	  System.out.println("then statement");
	}


}
