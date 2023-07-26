Feature: user reservation
	Description: The user reserves an apartment ,cancels his reservation if it has not been started,
	 requests the current stage of his reservation, and when his reservation is ready and verified.
 Actor: user

Scenario: Create new reservation
 Given that The user submits a new reservation in his bag and  he is already registered in the application
 When  the user  number "5" enters the information of apartment which the number "6"
Then  the request registered successfuly

Scenario: Cancellation of reservation by the user
Given that the user with the number "3" requests to cancel a reservation with number "4" 
When  the user with no "3" cancels his reservation with number "4"
Then  the reservation  canceled successfully

Scenario: reservation status in app
Given that user with the number "3" requests the status of his reservation
When  the user with no "3" requests the status of reservation number "6"
Then  the reservation status will be displayed

Scenario: Create a new reservation
 Given that The user submits a new reservation and  he is already registered in the application
 When  the user with number "2" enters the information of reservation number "3"
Then  the request registered successfully

Scenario: Cancellation of a reservation by the user
Given that the user with the number "3" requests to cancel an reservation with number "3" 
When  the user with number "3" cancels his reservation with number "3"
Then  the reservation was canceled successfully

Scenario: reservation status
Given that the user with the number "3" requests the status of his request
When  the user with number "3" requests the status of reservation number "3"
Then  your reservation status will be displayed

Scenario: specific reservation information
Given that the user with number "3" requests specific reservation information
When  the user with number "3" requests information about his reservation number "3"
Then  display the required reservation information

Scenario: Receipt of the reservation and the payment 
Given that the user with number "2" wants to receive his reservation with No. "3" was in a state of ready.
When   the user with number "2" requests to receive his reservation number "3" and pay his debt
Then the application received and the debt was paid
