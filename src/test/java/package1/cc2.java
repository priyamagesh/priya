package package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cc2 {
	@Given("i enter username")
	public void i_enter_username() {
		System.out.println("janu");
	   	}

	@And("i enter password")
	public void i_enter_password() {
		System.out.println("acc@@123");
	    	}

	@And("i click on to the login button")
	public void i_click_on_to_the_login_button() {
		System.out.println("button");
	    }

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		System.out.println("homepage");
	   	}


}
