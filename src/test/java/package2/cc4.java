package package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cc4 {

@Given("i enter firstname")
public void i_enter_firstname() {
	System.out.println();
    }

@And("i enter lastname")
public void i_enter_lastname() {
	System.out.println();
   }

@Then("i enter date of birth")
public void i_enter_date_of_birth() {
	System.out.println("17/01/1994");
    
}

@And("i enter mobilenumber")
public void i_enter_mobilenumber() {
	System.out.println("8098494646");
    }

@Then("i enter username as{string}")
public void i_enter_username_as(String x) {
	System.out.println(x);
    }

@And("^i enter password as \"([^\"]*)\"$")
public void i_enter_password_as(String y) {
	System.out.println(y);
    }

@When("i click on to the register button")
public void i_click_on_to_the_register_button() {
	System.out.println("register");
    }

@Then("the login page is displayed")
public void the_login_page_is_displayed() {
	System.out.println("login page");
    }

}
