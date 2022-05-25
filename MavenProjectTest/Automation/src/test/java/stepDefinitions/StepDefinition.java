package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

;

public class StepDefinition {

	
	@Given("^User is on NetBanking landing page$")
	public void user_login_into_the_application_with_and() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user is on net banking");
	}
	
	@When("^User login into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_the_application_with_username_and_password(String args1, String args2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(args1);
		System.out.println(args2);
	    
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Home page is populated");
	   
	}

	@And("^Cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed(String args) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Cards are displayed"+ args);
	
	}
	
}
