Feature: bill for customer

Scenario: create bill for customer successful
    Given order with id "3" for the user with id "3" has been completed 
    When the price of the order is "20"
    And the price for delivery is "15"
    And the toltal price is "35"
    Then create bill successfully
     
  

 Scenario: create bill for customer not successful
    Given order with id "4" for the user with id "3" has been completed 
    And the order is in state completed or waiting 
 Then create bill not success
