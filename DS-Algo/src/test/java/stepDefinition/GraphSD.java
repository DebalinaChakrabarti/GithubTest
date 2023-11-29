package stepDefinition;



import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Graph;


public class GraphSD extends BaseClass{
	@Before
	public void setUp() {
		GP = new Graph();
	}
			
	
		
///	@Given("clicks  Get Started button in Graph then  it should be directed to Graph")
	//public void clicks_get_started_button_in_graph_then_it_should_be_directed_to_graph() {
	   
	//}
	@When("user clicks on Get Started below Graph")
	public void user_clicks_on_get_started_below_graph() {
		GP.ClickGetstarted();
	}
@Then("it should redirected to Graph Page")
public void it_should_redirected_to_graph_page() {
	Assert.assertEquals(BaseClass.getDriver().getTitle(), "Graph");
    
}		


@When("user click Graph button and  user should be directed to Graph Page")
		public void user_click_graph_button_and_user_should_be_directed_to_graph_page() {
			    GP.Clickgraph();
			}
@Then("click Try Here link and   should be redirected to a page having an tryEditor with  Run button")
			public void click_try_here_link_and_should_be_redirected_to_a_page_having_an_try_editor_with_run_button() {
			   GP.Clicktryhere();
			   //GP.Clickeditor();
			}
@Then("run the code from Excel")
  public void run_the_code_from_excel() {
			  // GP.Clickrunbutton();
	GP.getExcelData();
			}
			
			
@Given("user clicks Graph Representations button and user should  directed to Graph Representations Page")
	public void user_clicks_graph_representations_button_and_user_should_directed_to_graph_representations_page() {
			    GP.Clickgraphrepresentatio();
			}
			@Then("user clicks Try Here button")
			public void user_clicks_try_here_button() {
			   GP.Clicktryhere();
			   
			}
			@Then("should redirected to  page having an tryEditor with Run button to test")
			public void should_redirected_to_page_having_an_try_editor_with_run_button_to_test() {
			   // GP.Clickeditor();
				
			}
			@Then("get  code from excel and run")
			public void get_code_from_excel_and_run() {
			  // GP.Clickrunbutton();
				GP.getExcelData();
				BaseClass.getDriver().navigate().back();
			}
			@Then("user will click on Practice Questions button and  user should be redirected to Practice page")
			public void user_will_click_on_practice_questions_button_and_user_should_be_redirected_to_practice_page() {

				GP.Practicequestions();
				Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("graph/practice"));//checking if in practice page
				
			}	
}
