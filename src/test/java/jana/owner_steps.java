package jana;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import jana.Database;
import jana.Owner;
import io.cucumber.java.en.*;

public class owner_steps {
	Database db =new Database ();
	Owner ow=new Owner();
	boolean log_ow;
boolean flag_created;
	
	boolean flag_email;
@Given("that the owner with email {string} and pass {string} want to log in to the application")
public void thatTheOwnerWithEmailAndPassWantToLogInToTheApplication(String string, String string2) {
	Owner.checkifexi8( string,  string2);
}

@When("the owner with email {string} and pass {string} logs in to the application")
public void theOwnerWithEmailAndPassLogsInToTheApplication(String string, String string2) {
	if (Owner.logowner==true)
	   {
		   log_ow=true;
	   }
}

@Then("The owner is logged in successfully")
public void theOwnerIsLoggedInSuccessfully() {
	assertTrue(log_ow);
}
@Then("The owner logging in failed")
public void theOwnerLoggingInFailed() {
	assertTrue(log_ow);
}

@Given("that the owner with email {string} is log in")
public void thatTheOwnerWithEmailIsLogIn(String string) {
	flag_created=false;
	
	 
	flag_email=db.checkemail(string);
}

@Given("there is an apartment  with location {string} ,capacity {string},picture {string}, description {string}")
public void thereIsAnApartmentWithLocationCapacityPictureDescription(String string, String string2, String string3, String string4) {
	db.createapartment( string, string2, string3, string4,100);
	flag_created=true;
}

@Then("the  apartment  with location {string} ,capacity {string},picture {string}, description {string} is created successfully")
public void theApartmentWithLocationCapacityPictureDescriptionIsCreatedSuccessfully(String string, String string2, String string3, String string4) {
	 assertTrue(flag_created);
}

}
