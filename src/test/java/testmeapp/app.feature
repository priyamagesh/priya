Feature: Testmeapp
  I want to open my testmeapp

  @tag1
  Scenario: successfull login
  Given i want to open chrome
  And open testmeapp
  Then i want to enter username and password
  And click on submit button and do login
  And click on add to cart 
  And make payment
  Then close
  