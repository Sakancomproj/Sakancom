package jana;

import java.util.logging.Logger;


public class Report {
	
	private static final Logger logger = Logger.getLogger(Report.class.getName());
	 static boolean encom=false;
	static Database db4=new Database();
	
	 Report() {}
	public static  boolean showall() {
		
		logger.info("encome of the company: ");
		   encom=db4.encome();
		 
		   logger.info("show all orders in the company: ");
		   db4.showAllOrder();
		   logger.info("show all apartments in the company: ");
		   db4.showAllApartments();
		return true;
	}

}
