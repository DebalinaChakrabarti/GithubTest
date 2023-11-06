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
	public void landPortalPage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user should land in DS Algo portal page");
	}

	@Given("The user opens DS Algo portal link again")
	public void clickPortalAgain() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user opens DS Algo portal link again");
	}
	@When("The user clicks the 'Get Started' button")
	public void clickGetStartedButton() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user clicks the button");
	}
	@Then("The user should be redirected to homepage")
	public void goToHomePage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user should be redirected to homepage");
	}

	@Given("The user opens Home Page")
	public void openHomePage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user opens Home Page");
	}
	@When("The user clicks 'Data Structures' drop down")
	public void clickDataSturctureButton() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user clicks tData Structure Drop Down");
	}
	@Then("The User should see 6 different data structure entries in that dropdown")
	public void seeDropDown() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The user should see 6 Diff Data Structure");
	}


}
