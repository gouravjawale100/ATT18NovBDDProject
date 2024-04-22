package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
	 System.out.println("Given statement");
	}

	@When("user enters following information")
	public void user_enters_following_information(DataTable dataTable) {
	   
		List<List<String>> data = dataTable.asLists();
		
		for(List<String> listValue :data)
		{
			System.out.println(listValue);
		}
		
		List<String> orangeList = data.get(0);
		
		String lastname = orangeList.get(1);
		
		System.out.println(lastname);
		System.out.println("*****************************");
//		Assignment: To print any list's element line by line
		
			for(String element :orangeList)
			{
				System.out.println(element);
			}
		
//		Another way to write the above lines for the list
			
		String lastnameBycombining	= data.get(0).get(1);
		
		System.out.println(lastnameBycombining);// Smith
			
//		Defining the data and reading it as Map
		
		
		List<Map<String, String>> data1 = dataTable.asMaps();
		
			String fname = data1.get(0).get("firstname");
		
		System.out.println("fname value is "+fname);//Erin
		
		
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	   System.out.println("Submit button");
	}

	@Then("account gets created")
	public void account_gets_created() {
	    System.out.println("Account created");
	}

}
