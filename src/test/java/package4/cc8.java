package package4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cc8 {
	@Given("enter username as {string}")
	public void enter_username_as(String x) {
		System.out.println(x);
	   }

	@And("enter password as {string}")
	public void enter_password_as(String y) {
		System.out.println(y);
	    }

	@Then("click on the login")
	public void click_on_the_login() {
		System.out.println("login success");
	    }

	@Given("i need to search productname as {string}")
	public void i_need_to_search_productname_as(String string) {
		System.out.println("searching product");
	   }

	@And("add a product to cart")
	public void add_a_product_to_cart() {
		System.out.println(" add a product");
	    }

	@Then("the product is added to the cart")
	public void the_product_is_added_to_the_cart() {
		System.out.println("product is added");
	    }

	@Given("i want to select the payment option")
	public void i_want_to_select_the_payment_option() {
		System.out.println("selecting payment");
	    }

	@And("i click on the banking as {string}")
	public void i_click_on_the_banking_as(String string) {
		System.out.println("selecting banking");
	    }

	@Then("payment is done")
	public void payment_is_done() {
		System.out.println("payment done");
	   }

	@Given("i want to logout from the page")
	public void i_want_to_logout_from_the_page() {
		System.out.println("want to logout");
	    }

	@And("i click on the logout button")
	public void i_click_on_the_logout_button() {
		System.out.println("clicking logout");
	    }

	@Then("i get loggedout from the page")
	public void i_get_loggedout_from_the_page() {
		System.out.println("loggedout");
	    }



}
