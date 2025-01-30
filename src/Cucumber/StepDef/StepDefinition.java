package Cucumber.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("{string} site")
	public void site(String string) {
	    System.out.println(string +"is printed");
	   
	}

	@When("user hits url")
	public void user_hits_url() {
	    System.out.println("user hits the url");    
	    
	}

	@Then("home page is visible")
	public void home_page_is_visible() {
	    System.out.println("home is visible printed"); 
	}



}
