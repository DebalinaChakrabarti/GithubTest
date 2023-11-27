package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LinkdList;
import pageobject.Tree;

public class TreeSD  extends BaseClass{
	   
	   @Before
		public void setUp() {
			TP = new Tree();
		
	   }				


//@When("user clicks on Get Started")
//public void user_clicks_on_get_started() {
//    TP. clickGetStartd();
//}

@When("user clicks on sign in")
public void user_clicks_on_sign_in() {
    TP.clickSignin();
}

@Then("user enters {string} and {string}")
public void user_enters_and(String uname, String pwd)throws InterruptedException  {
	
		System.out.println("Enter Username");
		TP.enterUsername("skywalkers");
		TP.enterPassword("password150@");
	}

@Given("user launch chorme browser")
public void user_launch_chorme_browser() {
   
}
@Given("user opens URl {string}")
public void user_opens_u_rl(String url) {
 
}
@Then("user click on login")
public void user_click_on_login() {
TP.clickLogin();
}




@When("user click on Get Started button below the Tree")
public void user_click_on_get_started_button_below_the_tree() {
	TP.clickGetStartd();
}

@Then("it should redirected to Tree Page")
public void it_should_redirected_to_tree_page() {
  
}

@Given("user is in the Tree page after logged in")
public void user_is_in_the_tree_page_after_logged_in() {
    
}




@When("user clicks Overview of Trees button")
public void user_clicks_overview_of_trees_button() {
    TP.clickoverviewofTrees();
}
@Then("user should be directed to Overview of Trees Page")
public void user_should_be_directed_to_overview_of_trees_page() {
    
}
@Then("User click TryHere button and redirected to TryEditor and click on run when it enter data from Excel")
public void user_click_try_here_button_and_redirected_to_try_editor_and_click_on_run_when_it_enter_data_from_excel() {
    TP.tryhere();
   /// TP.editor();
    TP.getExcelData();
   /// TP.Run();
}


@Given("The user is in the Tree page after logged in")
public void the_user_is_in_the_tree_page_after_logged_in() {
    
}

@When("The user clicks Terminologies button")
public void the_user_clicks_terminologies_button() {
    TP.terminologies();
}
@Then("The user should be directed to Terminologies Page")
public void the_user_should_be_directed_to_terminologies_page() {
    
}
@Then("The user clicks Try Here link and The user should be redirected to a page having an tryEditor with a Run button")
public void the_user_clicks_try_here_link_and_the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
    TP.tryhere();
  ///  TP.editor();
   
}
@Then("take data from excel and Run them")
public void take_data_from_excel_and_run_them() {
   TP.getExcelData();
	////TP.Run();
}

@When("User click on Types of Trees button")
public void user_click_on_types_of_trees_button() {
TP.typesoftrees();
}
@Then("The user should be directed to Types of Trees Page")
public void the_user_should_be_directed_to_types_of_trees_page() {
   
}
@Then("click Try Here button then The user should be connecte to  tryEditor and run code from Excel sheet and click Run button")
public void click_try_here_button_then_the_user_should_be_connecte_to_try_editor_and_run_code_from_excel_sheet_and_click_run_button() {
    TP.tryhere();
   /////// TP.editor();
    TP.getExcelData();
    ////TP.Run();
}

@When("The user clicks Tree Traversals button")
public void the_user_clicks_tree_traversals_button() {
   TP.treetraversals();
}
@Then("The user should be directed to Tree Traversals Page")
public void the_user_should_be_directed_to_tree_traversals_page() {
    
}
@Then("clicks Try Here  and it will redirected to a page having an tryEditor with a Run to test")
public void clicks_try_here_and_it_will_redirected_to_a_page_having_an_try_editor_with_a_run_to_test() {
 TP.tryhere();
 //TP.editor();
 
}
@Then("enter code and Run code")
public void enter_code_and_run_code() {
	TP.getExcelData();
	//TP.Run();
}
@When("user clicks Traversals-Illustration button")
public void user_clicks_traversals_illustration_button() {
  TP.traversalsillustration();
}
@Then("user should be directed to Traversals-Illustration Page")
public void user_should_be_directed_to_traversals_illustration_page() {
    
}
@Then("user try Try Here link and to a page tryEditor to run it with the excel code and click run")
public void user_try_try_here_link_and_to_a_page_try_editor_to_run_it_with_the_excel_code_and_click_run() {
   TP.tryhere();
  // TP.editor();
   TP.getExcelData();
  // TP.Run();

}
@When("The user clicks Binary Trees button")
public void the_user_clicks_binary_trees_button() {
    TP.binarytrees();
}
@Then("The user should be directed to Types Treesof Binary  Page")
public void the_user_should_be_directed_to_types_treesof_binary_page() {
   
}
@When("user clicks Try Here button then it  should  redirected to  tryEditor with a Run button to code verification from excel sheet")
public void user_clicks_try_here_button_then_it_should_redirected_to_try_editor_with_a_run_button_to_code_verification_from_excel_sheet() {
  TP.tryhere();
 // TP.editor();
  
}
@When("click run button")
public void click_run_button() {
	TP.getExcelData();
	//TP.Run();
}

@When("The user clicks Binary Tree Traversals button")
public void the_user_clicks_binary_tree_traversals_button() {
    TP.binarytreetraversals();
}
@Then("The user should be directed to Binary Tree Traversals Page")
public void the_user_should_be_directed_to_binary_tree_traversals_page() {
   
}
@Given("the code from excel to tryEditor   when the user click on Try Here button  and run the excel code but clicking on run button")
public void the_code_from_excel_to_try_editor_when_the_user_click_on_try_here_button_and_run_the_excel_code_but_clicking_on_run_button() {
   TP.tryhere();
  // TP.editor();
   TP.getExcelData();
  // TP.Run();
}

@When("user clicks Implementation in Python button")
public void user_clicks_implementation_in_python_button() {
 TP.implementationinPython();
}
@Then("user should be directed to Implementation in Python Page")
public void user_should_be_directed_to_implementation_in_python_page() {
   
}
@Then("user run the code from Excel code into TryEditor when user clicks on Try Here button")
public void user_run_the_code_from_excel_code_into_try_editor_when_user_clicks_on_try_here_button() {
   TP.tryhere();
 //  TP.editor();
   TP.getExcelData();
  // TP.Run();
}

@When("The user clicks Implementation of Binary Trees button")
public void the_user_clicks_implementation_of_binary_trees_button() {
TP.implementationofbinarytrees();
}
@Then("The user should be directed to Implementation of Binary Trees Page")
public void the_user_should_be_directed_to_implementation_of_binary_trees_page() {
   
}
@When("user click Try Here button and user is in  tryEditor  page and implement a code from Excel")
public void user_click_try_here_button_and_user_is_in_try_editor_page_and_implement_a_code_from_excel() {
    TP.tryhere();
   // TP.editor();
    TP.getExcelData();
}
@When("run by run button")
public void run_by_run_button() {
	
	//TP.Run();
}

@When("The user clicks Applications of Binary trees button")
public void the_user_clicks_applications_of_binary_trees_button() {
   TP.applicationsofbinarytrees();
}
@Then("The user should be directed to Applications of Binary trees Page")
public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
   
}
@When("user is in  tryEditor page after clicking Try Here button")
public void user_is_in_try_editor_page_after_clicking_try_here_button() {
    TP.tryhere();
   // TP.editor();
}
@Then("user  apply the code from excel and run it by run button")
public void user_apply_the_code_from_excel_and_run_it_by_run_button() {
	TP.getExcelData();
	//TP.Run();
}


@When("The user clicks Binary Search Trees button")
public void the_user_clicks_binary_search_trees_button() {
   TP.binarysearchtrees();
}
@Then("The user should be directed to Binary Search Trees Page")
public void the_user_should_be_directed_to_binary_search_trees_page() {
    
}
@Given("the code from excel sheet to Run on tryEditor page when user click on Try Here button")
public void the_code_from_excel_sheet_to_run_on_try_editor_page_when_user_click_on_try_here_button() {
  TP.tryhere();
 // TP.editor();
  TP.getExcelData();
}
@Then("user clicks on run button")
public void user_clicks_on_run_button() {
  //TP.Run();
}

@When("The user clicks Implementation Of BST button")
public void the_user_clicks_implementation_of_bst_button() {
    TP.implementationofBST();
}
@Then("The user should be directed to Implementation Of BST Page")
public void the_user_should_be_directed_to_implementation_of_bst_page() {
   
}
@When("the user click on Try Here then it will enter to tryEditor page and takes a code from excel and run it by run button")
public void the_user_click_on_try_here_then_it_will_enter_to_try_editor_page_and_takes_a_code_from_excel_and_run_it_by_run_button() {
   TP.tryhere();
  // TP.editor();
   TP.getExcelData();
   //TP.Run();
}

@When("user will click on Practice Questions button")
public void user_will_click_on_practice_questions_button() {
	TP.clickoverviewofTrees();
    TP.practicequestions();
}
@Then("The user should be redirected to Practice page")
public void the_user_should_be_redirected_to_practice_page() {
  
}

}

