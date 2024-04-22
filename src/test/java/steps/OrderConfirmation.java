package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmation {
	
	AddingProduct addingProduct;
	

	public OrderConfirmation(AddingProduct addingProduct)
	{
		this.addingProduct	= addingProduct;
	}
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("Clicked on place order button");
	}

	@Then("order should get confirmed")
	public void order_should_get_confirmed() {
	
		System.out.println("Order id generated");
		
	String prdId = addingProduct.getProductId();
		
		System.out.println("Received product id is "+prdId);
		
	}


}
