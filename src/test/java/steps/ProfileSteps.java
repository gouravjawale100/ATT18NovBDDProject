package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
//to import the multiple entities inside the class - CTRL+SHIFT+O
	@Given("user should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("Given statemtent");
	}

	@When("user click on profile")
	public void user_click_on_profile() {
	    System.out.println("Clicking on profile");
	}

	@Then("profile page should display")
	public void profile_page_should_display() {
	   System.out.println("Profile page validation");
	}

	@When("user click on add profile")
	public void user_click_on_add_profile() {
	   System.out.println("Add profile");
	}

	@Then("profile should get added")
	public void profile_should_get_added() {
	    System.out.println("Profile addition");
	}

	@When("user click on edit profile")
	public void user_click_on_edit_profile() {
	    System.out.println("Edit profile");
	}

	@Then("profile should get modified")
	public void profile_should_get_modified() {
		 System.out.println("Profile modification");
	}

	@When("user click on delete profile")
	public void user_click_on_delete_profile() {
		 System.out.println("delete profile");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		 System.out.println("Profile deletion");
	}
	
}
