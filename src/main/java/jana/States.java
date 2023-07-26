package jana;
import java.util.logging.Logger;


public class States {

	 private static final Logger logger = Logger.getLogger(States.class.getName());

		float encom;
		 Database db=new Database();
	  static  float deptamount;
		
		
	boolean flag=false;

		public boolean pay() {
			for (int i=0;i<db.dborder.size();i++) {
				if(db.dborder.get(i).timeReceipt==0) {
logger.info("order received and paid for: order number= ");
	logger.info(db.dborder.get(i).idorder);
					logger.info("order price= ");
					String hh0=db.dborder.get(i).price+"";
					logger.info(hh0);
					flag=true; 
					return true;
				}
			}
			
		return false;
		
		
		}
}
