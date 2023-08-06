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

Scenario: Create new apartment
Given  that the owner with email "deema@gmail.com" is log in 
And there is an apartment  with location "Rafedia" ,capacity "Three",picture "c5", description "three beds,bathroom and kitchen" 
Then the  apartment  with location "Rafedia" ,capacity "Three",picture "c5", description "three beds,bathroom and kitchen" is created successfully