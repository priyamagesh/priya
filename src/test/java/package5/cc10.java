package package5;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cc10 {
	@Given("i enter username as {string}")
	public void i_enter_username_as(String x) {
		System.out.println(x);
	    }

	@And("i enter password as {int}")
	public void i_enter_password_as(Integer y) {
		System.out.println(y);
	    }

	@And("i pass {double}")
	public void i_pass(Double z) {
		System.out.println(z);
		
	    }

	@Then("i click on login")
	public void i_click_on_login() {
		System.out.println("loggedin");
	    }




}
