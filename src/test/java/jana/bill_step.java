package jana;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;

public class bill_step {

	Order o_obj1=new Order();
	boolean flag_completed=false ;
	boolean flag_completed2=false ;

	int toloal_price=0;
	int totoal_price_act ;
	float order_price;
	boolean flag_pric=false ;
	String  id;
	
	String  id_user;
	Database db=new Database();
	
	@Given("order with id {string} for the user with id {string} has been completed")
	public void orderWithIdForTheUserWithIdHasBeenCompleted(String string, String string2) {
		flag_completed=	db.iscomplete(string2,string);
		id_user=string;
		id=string2;
	}

	@When("the price of the order is {string}")
	public void thePriceOfTheOrderIs(String string) {
		toloal_price=Integer.parseInt(string);
		order_price= Float.parseFloat(string);
		if (o_obj1.isprice(order_price,id_user,id) )
		{ 

		}
	}

	@When("the price for delivery is {string}")
	public void thePriceForDeliveryIs(String string) {
		toloal_price+=Integer.parseInt(string);
	}

	@When("the toltal price is {string}")
	public void theToltalPriceIs(String string) {
		totoal_price_act=Integer.parseInt(string);
	}

	@Then("create bill successfully")
	public void createBillSuccessfully() {
		assertFalse(flag_completed);
		assertEquals(totoal_price_act,toloal_price );
		assertFalse(flag_pric);
	}
	
	@Given("the order is in state completed or waiting")
	public void theOrderIsInStateCompletedOrWaiting() {
	    
	}

	@Then("create bill not success")
	public void createBillNotSuccess() {
		assertTrue(!flag_completed2);
	}
}
