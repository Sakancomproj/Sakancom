
Feature: login and logout 
Description: The admin and user login and logout  to the system

#login
 
  @testlogin_admin 

   Scenario Outline: Login admin 
    Given that the admin is not logged in
    And I check for the email  and pass <email><pass>
    Then the admin login is  <status> 


    Examples: 
      | email             | pass         |status |
      | "jana@gmail.com"  | "jana123"    |success|
      | "raya@gmail.com"  | "123"        |Fail   |
      
       Scenario: Login an admin 
    Given that an admin is not logged in
    And I check for the email  and pass email "raya@gmail.com" pass "raya123"
    Then the admin login 
    
   @testlogin_user
  
       Scenario: user can login
    Given that the user is not logged in
    And I chek for email and password is "tala@gmail.com" "tala123"
    Then the user log in succeeds

       Scenario: user  cannot login
    Given that the user is not logged in
   	And I chek for email and  password is "wrong" "wrong"
		Then the user log in fails

#logout 
			Scenario: Admin log out
 		Given that the admin is logged in
		When the admin logs out
		Then the admin is logged out

			Scenario: user log out
		Given that the user is logged in
		When the user logs out
		Then the user is logged out
		
Scenario: delete user by id 
Given that the user with email "ahmad@gmail.com" wants to delete his account 
And the user with id "3"
Then the user with id "3" is actually deleted