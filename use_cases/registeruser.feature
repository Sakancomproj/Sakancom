Feature: Register user to the Application 
	Description: a user register by id, phone ,name ,email,address and password
 Actor:user


Scenario: register user when the user is not logged  
	Given that the user is not logged  
	When the user with id "1"   register in the App
	And there is a user with id "1" phone "0592825419" , name "amr khammash",email "amr@gmail.com" ,address "Nablus" , and password "amr123" 
	Then the user with id "1"  phone "0592825419" , name "amr khammash",email "amr@gmail.com" ,address "Nablus" , and password "amr123" is registered in the Application 
	
Scenario: user registration failed 
	Given that the user opened sign up page
	When the user with id "1" , phone "0592825419" , name "amr khammash",email "amr@gmail.com" ,address "" , and password "amr123" is register 
	And one or more fields are not filled 
	Then error message "There are required fields that you did not fill out " is given

Scenario: register users when this user is already registered 
    Given that the user is trying to log into the application 
	When the user with  id "3" is already registered 
	#And the user tries to register for the second time 
	Then error message " This user is already registered" appears to the user
	