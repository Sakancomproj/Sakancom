package jana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import jana.Database;
import jana.Order;
import jana.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class order_steps {
	
User u=new User();	
boolean log=false,neworder=false,cancel=false;	
Order ord=new Order();	
Database db=new Database();

@Given("that The user submits a new order in his bag and  he is already registered in the application")
public void that_the_user_submits_a_new_order_in_his_bag_and_he_is_already_registered_in_the_application() {

}
boolean log1=false;
boolean neword=false;
@When("the user  number {string} enters the information of order which the number {string} quantity {int} and type is {string}")
public void the_user_number_enters_the_information_of_order_which_the_number_quantity_and_type_is(String string, String string2, Integer int1, String string3) {
	 log1=db.logApp(string); 
	 if(log1)
		 neword= db.createNewOrder(string2,string,int1,string3);
}

@Then("the request is registered successfuly")
public void the_request_is_registered_successfuly() {
	 assertTrue(neword);
}

@Given("that the user with the no. {string} requests to cancel an order with number {string} before starting work on it")
public void that_the_user_with_the_no_requests_to_cancel_an_order_with_number_before_starting_work_on_it(String string, String string2) {
	 log=db.logApp(string); 
}

@When("the user with no {string} cancels his order with number {string}")
public void the_user_with_no_cancels_his_order_with_number(String string, String string2) {
	 if(log) {
		  cancel =db.cancleorder(string,string2);  
	  }
}

@Then("the order is canceled successfully")
public void the_order_cancele_successfully() {
	 assertFalse(cancel);
}



@Given("that The user submits a new order and  he is already registered in the application")
public void that_the_user_submits_a_new_order_and_he_is_already_registered_in_the_application() {

}



@When("the user with number {string} enters the information of order which the number {string} quantity {int} and type is {string}")
public void the_user_with_number_enters_the_information_of_order_which_the_number_quantity_and_type_is(String string, String string2, Integer int1, String string3) {
	 log=db.logApp(string); 
	 if(log)
	   neworder= db.createNewOrder(string2,string,int1,string3);
}



@Then("the request is registered successfully")
public void the_request_is_registered_successfully() {
    assertTrue(neworder);
}


@Given("that the user with the number {string} requests to cancel an order with number {string} before starting work on it")
public void that_the_user_with_the_number_requests_to_cancel_an_order_with_number_before_starting_work_on_it(String string, String string2) {

	 log=db.logApp(string); 
	 
}

@When("the user with number {string} cancels his order with number {string}")
public void the_user_with_number_cancels_his_order_with_number(String string, String string2) {
  if(log) {
	  cancel =db.cancleorder(string,string2);  
  }
}

@Then("the order was canceled successfully")
public void the_order_was_canceled_successfully() {
	   assertFalse(cancel);
}

@Given("that the user with the number {string} requests the status of his request")
public void that_the_user_with_the_number_requests_the_status_of_his_request(String string) {
	log=db.logApp(string); 
	 
}


@Given("that the user with number {string} requests specific order information")
public void that_the_user_with_number_requests_specific_order_information(String string) {
	log=db.logApp(string); 
}
boolean info=false;
@When("the user with number {string} requests information about his order number {string}")
public void the_user_with_number_requests_information_about_his_order_number(String string, String string2) {
	if(log) {
		info=db.infoorder(string,string2);
	}
  
}


@Then("display the required order information")
public void display_the_required_order_information() {
	  assertFalse(info);
}
boolean complete=false;
@Given("that the user with number {string} wants to receive his order with No. {string} was in a state of completion.")
public void that_the_user_with_number_wants_to_receive_his_order_with_no_was_in_a_state_of_completion(String string, String string2) {
	log=db.logApp(string);  
	 if(log) {
		   complete=db.iscomplete(string,string2);
	   }
}
 

@When("the user with number {string} requests to receive his order number {string} and pay his debt")
public void the_user_with_number_requests_to_receive_his_order_number_and_pay_his_debt(String string, String string2) {
 
	
}

@Then("the application was received and the debt was paid")
public void the_application_was_received_and_the_debt_was_paid() {
	 assertFalse(complete);  
}
}
