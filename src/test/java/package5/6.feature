Feature: login
  I want to login to the page

  
  Scenario: successfull login
    Given enter url
    And i enter username and password
      | username  | password | 
      | janu      |     abc@#| 
      | tamizl    |     abc$%| 
    When i click on login button
    
    
    
    
    
    
    
    
    
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
