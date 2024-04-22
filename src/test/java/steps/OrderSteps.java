package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

@Given("user should be logged into app")
public void user_should_be_logged_into_app() {
    System.out.println("Login to app");
}

@Given("user is at the orders page")
public void user_is_at_the_orders_page() {
    System.out.println("Redirect to orders page");
}

@When("user clicks on order history")
public void user_clicks_on_order_history() {
   System.out.println("Click on order history");
}

@Then("user should see previously placed order")
public void user_should_see_previously_placed_order() {
   System.out.println("Previously placed order info");
}

@When("user clicks on current order")
public void user_clicks_on_current_order() {
  System.out.println("Click on current order");
}

@Then("user should see track order information")
public void user_should_see_track_order_information() {
    System.out.println("User see the current order info");
}

@When("user clicks on cancel order button")
public void user_clicks_on_cancel_order_button() {
   System.out.println("Cancelling order");
}

@Then("user should see cancelled order info")
public void user_should_see_cancelled_order_info() {
  System.out.println("Cancelling order information");  
}

}
