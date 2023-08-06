package jana;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class admin_step {
	Database db=new Database();
	boolean flag_email;
	boolean search;
	
	@Given("that the admin with email {string} wants to search user")
	public void thatTheAdminWithEmailWantsToSearchUser(String string) {
		search =false;

		 flag_email=db.checkemail(string);
	}

	@Given("the user with name {string}")
	public void theUserWithName(String string) {
		db.searchuser(string);
		search =true;
	}

	@Then("the user with name {string} is searched")
	public void theUserWithNameIsSearched(String string) {
		assertTrue(search);
	}
	
}
