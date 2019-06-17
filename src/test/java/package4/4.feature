
Feature: login page
  I want to login to the page

  @tag1
  Scenario: successfull login
  Given enter username as "priya"
  And enter password as "tamizl17"
  Then click on the login
  
  @tag2
  Scenario: successfull product
  Given i need to search productname as "Handbag"
  And add a product to cart
  Then the product is added to the cart
  
  @tag3
  Scenario: payment
  Given i want to select the payment option
  And i click on the banking as "sbi"
  Then payment is done
  
  @tag4
  Scenario: logout
  Given i want to logout from the page
  And i click on the logout button
  Then i get loggedout from the page
  
  
  
  
  
 
