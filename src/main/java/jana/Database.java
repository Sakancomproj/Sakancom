package jana;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;





public class Database {

List <String> pass=new ArrayList <String>();
	 List <User> dbuser=new ArrayList <User> ();
	 List <Order> dborder=new ArrayList <Order> ();
	 List <Item> dbitem=new ArrayList <Item> ();
	 List <Owner> dbowner=new ArrayList <Owner> ();
	 List <Apartment> dbapartment=new ArrayList <Apartment> ();
	 private static final Logger logger = Logger.getLogger(Database.class.getName());
	 User obj1=new User();
	 User obj2=new User();
	 Item obj3=new Item();
	 Item obj4=new Item();
	 Item obj5=new Item();
	 Order obj6=new Order();
	 Order obj7=new Order();
	 Apartment obj8=new Apartment();
	 Apartment obj9=new Apartment();
	 Apartment obj10=new Apartment();
	 
	 int equ=0;
	
	 User obj51=new User();
	 Order obj71=new Order();
	 
	 public Database() {
			pass.add("Taha45");
			pass.add("ahmad123");
			pass.add("farah1112");
			pass.add("saleh1112");
			pass.add("noor1112");
		
			f();
			
		}
	 
	 void f(){
			
			
			obj1.id="3";
			obj1.address="zawata";
			obj1.name="Taha";
			obj1.phone="0599874634";
			obj1.email="tahasoftware080@gmail.com";
			obj1.password=pass.get(0);
			obj1.log=true;
			obj1.point=60;
			dbuser.add(obj1);
			

			obj2.id="2";
			obj2.address="Ramallah";
			obj2.name="Ahmad";
			obj2.phone="05923815502";
			obj2.email="ahmad@gmail.com";
			obj2.password=pass.get(1);
			obj2.log=true;
			obj2.point=100;

			dbuser.add(obj2);
			
			obj3.category="Furniture";
			obj3.name="Sofa";
			obj3.picture="c1";
			obj3.sn="1";
			obj3.description="grey";
			obj3.price=20;
			
			dbitem.add(obj3);

			obj4.category="Accessorise";
			obj4.name="vasa";
			obj4.picture="c2";
			obj4.sn="2";
			obj4.description="wood";
			obj4.price=15;
			
			dbitem.add(obj4);

			 
			obj5.category="Furniture";
			obj5.name="bed";
			obj5.picture="c3";
			obj5.sn="3";
			obj5.description="single";
			obj5.price=10;
			
			dbitem.add(obj5);
			
			obj6.idorder="3";
			obj6.id="3";
			obj6.count=2;
			obj6.name="carpet";
		    obj6.lateDate=LocalDate.of(2023,4,19);
			obj6.timeReceipt=0;
			obj6.paid=false;
			obj6.price=20;
			obj6.totalprice1=35;
			
			dborder.add(obj6);
			
	 
			
			obj7.idorder="4";
			obj7.id="3";
			obj7.count=4;
			obj7.lateDate=LocalDate.of(2023,4,20);
			obj7.name="curtains";
			obj7.timeReceipt=3;
			obj7.price=40;
			obj7.paid=false;
			obj7.totalprice1=55;
			dborder.add(obj7);
			
			
		
			obj51.id="5";
			obj51.address="zawata...";
			obj51.name="Rami";
			obj51.phone="0597124134";
			obj51.email="Rami@gmail.com";
			obj51.password=pass.get(1);
			obj51.log=true;
			obj51.point=500;

			dbuser.add(obj51);
			
			obj71.idorder="6";
			obj71.id="5";
			obj71.count=1;
			obj71.lateDate=LocalDate.of(2023,4,30);
			obj71.name="curtains";
			obj71.timeReceipt=1;
			obj71.price=40;
			obj71.paid=false;
			obj71.totalprice1=40;
			dborder.add(obj71);
			
			obj8.location="Rafedia";
			obj8.capacity="Three";
			obj8.picture="c5";
			obj8.sn="1";
			obj8.description="three beds,bathroom and kitchen";
			obj8.price=300;
			
			dbapartment.add(obj8);
			
			obj9.location="Beitwazan";
			obj9.capacity="Two";
			obj9.picture="c8";
			obj9.sn="2";
			obj9.description="two beds,bathroom and kitchen";
			obj9.price=200;
			
			dbapartment.add(obj9);
			
			obj10.location="15 street";
			obj10.capacity="Five";
			obj10.picture="c5";
			obj10.sn="3";
			obj10.description=" 3 rooms,2 bathrooms and kitchen";
			obj10.price=600;
			
			dbapartment.add(obj10);
			
		}

	 
	 public void creatNewUser(String id,String phone,String name,String email, String address, String password ) {
			User obj17=new User();
			obj17.id=id;
			obj17.address=address;
			obj17.name=name;
			obj17.phone=phone;
			obj17.email=email;
			obj17.password=password;
			dbuser.add(obj17);
		}
	 
	 public  void createitem(String category1,String name1,String picture1,String description1,int price1)
		{ Item obj16=new Item();
			
			
				obj16.sn=Integer.toString(1+dbitem.size());

			
			
			obj16.category=category1;
			obj16.name=name1;
			obj16.picture=picture1;
			obj16.description=description1;
			obj16.price=price1;

		if (!dbitem.contains(obj16))
				dbitem.add(obj16);
			
		}
	 
	 public  void createapartment(String location1,String capacity1,String picture1,String description1,int price1)
		{ 
		 Apartment obj20=new Apartment();
			
			
				obj20.sn=Integer.toString(1+dbapartment.size());

			
			
			obj20.location=location1;
			obj20.capacity=capacity1;
			obj20.picture=picture1;
			obj20.description=description1;
			obj20.price=price1;

		if (!dbapartment.contains(obj20))
			dbapartment.add(obj20);
			
		}
	 
	 
	 public   boolean checkemail(String email)
		{  for (int i=0 ;i < dbuser.size();i++)
			{
				if (dbuser.get(i).email.equals(email))
			{return true;}
			}
		return false;
			
		}



		public  boolean checkpass(String pass)
		{  for (int i=0 ;i < dbuser.size();i++)
			{
				if (dbuser.get(i).password.equals(pass))
			{return true;
			
			}
			}
		return false;
			
		}
	 
	 public boolean logApp(String iduser) {

			for(int i=0;i< dbuser.size();i++ ) {
			if(dbuser.get(i).id.equals(iduser)) {
				return dbuser.get(i).log;
			}
			}
			return false;

			
		}
	 
	 public  boolean checkifexist(String id){
			
			for(int i=0;i< dbuser.size();i++ ) {
			if(dbuser.get(i).id.equals(id)) {
				return false; 
			}
			}
		
			return true;
		}
		
		
		public boolean checkfillfields(String string, String string2, String string3, String string4, String string5,
				String string6) {
			boolean fill=true;
			if(string.equals("")||string2.equals("")||string3.equals("")||string4.equals("")||string5.equals("")||string6.equals("")) {
				fill=false;
			}
			
				 
			
			return fill;
		}
		
		public boolean checkinfoTrue(int num,String id,String phon, String mail, String passwor) {
			boolean f=false;
			boolean f1=false;
			boolean f2=false;
			boolean f4=false;

	if(dbuser.isEmpty())return false;


			if(phon.equals("")||mail.equals("")||passwor.equals("")){return false;}
			else {
				for(int i=0;i< dbuser.size();i++ ) {
					
					if(!id.equals(dbuser.get(i).id)) {
				
					 if(dbuser.get(i).phone.equals(phon)){
					
						f=true;
					}
					 if(dbuser.get(i).email.equals(mail)) {
						
						f1=true;
					}
					 if(dbuser.get(i).password.equals(passwor)) {
						
	                	f2=true;
					}
					}
					
					} 
					
					 if(!(mail.contains("@"))) {
						f4=true;
						logger.info("The email you entered is wrong");
					} if(!(phon.length()==10 || phon.length()>10)) {
						logger.info("The phone number you entered is incorrect");
						f4=true;
					}
					 if(!(passwor.length()>6 || passwor.length()==6)) {
						 logger.info("The password you entered is weak");
						f4=true;
					}
					
			
			

		
			if(f || (f1&&f2) ||f4) {
				if(f ||(f1&&f2)) {
					if(num==1)
						logger.info("You already have an account.Please re_enter your information ");
					else if(num==2)	logger.info("The email and password are not valid. Please enter another ");
				}
				return false; 
			}
			return true;
			}
		}
		
		public void modifyinformation(String id2, String phone, String name, String email, String adders,
				String password) {
			for(int i=0;i< dbuser.size();i++ ) {
				if(dbuser.get(i).id.equals(id2)){
					dbuser.get(i).phone=phone;
					dbuser.get(i).name=name;
					dbuser.get(i).email=email;
					dbuser.get(i).address=adders;
					dbuser.get(i).password=password;
					dbuser.get(i).log=true;
				}}	
			logger.info("Your information has been modified ,this is your new information:");
			for(int i=0;i< dbuser.size();i++ ) {
				if(dbuser.get(i).id.equals(id2)){
					logger.info("name: ");
					logger.info(dbuser.get(i).name);
					logger.info(" phone:");
					logger.info(dbuser.get(i).phone);
					logger.info(" email:");
					logger.info(dbuser.get(i).email);
					logger.info(" address:");
					logger.info(dbuser.get(i).address);
					logger.info(" password:");
					logger.info(dbuser.get(i).password);
					
				}}	 
			
		}
	 
	 
	 
	 public boolean searchuser(String nameuser)
		{
			for(int i=0;i<dbuser.size();i++ ) {
				if(dbuser.get(i).name.equals(nameuser)) {
					logger.info("user's id: ");
					logger.info(dbuser.get(i).id);
					logger.info("user's Name: ");
					logger.info(dbuser.get(i).name);
					logger.info("user's Address: ");
					logger.info(dbuser.get(i).address);
					logger.info("user's Email: ");
					logger.info(dbuser.get(i).email);
					logger.info("user's Phone: ");
					logger.info(dbuser.get(i).phone);
					logger.info("user's Point: ");
					String oo=dbuser.get(i).point+"";
					logger.info(oo);
				 
					return true;
				}
			}
			logger.info("there is no user with this name.");
			return false;
			
		}
	 
	 
	 public  boolean createNewOrder(String idord,String iduser, Integer quantity, String type) {
			Order obj=new Order();
			obj.id=iduser;
			obj.count=quantity;
			obj.name=type;
			obj.idorder=idord;
			float pnt=0;
			float dis = 0;
			for(int i=0;i<dbitem.size();i++) {
				if(dbitem.get(i).name.equals(type)) {
					equ=dbitem.get(i).price;
				}
			}
			for(int i=0;i<dbuser.size();i++) {
				if(dbuser.get(i).id.equals(iduser)) {
					dbuser.get(i).point+=(quantity*equ);
					pnt=dbuser.get(i).point;
				
				}
			}
			obj.price=(quantity*equ);
			
			for(int i=0;i<dbuser.size();i++) {
			
				if(dbuser.get(i).id.equals(iduser) && pnt>=400) {
				
				
					dis=(float)(0.1*obj.price);
				}
				else dis=0;
				}
			
			
			obj.discount=(quantity*equ)-dis;
			
			LocalDate currentDate  = LocalDate.now();
	   
	obj.startdate=currentDate;
		long days=0;
	    for(int j=0;j<dborder.size();j++) {
	    	
	    	days=days+dborder.get(j).timeReceipt;
	    
	    }
	    
	 	LocalDate date2=currentDate.plusDays(days+2);
	 	long daysDiff = 0;
	 	
	 	 LocalDate dateBefore = currentDate;
	        LocalDate dateAfter =date2 ;
	         daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	        
	 	   
			
	 	obj.timeReceipt=daysDiff;
	    obj.paid=false;
		
				
	 
			
			
	 	obj.lateDate=date2;

		obj.totalprice1= (obj.discount+15);

		
				dborder.add(obj);
			return true;
			
		
		}
	 
	 
	 public String returnid(String email,String pass) {
			for(int i=0;i<dbowner.size();i++) {
				
				if(dbowner.get(i).email.equals(email)&&dbowner.get(i).password.equals(pass)) {
					return dbowner.get(i).id;
				}
			}
			
			return null;
		}
		
	 public String calcbalance(String id)
		{
		 String ret="";
		
		 for(int i=0;i<dbowner.size();i++) {
				if( dbowner.get(i).id.equals(id) ){
					
					
				int x=200;
				dbowner.get(i).balance= Integer.toString(x);
		        dbowner.get(i).balance=ret;

				}
				
				
			}
		 
			
			return ret;
				
			}
	 
	public Order ret(String iduser,String idorder) {
		for(int i=0;i<dborder.size();i++) {
			if(dborder.get(i).id.equals(iduser)&& dborder.get(i).idorder.equals(idorder)) {
				return dborder.get(i);
			}
		}
	return	 null;
	}
		public boolean cancleorder(String iduser, String idord) {
			
			 for(int k=0;k<dborder.size();k++) {
				 if(dborder.isEmpty())break;
				 else if( dborder.get(k).id.equals(iduser)&&dborder.get(k).idorder.equals(idord) && dborder.get(k).timeReceipt>2) {
					
				
					dborder.remove(k);
					
					for(int i=0;i<dborder.size();i++) {
		    			 
						logger.info("id= ");
						logger.info(dborder.get(i).idorder);
					logger.info(" , id user= ");
						logger.info(dborder.get(i).id);
						logger.info(" , type of order= ");
							logger.info(dborder.get(i).name);
						logger.info(" , discount= ");
						String n=dborder.get(i).discount+"";
						logger.info(n);
						logger.info(" , price= ");
						String h=dborder.get(i).price+"";
						logger.info(h);
									logger.info(" , received date= ");
									String  o=dborder.get(i).lateDate+"";
									logger.info(o);
									logger.info(" , days left= ");
									String l=dborder.get(i).timeReceipt+"";
									logger.info(l);
									logger.info(" , count= ");
									String p=dborder.get(i).count+"";
									logger.info(p);
									
						
																																							
					}
					
				
					 return true;
					
				 }
			 }
			return false;
		
		}
		public boolean iscomplete(String iduser, String id) {
			for(int i=0;i<dborder.size();i++) {
				if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
					if(dborder.get(i).timeReceipt==0) {
						logger.info("The order is ready for pickup.cash payment upon receipt of the order");
						dborder.get(i).paid=true;
							return true;
					}else {
						logger.info("The order is not ready for pickup.");
							
						return false;
					}
				}
				
				
			}
			logger.info("There is no order with this number to request its information.");
		
			return false;
		}
		
		
		public boolean infoorder(String iduser, String id) {
			for(int i=0;i<dborder.size();i++) {
				if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
				
					logger.info("id= ");
					logger.info(dborder.get(i).idorder);
					logger.info(" , id user= ");
					logger.info(dborder.get(i).id);
					logger.info(" , type of order= ");
					logger.info(dborder.get(i).name);
					logger.info(" , discount= ");
					String a=dborder.get(i).discount+"";
					String b=dborder.get(i).price+"";
					logger.info(a);
					logger.info(" , price= ");
					logger.info(b);
					logger.info(" , received date= ");
					String c=dborder.get(i).lateDate+"";
					logger.info(c);
					logger.info(" , days left= ");
					String d=dborder.get(i).timeReceipt+"";
					logger.info(d);
					logger.info(" , count= ");
					String e=dborder.get(i).count+"";
					logger.info(e);
					return true;
				}
				
			}
			logger.info("There is no order with this number to request its information.");
			return false;
		}
		
		public boolean searchitem(String name)
		{

			for(int i=0;i<dbitem.size();i++ ) {
				if(dbitem.get(i).name.equals(name)) {
					logger.info("item's SN: ");
					logger.info(dbitem.get(i).sn);
					logger.info("item's Name: ");
					logger.info(dbitem.get(i).name);
					logger.info("item's description: ");
					logger.info(dbitem.get(i).description);
					logger.info("item's price: ");
					String jj=""+dbitem.get(i).price;
					logger.info(jj);
					logger.info("item's Category: ");
					logger.info(dbitem.get(i).category);
					 
				 
					return true;
				}
			}
			logger.info("there is an item with this name.");
			return false;
			
		}
		
		public  void updateitem(String sn1,String category,String name1,String picture1,String description1) {
			
			Item obj18=new Item();
			obj18.sn=sn1;
			obj18.category=category;
			obj18.name=name1;
			obj18.picture=picture1;
			obj18.description=description1;
			for (int i=0 ;i <dbitem.size();i++)
			{
			if (dbitem.get(i).sn.equals(sn1))
				dbitem.set(i,obj18);
			}
			
		}
		public  void deleteitem(String id) {
			for (int i=0 ;i < dbitem.size();i++)
			{
				if(dbitem.isEmpty())break;
				else if (dbitem.get(i).sn.equals(id))
			{
					dbitem.remove(i);
				
			}
				
		}}
		
		public  void deleteuser(String id) {
			for (int i=0 ;i < dbuser.size();i++)
			{
				if(dbuser.isEmpty())break;
				else if (dbuser.get(i).id.equals(id))
			{
					dbuser.remove(i);
				
			}
				
		}}
		
		public  void deleteapartment(String id) {
			for (int i=0 ;i < dbapartment.size();i++)
			{
				if(dbapartment.isEmpty())break;
				else if (dbapartment.get(i).sn.equals(id))
			{
					dbapartment.remove(i);
				
			}
				
		}}

		public boolean encome() {
			float en=0;
			 int count=0;
			 float finalInc;
			 for(int i=0;i<dborder.size();i++) {
				 count+=dborder.get(i).count;
			 }
			 count*=3;
			for(int i=0;i<dbuser.size();i++) {
				en+=dbuser.get(i).point;
			}
			finalInc=en-count;
			logger.info("Final Income :");
			String j=finalInc+"";
			logger.info(j);
			logger.info("$");
			return true;
		}
		 
		
		public boolean showAllOrder() {
			for(int i=0;i<dborder.size();i++) {
		 
				logger.info("id= ");
				logger.info(dborder.get(i).idorder);
				logger.info(" | id user= ");
				logger.info(dborder.get(i).id);
				logger.info(" | type of order= ");
				logger.info(dborder.get(i).name);
				logger.info(" | discount= ");
				String a=""+dborder.get(i).discount;
				String b=""+dborder.get(i).price;
				String c=""+dborder.get(i).lateDate;
				String d=""+dborder.get(i).timeReceipt;		
				logger.info(a);
				logger.info(" | price= ");
				logger.info(b);
				logger.info(" | received date= ");
				logger.info(c);
				logger.info(" | days left= ");
				logger.info(d);
				logger.info(" | count= ");
				
				logger.info("\n");
			}
			return true;
		}
		
		public boolean showAllApartments() {
			for(int i=0;i<dbapartment.size();i++) {
		 
				logger.info("sn :");
				logger.info(dbapartment.get(i).sn);
				logger.info(" | location :");
				logger.info(dbapartment.get(i).location);
				logger.info(" | capacity : ");
				logger.info (dbapartment.get(i).capacity);
				logger.info(" | description : ");
				logger.info (dbapartment.get(i).description);
				logger.info(" | price : ");
				String b=""+dbapartment.get(i).price;
				logger.info(b);
			
				logger.info("\n");
			}
			return true;
		}
		
		
		public boolean dept() {
			for (int i=0;i<dborder.size();i++) {
				if(dborder.get(i).timeReceipt<=2&&!dborder.get(i).paid) {
					logger.info("The amount of dept owed by users: ");
					String hh=""+dborder.get(i).price;
					logger.info(hh);
					States.deptamount=dborder.get(i).price;
					
				}
			}
					return true;
				}

		public void makepaidtrue(String id) {
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(id)) {
					dborder.get(i).paid=true;
				}
			}
		}
		
		public String returnid2(String email,String pass) {
			for(int i=0;i<dbuser.size();i++) {
				
				if(dbuser.get(i).email.equals(email)&&dbuser.get(i).password.equals(pass)) {
					return dbuser.get(i).id;
				}
				
			}
			
			return null;
		}
	 
		public  boolean checkSN(String sn) {
			

			for (int i=0 ;i < dbitem.size();i++)
			{
				if (dbitem.get(i).sn.equals(sn))
				{
					return true;
				}
			
			}
			
			
			return false;
			}
	
}
