package stepDefinition;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.AlgoPortalHome;

public class DsAlgoPortalHomeSD extends BaseClass {

	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		AP = new AlgoPortalHome();
	}

	@Given("User opens URL {string}")
	public void user_opens_url(String URL) {
		driver.get(URL);
	}

	@Then("User should Land In DS Algo portal page")
	public void user_should_land_in_ds_algo_portal_page() {

	}

	@When("User click on Get Started")
	public void user_click_on_get_started() {
		AP.clickGetStartedbtn();
	}

	@Then("User should be redirected to homepage")
	public void user_should_be_redirected_to_homepage() {
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}

	@Then("User should see six panes with different data structures")
	public void user_should_see_six_panes_with_different_data_structures() {
	}

//Home Page

	@Given("User opens Home Page")
	public void user_opens_home_page() {
	}

	@When("User click on Data Structures drop down")
	public void user_click_on_data_structures_drop_down() {
		AP.ClickDrpdwn();
		System.out.println("I clicked dropdown");
	}

	@Then("User should see six different data structure entries in that drop down")
	public void user_should_see_six_different_data_structure_entries_in_that_drop_down() {
	}

	@When("User click any data structures item from the drop down without Sign in")
	public void user_click_any_data_structures_item_from_the_drop_down_without_sign_in() {
		AP.ClickArray();
	}

	@When("User click on Get Started below the data structure")
	public void user_click_on_get_started_below_the_data_structure() {
		AP.ClickGetstartd();
		System.out.println("I clicked Stsrted button");
	}

	@Then("It should alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String Text) {

		if (driver.getPageSource().contains(Text)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@When("User click on Sign in")
	public void user_click_on_sign_in() {
		AP.ClickSignin();
	}

	@Then("User should be redirected to Sign in page")
	public void user_should_be_redirected_to_sign_in_page() {
	}

	@Then("Page title will be {string}")
	public void page_title_will_be(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}

	@When("User click on Register")
	public void user_click_on_register() {
		AP.ClickRegistr();
	}

	@Then("User should be redirected to Register form")
	public void user_should_be_redirected_to_register_form() {
	}
}