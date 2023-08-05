Feature: user order
	Description: The user submits an order to the company, amends the order,
	 cancels his order if it has not been started, requests the current stage of his order, and receives the order
 Actor: user


Scenario: Create new order
 Given that The user submits a new order in his bag and  he is already registered in the application
 When  the user  number "5" enters the information of order which the number "6" quantity 3 and type is "Sofa"
Then  the request is registered successfuly


Scenario: Cancellation of  order by the user
Given that the user with the no. "3" requests to cancel an order with number "4" before starting work on it
When  the user with no "3" cancels his order with number "4"
Then  the order is canceled successfully


Scenario: Create a new order
 Given that The user submits a new order and  he is already registered in the application
 When  the user with number "2" enters the information of order which the number "3" quantity 3 and type is "Sofa"
Then  the request is registered successfully


# not pass cause its in progress cause 5 day (this is the first order)
Scenario: Cancellation of an order by the user
Given that the user with the number "3" requests to cancel an order with number "3" before starting work on it
When  the user with number "3" cancels his order with number "3"
Then  the order was canceled successfully



Scenario: specific order information
Given that the user with number "3" requests specific order information
When  the user with number "3" requests information about his order number "3"
Then  display the required order information



Scenario: Receipt of the order and payment of the amount
Given that the user with number "2" wants to receive his order with No. "3" was in a state of completion.
When   the user with number "2" requests to receive his order number "3" and pay his debt
Then the application was received and the debt was paid


