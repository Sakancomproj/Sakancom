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


}
