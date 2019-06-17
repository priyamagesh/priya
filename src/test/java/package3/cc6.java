package package3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cc6 {

@Given("I want to enter username {string} in username field")
public void i_want_to_enter_username_in_username_field(String x) {
	System.out.println(x);
    }

@When("I enter password {string} in password field")
public void i_enter_password_in_password_field(String y) {
	System.out.println(y);
    }

@Then("I click on the login")
public void i_click_on_the_login() {
	System.out.println("logged in");
   }

}
