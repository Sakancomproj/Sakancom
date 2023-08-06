Feature: Owner
	Description: The owner logs in to the application,add apartments to the app,show the reserved ones.
 Actor: owner


Scenario: Owner login to the application
Given that the owner with email "deema@gmail.com" and pass "deema123" want to log in to the application
When  the owner with email "deema@gmail.com" and pass "deema123" logs in to the application
Then The owner is logged in successfully
 
 Scenario: Owner cant login to the application
Given that the owner with email "deema@gmail.com" and pass "deema123" want to log in to the application
When  the owner with email "deema@gmail.com" and pass "raya123" logs in to the application
Then The owner logging in failed 