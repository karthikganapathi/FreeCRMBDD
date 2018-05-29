package hookStepDefiniations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hookingStepDefiniations {

	
	@Before
	public void setup(){
		
		System.out.println("Lunch FF");
		System.out.println("Enter URl Fre CRm");
		
	}
	
	@After
	public void Teardown(){
		
		System.out.println("close the browser");
		
		
	}
	
	@Given("^User is in deal page$")
	public void user_is_in_deal_page() {
		System.out.println("user is in deal page");

	}

	@When("^Userf fills all the details$")
	public void userf_fills_all_the_details() {
     
		System.out.println("user enters all deal details");
	}

	@Then("^Deal page is created$")
	public void deal_page_is_created() {
		System.out.println(" deal created");

	}

}
