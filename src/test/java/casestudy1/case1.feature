
Feature: adding new product to TestMe application
user has to login as admin in TestMe application
  

  @tag1
  Scenario: login as admin
  Given i want to enter url and open web browser
  Given i want to enter username as admin
  And i want to enter an admin password
  And i want to click on login
  
  @tag2
  Scenario: add a new product
  
  And i want fill all mandatory details
  Then i want to click on add product button
  
  
  
  