package jana;

import java.time.LocalDate;


public class Reservation {

	String idreservation;
    String sn;
    String name;
	String id;
    int count;
	float price;
		
	 float discount=0;
		
	 long timeReceipt;
	
	  LocalDate lateDate;
	  LocalDate startdate;
	
		 static Database db=new Database();
	
		 float totalprice1;
	
		 boolean paid=false;
		 
		 
		 
}
