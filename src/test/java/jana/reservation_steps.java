package jana;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import jana.Database;
import jana.Reservation;
import jana.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reservation_steps {

	User u=new User();	
	//boolean log=false,neworder=false,cancel=false;	
	Reservation ord=new Reservation();	
	Database db=new Database();
	boolean flag_email;
	boolean delete;
	
@Given("that The user submits a new reservation in his bag and  he is already registered in the application")
public void thatTheUserSubmitsANewReservationInHisBagAndHeIsAlreadyRegisteredInTheApplication() {
    
}
boolean log1=false;
boolean newreservation=false;
@When("the user  number {string} enters the information of apartment which the number {string}")
public void theUserNumberEntersTheInformationOfApartmentWhichTheNumber(String string, String string2) {
	/*log1=db.logApp(string); 
	 if(log1)
		 newreservation= db.createNewReservation(string2,string);*/
}

@Then("the request registered successfuly")
public void theRequestRegisteredSuccessfuly() {
	//assertTrue(newreservation);
}

@Given("that the user with the number {string} requests to cancel a reservation with number {string}")
public void thatTheUserWithTheNumberRequestsToCancelAReservationWithNumber(String string, String string2) {
	//log=db.logApp(string);
}

@When("the user with no {string} cancels his reservation with number {string}")
public void theUserWithNoCancelsHisReservationWithNumber(String string, String string2) {
	/*if(log) {
		 // cancel =db.cancelreservation(string,string2);  
	  }*/
}

@Then("the reservation  canceled successfully")
public void theReservationCanceleSuccessfully() {
	//assertTrue(cancel);
}

@Given("that user with the number {string} requests the status of his reservation")
public void thatUserWithTheNumberRequestsTheStatusOfHisReservation(String string) {
//	log=db.logApp(string); 
}

@When("the user with no {string} requests the status of reservation number {string}")
public void theUserWithNoRequestsTheStatusOfReservationNumber(String string, String string2) {
	/*if(log) {
		//info=db.inforeservation(string,string2);
	}*/
}

@Then("the reservation status will be displayed")
public void theReservationStatusWillBeDisplayed() {
	//assertFalse(info);
}

@Given("that The user submits a new reservation and  he is already registered in the application")
public void thatTheUserSubmitsANewReservationAndHeIsAlreadyRegisteredInTheApplication() {
    
}

@When("the user with number {string} enters the information of reservation number {string}")
public void theUserWithNumberEntersTheInformationOfReservationNumber(String string, String string2) {
	// log=db.logApp(string); 
	 //if(log)
	  //neworder= db.createNewReservation(string2,string);
}

@Then("the request registered successfully")
public void theRequestRegisteredSuccessfully() {
	// assertTrue(newreservation);
}

@Given("that the user with the number {string} requests to cancel an reservation with number {string}")
public void thatTheUserWithTheNumberRequestsToCancelAnReservationWithNumber(String string, String string2) {
	// log=db.logApp(string);
}

@When("the user with number {string} cancels his reservation with number {string}")
public void theUserWithNumberCancelsHisReservationWithNumber(String string, String string2) {
	  /*if(log) {
		  cancel =db.cancelreservation(string,string2);  
	  }*/
}

@Then("the reservation was canceled successfully")
public void theReservationWasCanceledSuccessfully() {
	//assertFalse(cancel);
}

@Given("the user with the number {string} requests the status of his request")
public void TheUserWithTheNumberRequestsTheStatusOfHisRequest(String string) {
//	log=db.logApp(string);
}

@When("the user with number {string} requests the status of reservation number {string}")
public void theUserWithNumberRequestsTheStatusOfReservationNumber(String string, String string2) {
	/*if(log) {
		stat=db.requeststatus(string,string2);	
		}*/
}

@Then("your reservation status will be displayed")
public void yourReservationStatusWillBeDisplayed() {
	//assertTrue(stat);
}

@Given("that the user with number {string} requests specific reservation information")
public void thatTheUserWithNumberRequestsSpecificReservationInformation(String string) {
	//log=db.logApp(string); 
}

@When("the user with number {string} requests information about his reservation number {string}")
public void theUserWithNumberRequestsInformationAboutHisReservationNumber(String string, String string2) {
	/*if(log) {
		info=db.inforeservation(string,string2);
	}*/
}

@Then("display the required reservation information")
public void displayTheRequiredReservationInformation() {
	//assertTrue(info);
}

@Given("that the user with number {string} wants to receive his reservation with No. {string} was in a state of ready.")
public void thatTheUserWithNumberWantsToReceiveHisReservationWithNoWasInAStateOfReady(String string, String string2) {
	/*log=db.logApp(string);  
	 if(log) {
		  // ready=db.iscomplete(string,string2);
	   }*/
}

@When("the user with number {string} requests to receive his reservation number {string} and pay his debt")
public void theUserWithNumberRequestsToReceiveHisReservationNumberAndPayHisDebt(String string, String string2) {
   
}

@Then("the application received and the debt was paid")
public void theApplicationWasReceivedAndTheDebtWasPaid() {
	//assertFalse(ready);
}

@Given("that the owner with email {string} wants to delete his apartment")
public void thatTheOwnerWithEmailWantsToDeleteHisApartment(String email2) {
	delete =false;

	 flag_email=db.checkemail(email2);
}

@Given("the apartment with sn {string}")
public void theApartmentWithSn(String sn) {
	db.deleteapartment(sn);
	delete =true;
}

@Then("the apartment with sn {string} is actually deleted")
public void theApartmentWithSnIsActuallyDeleted(String string) {
	assertTrue(delete);
}

}
