
Feature: Signup
I want to signup to the app
  

  
  Scenario: signed up successfully
      Given i enter firstname
      And i enter lastname
      Then i enter date of birth
      And i enter mobilenumber
      Given i enter username as"janu"
      And  i enter password as "tamizl123"
      When i click on to the register button
      Then the login page is displayed
      
