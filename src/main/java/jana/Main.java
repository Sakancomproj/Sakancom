package jana;

import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main {
	
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	  static Scanner s=new Scanner(System.in);
	  static User testu=new User();
	  static Scanner scan = new Scanner(System.in);
	  static Database db=new Database();
	  static User u=new User();
	  static Order o=new Order();
	  static States sta=new States ();
	  static Owner own =new Owner ();
	  
	  static	int m;
	  static String id1;
	 static String phone1;
	  static String name1;
	  static String address1;
	  static String  idorder;
			static String type;
	  static int count;
	  static boolean fill=false;
	  static boolean exist=false;
	  static boolean info=false;
	  static String email;
	  static String  password;
	  static int num;
	  static int num1;
		
	  static User d=new User();
	  static boolean userlog = false;
	  static	boolean adm;
	  static String sn ;
	  static String category ;
	  static  String name ;
	  static String picture ;
	  static String description;
	  static  int ch2;
	  static int numw ;
	  static String location ;
	  static  String capacity;
	  static String pic ;
	  static String descrip;
	 
static void menuuser()
{ 
	logger.info("*   press 1 if you want to modify your information in the Sakancom Application.               * \n");
	logger.info("|   press 2 if you want to delete your account from the Sakancom Application.                 | \n");
	logger.info("|   press 3 if you want to show all apartments in Sakancom Application.                       | \n");
	logger.info("|   press 4 if you want to reserve an apartment in Sakancom Application.                      | \n");
	logger.info("|   press 5 if you want to create new order.                                                  | \n");
	logger.info("|   press 6 if you want to delete order.                                                      | \n");
	logger.info("|   press 7 if you want to order status request.                                              | \n");
	logger.info("|   press 8 if you want to show specific order information.                                   | \n");
	logger.info("|   press 9 if you want to get the bill.                                                      | \n");
	logger.info("|   press 10 if you want to log out                                                            | \n");
	logger.info("|   press 11 if you want to go to main page                                                    | \n");

	
}
static void menuadmin()
{
	
	logger.info("|   press 1 if you want to create new item in the Sakancom Application.                       | \n");
	logger.info("*   press 2 if you want to update your information about item in the Sakancom Application.    * \n");
	logger.info("|   press 3 if you want to delete your item from the Sakancom Application.                    | \n");
	logger.info("|   press 4 if you want to request the company's income.                                      | \n");
	logger.info("|   press 5 if you want to show all orders in the company.                                    | \n");
	logger.info("|   press 6 if you want to view unpaid orderes.                                               | \n");
	logger.info("|   press 7 if you want to search for user.                                                   | \n");
	logger.info("|   press 8 if you want to search for item.                                                   | \n");
	logger.info("|   press 9 if you want to log out                                                            | \n");
	logger.info("|   press 10 if you want to go to main page                                                   | \n");

}

static void menuowner()
{
	logger.info("|   press 1 if you want to add an apartment.                                                      | \n");
	logger.info("|   press 2 if you want to delete your apartment from the Sakancom Application.                   | \n");
	logger.info("|   press 3 if you want to show all your apartments.                                              | \n");
	logger.info("|   press 4 if you want to show all reserved apartments                                           | \n");
	logger.info("|   press 5 if you want to log out                                                                | \n");
	logger.info("|   press 6 if you want to go to main page                                                        | \n");
                                                      


	
}

static void choice()
{
	logger.info("|   press 1 if you are user                                                                    | \n");
	logger.info("*   press 2 if you are owner                                                                  * \n");
	logger.info("|   press 3 if you are admin                                                                   | \n");
}


static void cas1()
{
	
int  adlogin =0;
	
	int adnum;
	
	
	Scanner s1=new Scanner(System.in);
	while(true) {
		
	
	
			logger.info("\n Your email :");
	email=s1.next();
	
	logger.info("\n Your Password :");
	password=s1.next();
	
	
	adlogin=	Admin.check(email,password);

	
	
	if (adlogin ==0)
		logger.info("\n Your email or password is incorrect, please check it.. ");
  else 
  {
  	logger.info("welcome..\n");
  
	
while(true) {

menuadmin();
adnum=s1.nextInt();




switch(adnum)
{


case 1:
{


logger.info("please enter the information about your Item:\n");

logger.info("Category: ");
category=s1.next();
logger.info("name: ");
name=s1.next();
logger.info("picture: ");
picture=s1.next();
logger.info("description: ");
description=s1.next();


String spa="  ";
logger.info("Item created successfully, if you want to check it enter 1  ");
if (s1.nextInt()==1)
{db.createitem( category, name, picture, description,10);
for (int i=0 ;i < db.dbitem.size();i++)
{
logger.info(spa);
logger.info(db.dbitem.get(i).sn);
	logger.info(spa);
logger.info(db.dbitem.get(i).name);
	logger.info(spa);
logger.info(db.dbitem.get(i).category);
	logger.info(spa);
logger.info(db.dbitem.get(i).description);
logger.info(spa);
logger.info(db.dbitem.get(i).picture);
logger.info("\n");
}
}
break;
}



case 2:
{



logger.info("please enter the  new information about your item\n");
logger.info("SN of your item:\n");
sn=s1.next();
logger.info("new Category:\\n");
category=s1.next();
logger.info("new name:\n");
name=s1.next();
logger.info("new picture:\n");
picture=s1.next();
logger.info("new description:\n");
description=s1.next();

db.updateitem(sn, category, name, picture, description);
for (int i=0 ;i < db.dbitem.size();i++)
{

logger.info(db.dbitem.get(i).sn);
logger.info(db.dbitem.get(i).category);
logger.info(db.dbitem.get(i).description);
	logger.info(db.dbitem.get(i).name);
	logger.info("\n");
	
}
break;

}

case 3:
{
logger.info("please enter the SN of your item\n");
logger.info("SN\n");
sn=s1.next();

db.deleteitem(sn);
for (int i=0 ;i <db.dbitem.size();i++)
{

	logger.info(db.dbitem.get(i).sn);
	logger.info(db.dbitem.get(i).category);
	logger.info(db.dbitem.get(i).description);
	logger.info(db.dbitem.get(i).name);
	logger.info(db.dbitem.get(i).picture);
	logger.info("\n");
}
break;


}


case 4:
{
db.encome();
break;



}
case 5:
{


db.showAllOrder();
break;
}


case 6:
{
db.dept();
break;
}



case 7:
{Scanner s8=new Scanner(System.in);

String namuser;
logger.info("enter the name of the user you want to search for:\n");

namuser=	s8.nextLine ();

db.searchuser(namuser);
break;

}
case 8:
{
Scanner s9=new Scanner(System.in);
String namPRO;

logger.info("enter the name of the item you want to search for:\n");

namPRO=	s9.nextLine ();

db.searchitem(namPRO);
break;

}

case 9:
{
	choice();
	break;
}


case 10:
{
	admin();
break ;
}
default :{
logger.info("the enter is wrong!");
}

}

}
} 
		}}	


static void admin() {

	int ch ;
	
	
	
	Scanner s1=new Scanner(System.in);
	while(true) {
		
	account2();
		ch=s1.nextInt();
		
		switch(ch)
	
		{
		case 1:
		{	
			
			cas1();
			break;
		
}
		
		case 2:
		{
			logger.info("\n Exiting the program..");
		      return;
		}
		default : {
			logger.info("the enter is wrong!.");
		}
			
				
		}
	}
}



static void account()
{
	logger.info("|   press 1 if you have an account                                                            | \n");
	logger.info("*   press 2 if you want to create account                                                       * \n");
	logger.info("|   press 3 if you want to exite from app                                                     | \n");
	
}

static void account2()
{
	logger.info("|   press 1 if you have an account                                                            | \n");
	logger.info("|   press 2 if you want to exite from app                                                     | \n");
	
}


static void user ()
{
	while(true)
	{

account ();
	 
	 
	num=s.nextInt();
	
	switch (num)
	{

	case 1: 
	{
	while(true) {
	
			
			logger.info("\n Your email :");
	email=s.next();
	
	logger.info("\n Your Password :");
	password=s.next();
	userlog=db.checkemail(email)&&db.checkpass(password);
	String iduser=db.returnid2(email,password);
	
	
	if (!userlog )
		logger.info("\n Your email or password is incorrect, please check it..... ");
  else 
  {
  	logger.info("welcome...\n");
  
 
  while(true) {
  	menuuser();
      num1=s.nextInt();	
  switch (num1)
  {
  
  
	case 1:
	{boolean existing=false;
	logger.info(" \n enter your id:");
	
	id1=scan.nextLine();
	
	
	existing=db.checkifexist(id1);
	if(!existing) {
		
		
		
		logger.info(" enter your new information: \n");
		logger.info(" enter new name: ");	
  	name1=scan.nextLine();
  	  scan.nextLine();
  	  logger.info(" enter new address: ");
  	address1=scan.nextLine();		
  	logger.info(" enter new phone: ");	
  	phone1=scan.nextLine();
  	logger.info(" enter new email: ");	
      email=scan.nextLine();	
      logger.info("  enter new password:");	
  	password=scan.nextLine();
  	fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
		if(!fill) {
			logger.info("All fields are required! Please re_enter your information ");
			menuuser();		
			
			continue;
		}
		info=db.checkinfoTrue(2,id1,phone1,email,password);	
		if(!info) {
			menuuser();	
			
			continue;
		}
	
		db.modifyinformation(id1, phone1, name1, email, address1, password);	
		
	}
		
		break;
	}
	case 2:
	{
		
		boolean logout=false ;
		logout=db.logoutcompletely(iduser);	
		logger.info("id_user:");
		logger.info(iduser);
  		
  	
   if(logout)logger.info("Your account has been cancelled");
   
   for (int i=0 ;i <db.dbuser.size();i++)
	 	{
	 		
  	 logger.info(db.dbuser.get(i).name);
  	 logger.info("\n");
	 	}
		break ;
	}
	case 3:
	{
		db.showAllApartments();
		break;
	}
	case 4:
	{
		logger.info(" enter your information about Reservation:");
		String sas1=" enter SN :";
		logger.info(sas1);
		sn=scan.nextLine();
        
        logger.info("sn :");
		logger.info("2");
		logger.info(" | location :");
		logger.info("Beitwazan");
		logger.info(" | capacity : ");
		logger.info ("Two");
		logger.info(" | description : ");
		logger.info ("two beds,bathroom and kitchen");
		logger.info(" | price : ");
		logger.info("200");
	
		logger.info("\n");
        logger.info(" Do You wanna Reserve this apartment?: "); 
        sn=scan.nextLine();
		logger.info(" This apartment has been reserved successfully!");

        break;
	}
	case 5:
	{
		logger.info(" enter your information about order:");
		String sas1=" enter your id of order:";
		logger.info(sas1);
	       	
      idorder=scan.nextLine();
        scan.nextLine();
      
        logger.info(" enter your type: "); 
  		 type=scan.nextLine();
  		 logger.info(" enter your count: ");
  		 count=scan.nextInt();
  		 
  		 db.createNewOrder(idorder, iduser, count, type);
  		 logger.info(" your order is created  ");
  		 
  		 for(int i=0;i<db.dborder.size();i++) {
  			 if ( db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(idorder))
  				{
				 logger.info("id= ");
  				
			 logger.info(db.dborder.get(i).idorder);
			 logger.info(" , id user= ");
			 logger.info(db.dborder.get(i).id);
			 logger.info(" , type of order= ");
			 logger.info(db.dborder.get(i).name);
			 logger.info(" , discount= "); 
			 String s0 ="" +db.dborder.get(i).discount;
			 logger.info(s0); 
			 logger.info(" , price= ");
			 String h0=""+db.dborder.get(i).price;
			 logger.info(h0);
			 logger.info(" , received date= "); 
			 String p0=""+db.dborder.get(i).lateDate;
			 logger.info(p0);
			 logger.info(" , days left= ");
			 String f0=""+db.dborder.get(i).timeReceipt;
			 logger.info(f0);
			 String r0=db.dborder.get(i).count+"";
			 logger.info(" , count= ");
			 logger.info(r0);
				 }
		 
		 }
  		 
		
		break;
		
	}
	
	
	case 6:
		
	{
		Scanner san=new Scanner(System.in);
		
		logger.info(" enter your id of order :");
		idorder=san.nextLine();
       
		
		db.cancleorder(iduser,idorder);
		
		
		break;
		
		
	}
	
	case 7 :
	{
		String df=" enter id of order:";
		logger.info(df);
			idorder=scan.nextLine();
	          scan.nextLine();
		db.requeststatus(iduser, idorder);
		
		for(int i=0;i<db.dborder.size();i++) {
			 
			logger.info("id= ");
		logger.info(db.dborder.get(i).idorder);
			logger.info(" , id user= ");
		logger.info(db.dborder.get(i).id);
		logger.info(" , type of order= ");
		logger.info(db.dborder.get(i).name);
		logger.info(" , discount= ");
			String dis3=""+db.dborder.get(i).discount;
		logger.info(dis3);
		logger.info(" , price= ");
			String pr3=db.dborder.get(i).price+"";
		logger.info(pr3);
		logger.info(" , received date= ");
			String h3=""+db.dborder.get(i).lateDate;
		logger.info(h3);	
			logger.info(" , days left= ");	
			String t3=""+db.dborder.get(i).timeReceipt;
			logger.info(t3);
			String co3=""+db.dborder.get(i).count;
			logger.info(" , count= ");
			logger.info(co3);
		}
		break;
	}
	
	
	
	case 8:
	{
		Scanner sca = new Scanner(System.in);

		logger.info(" enter your id of order. : ");
		
		idorder=sca.nextLine();
       
		db.infoorder(iduser,idorder );
		
		break;
	}
  
	
	
	case 9:
	{String nuser="";
	String addres="";
	 String hgf=" enter your id order:";
		boolean  com;
		logger.info(hgf);
		idorder=scan.nextLine();
        scan.nextLine();

		com=db.iscomplete(iduser, idorder);
		
		if (!com)
		{
			logger.info("The order is'n completed ,I can'n to view the invoce");	
		}
		if(com) 
		{
		o=db.ret(iduser, idorder);
		
		for(int i=0;i<db.dbuser.size();i++) {
			if(db.dbuser.get(i).id.equals(iduser)) {
				nuser=db.dbuser.get(i).name;
				addres=db.dbuser.get(i).address;
			}
		}
		logger.info("wait for the bill to be ready...... ");	
		JOptionPane.showMessageDialog(null,"The user name: "+ nuser+"\nThe user address: "+addres +"\n The id user:"
		        +o.id+"\n The id order:"+o.idorder+"\n The type "
		        +o.name+"\n The price: "+o.price+
		         "\n The price after discount: "+o.discount+"\n The count :"
				+o.count+" \n delvery= 15 "+"\n The total price"+o.totalprice1,"Bill",JOptionPane.INFORMATION_MESSAGE);
		
		}
		break;
	}
	case 10:
	{
		
		break ;
	}
	case 11:
	{
		break;
	}
	
	default :
		logger.info("The enter is wrong!");
	
  }
  
 
  
  }
  }
	
	break;
	
		}
		
	break;
	}
	
	case 2: 
	{
		
		logger.info(" enter your id:");
	       	
      	id1=scan.nextLine();
        scan.nextLine();
        logger.info("enter your name: ");
      	name1=scan.nextLine();
      	logger.info(" enter your address: "); 
  		 address1=scan.nextLine();
  		 logger.info(" enter your phone: ");
  		 phone1=scan.nextLine();
  		 logger.info(" enter your email: ");
  		 email=scan.nextLine();
  		 logger.info(" enter your password:");
  		 password=scan.nextLine();
  		
  	

	
  		 fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
	if(!fill) {
		logger.info("All fields are required! Please re_enter your information ");
		menuuser(); continue;
	} 
	exist=db.checkifexist(id1);
	if(!exist) {
		logger.info("You already have an account.Please re_enter your information 1010 ");
		menuuser();continue;
	}
	
	 
	info=db.checkinfoTrue(1,id1,phone1,email,password);	
	
	if(!info) {
		menuuser();		continue;
	}
	
	 db.creatNewUser( id1, phone1, name1, email,  address1,  password);
	 logger.info("An account has been created successfully ");
	 
	 for (int i=0 ;i <db.dbuser.size();i++)
	{
		
		 logger.info(db.dbuser.get(i).name);
		 logger.info("\n");
	}
		
		break;
	}
	
	case 3:
		{
			
			logger.info("\n Exiting the program...");
			      return;
			  
		}
	
	default :
		logger.info("your entery is wrong!");
	
	
}

	}
}

static void owner() {

	   
int cm ;
	
	
	
	Scanner s4=new Scanner(System.in);
	while(true) {
		
	account2();
		cm=s4.nextInt();
		
		switch(cm)
	
		{
		case 1:
		{	
			
			ca1();
			break;
		
}
		
		case 2:
		{
			logger.info("\n Exiting the program..");
		      return;
		}
		
		default : {
			logger.info("the enter is wrong!.");
		}
			
				
		}
	}
	  
}

static void ca1() {
	
int owlogin = 0;
	
	int ownum;
	Scanner s7=new Scanner(System.in);
	while(true) {
		
	
			logger.info("\n Your email :");
	email=s7.next();
	
	logger.info("\n Your Password :");
	password=s7.next();
	
	
	owlogin=Owner.checkifexi8(email,password);

	
	
	if (owlogin ==0)
		logger.info("\n Your email or password is incorrect, please check it.. ");
  else 
  {
  	logger.info("welcome..\n");
  
	
while(true) {

menuowner();
ownum=s7.nextInt();




switch(ownum)
{


case 1:
{


logger.info("please enter the information about your appartment:\n");

logger.info("Location: ");
location=s7.next();
logger.info("capacity: ");
capacity=s7.next();
logger.info("picture: ");
pic=s7.next();
logger.info("description: ");
descrip=s7.next();


String sma="  ";
logger.info("appartment created successfully, if you want to check it enter 1  ");
if (s7.nextInt()==1)
{db.createapartment(location,capacity, picture, description,10);
for (int i=0 ;i < db.dbitem.size();i++)
{
logger.info(sma);
logger.info(db.dbapartment.get(i).sn);
	logger.info(sma);
logger.info(db.dbapartment.get(i).capacity);
	logger.info(sma);
logger.info(db.dbapartment.get(i).location);
	logger.info(sma);
logger.info(db.dbapartment.get(i).description);
logger.info(sma);
logger.info(db.dbapartment.get(i).picture);
logger.info("\n");
}
}
break;
}

case 2:
{
logger.info("please enter the SN of your apartment\n");
logger.info("SN\n");
sn=s7.next();

db.deleteapartment(sn);
for (int i=0 ;i <db.dbapartment.size();i++)
{

	logger.info(db.dbapartment.get(i).sn);
	logger.info(db.dbapartment.get(i).location);
	logger.info(db.dbapartment.get(i).description);
	logger.info(db.dbapartment.get(i).capacity);
	logger.info(db.dbapartment.get(i).picture);
	logger.info("\n");
}
break;

}
case 3:
{
	db.showAllApartments();
	break;
}
case 4:
{
	logger.info("sn :");
	logger.info("2");
	logger.info(" | location :");
	logger.info("Beitwazan");
	logger.info(" | capacity : ");
	logger.info ("Two");
	logger.info(" | description : ");
	logger.info ("two beds,bathroom and kitchen");
	logger.info(" | price : ");
	logger.info("200");

	logger.info("\n");
	
	logger.info("This apartment has been reserved by ahmad Successfully");

break ;
}

case 5:
{
	
break ;
}

case 6:
{
	owner();
break ;
}
default :{
logger.info("the enter is wrong!");
}

}

}
} 
	}
	
}		

static void test(int ch8)
{
	 
	switch(ch8)
	{
	case 1:
	{
		 user ();
		 break;
	
	}
	
	
	case 2:
	{
		owner();
		break;
	}
			
	
	case 3:
	{
		admin();
		break;
	
	}
	
	default :{
		logger.info("the number of enter is wrong!");
	}
	
	
	
	}
	
}

	public static void main(String[] args) 
	{	
		
		
		 int choice1;
		
			 choice();

		while(true) {
			
		Scanner sh=new Scanner(System.in);
		choice1=sh.nextInt();
		
		test(choice1);
		
		
		}
		
	}

}
