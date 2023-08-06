Feature: user requests
Description:The user modifies his personal information
 Actor: user
 

    	
Scenario: modify user information
    Given that the user with id "2" is logged in 
    When the user wants to modify his phone to "05923815502" , name to "Ahmad" ,email to "ahmad@gmail.com" ,adderss to "Ramallah" and password to "ahmad123"
    And the user modified his information without enter wrong or similar information another user 
    Then The modification was completed successfully    
    
