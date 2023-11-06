package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;


public class DsAlgoPortalHomeSD {

	@Given("The user opens DS Algo portal link")
	public void clickPrtal() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user opens DS Algo portal link");
	    
	}
	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user should land in DS Algo portal page");
	}

	@Given("The user opens DS Algo portal link again")
	public void clickPortalAgain() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user opens DS Algo portal link again");
	}
	@When("The user clicks the 'Get Started' button")
	public void the_user_clicks_the_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user clicks the button");
	}
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user should be redirected to homepage");
	}
}
