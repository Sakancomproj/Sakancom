package jana;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import jana.Database;
import jana.Item;
import jana.User;

public class item_test {

	Item pro;
	User u1;
	Database db= new Database();
	
	 public item_test () {
		 u1=new User();
		 pro=new Item();
		 
		 
	 }
	
	boolean flag_created;
	
	boolean flag_email;
	boolean delete;
	
	@Given("that the user with email {string} is log in")
	public void that_the_user_with_email_is_log_in(String email) {
		 flag_created=false;
		
		 
		flag_email=db.checkemail(email);
		 

	}

	@And("there is an item  with Category {string} ,name {string},picture {string}, description {string}")
	public void there_is_an_item_with_category_name_picture_description( String string2, String string3, String string4, String string5) {
		db.createitem( string2, string3, string4, string5,10);
		flag_created=true;
	}

	@Then("the  item  with Category {string} ,name {string},picture {string}, description {string} is created successfully")
	public void the_item_with_category_name_picture_description_is_created_successfully(String string, String string2, String string3, String string4) {
	  assertTrue(flag_created);
	  assertTrue(flag_email);
	}

	
	
	@Given("that the user with email {string} wants to delete item")
	public void that_the_user_with_email_want_to_delete_item(String email2) {
		delete =false;

		 flag_email=db.checkemail(email2);
	   
	   
	   
	}

	@Given("the item with SN {string}")
	public void the_item_with_sn(String id) {
	db.deleteitem(id);
	delete =true;
	}

	@Then("the item with SN {string} is actually deleted")
	public void the_item_with_sn_is_actually_deleted(String string) {
		assertTrue(delete);
		assertTrue(flag_email);
		}
	
	boolean update;
	
	
	
	@Given("that the user is created item with SN {string} successfully")
	public void that_the_user_is_created_item_with_sn_successfully(String string) {
		update=false;
		flag_created=db.checkSN(string);
	}

	@Given("the item with SN {string} , Category {string} ,name {string},picture {string}, description {string}")
	public void the_item_with_sn_category_name_picture_description(String string, String string2, String string3, String string4, String string5) {
		db.updateitem(string, string2, string3, string4,string5);
		update=true;
	}

	@Then("the item with SN {string} is update")
	public void the_item_with_sn_is_update(String string) {
		assertTrue(flag_created);
		assertTrue(update);

	}
	boolean search;
	@Given("that the user with email {string} wants to search item")
	public void thatTheUserWithEmailWantsToSearchItem(String string) {
		search =false;

		 flag_email=db.checkemail(string);
	}

	@Given("the item with name {string}")
	public void theItemWithName(String string) {
		db.searchitem(string);
		search =true;
	}

	@Then("the item with name {string} is searched")
	public void theItemWithNameIsSearched(String string) {
		assertTrue(search);
	}
}
