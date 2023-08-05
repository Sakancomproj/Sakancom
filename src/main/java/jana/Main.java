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
	System.out.print("*   press 1 if you want to modify your information in the Sakancom Application.               * \n");
	System.out.print("|   press 2 if you want to delete your account from the Sakancom Application.                 | \n");
	System.out.print("|   press 3 if you want to show all apartments in Sakancom Application.                       | \n");
	System.out.print("|   press 4 if you want to reserve an apartment in Sakancom Application.                      | \n");
	System.out.print("|   press 5 if you want to create new order.                                                  | \n");
	System.out.print("|   press 6 if you want to delete order.                                                      | \n");
	System.out.print("|   press 7 if you want to show specific order information.                                   | \n");
	System.out.print("|   press 8 if you want to get the bill.                                                      | \n");
	System.out.print("|   press 9 if you want to log out                                                           | \n");
	System.out.print("|   press 10 if you want to go to main page                                                   | \n");

	
}
static void menuadmin()
{
	
	System.out.print("|   press 1 if you want to create new item in the Sakancom Application.                       | \n");
	System.out.print("*   press 2 if you want to update your information about item in the Sakancom Application.    * \n");
	System.out.print("|   press 3 if you want to delete your item from the Sakancom Application.                    | \n");
	System.out.print("|   press 4 if you want to request the company's income.                                      | \n");
	System.out.print("|   press 5 if you want to show all orders in the company.                                    | \n");
	System.out.print("|   press 6 if you want to view unpaid orderes.                                               | \n");
	System.out.print("|   press 7 if you want to search for user.                                                   | \n");
	System.out.print("|   press 8 if you want to search for item.                                                   | \n");
	System.out.print("|   press 9 if you want to log out                                                            | \n");
	System.out.print("|   press 10 if you want to go to main page                                                   | \n");

}

static void menuowner()
{
	System.out.print("|   press 1 if you want to add an apartment.                                                      | \n");
	System.out.print("|   press 2 if you want to delete your apartment from the Sakancom Application.                   | \n");
	System.out.print("|   press 3 if you want to show all your apartments.                                              | \n");
	System.out.print("|   press 4 if you want to show all reserved apartments                                           | \n");
	System.out.print("|   press 5 if you want to log out                                                                | \n");
	System.out.print("|   press 6 if you want to go to main page                                                        | \n");
                                                      


	
}

static void choice()
{
	System.out.print("|   press 1 if you are user                                                                    | \n");
	System.out.print("*   press 2 if you are owner                                                                  * \n");
	System.out.print("|   press 3 if you are admin                                                                   | \n");
}


static void cas1()
{
	
int  adlogin =0;
	
	int adnum;
	
	
	Scanner s1=new Scanner(System.in);
	while(true) {
		
	
	
			System.out.print("\n Your email :");
	email=s1.next();
	
	System.out.print("\n Your Password :");
	password=s1.next();
	
	
	adlogin=	Admin.check(email,password);

	
	
	if (adlogin ==0)
		System.out.print("\n Your email or password is incorrect, please check it.. ");
  else 
  {
  	System.out.print("welcome..\n");
  
	
while(true) {

menuadmin();
adnum=s1.nextInt();




switch(adnum)
{


case 1:
{


System.out.print("please enter the information about your Item:\n");

System.out.print("Category: ");
category=s1.next();
System.out.print("name: ");
name=s1.next();
System.out.print("picture: ");
picture=s1.next();
System.out.print("description: ");
description=s1.next();


String spa="  ";
System.out.print("Item created successfully, if you want to check it enter 1  ");
if (s1.nextInt()==1)
{db.createitem( category, name, picture, description,10);
for (int i=0 ;i < db.dbitem.size();i++)
{
System.out.print(spa);
System.out.print(db.dbitem.get(i).sn);
	System.out.print(spa);
System.out.print(db.dbitem.get(i).name);
	System.out.print(spa);
System.out.print(db.dbitem.get(i).category);
	System.out.print(spa);
System.out.print(db.dbitem.get(i).description);
System.out.print(spa);
System.out.print(db.dbitem.get(i).picture);
System.out.print("\n");
}
}
break;
}



case 2:
{



System.out.print("please enter the  new information about your item\n");
System.out.print("SN of your item:\n");
sn=s1.next();
System.out.print("new Category:\\n");
category=s1.next();
System.out.print("new name:\n");
name=s1.next();
System.out.print("new picture:\n");
picture=s1.next();
System.out.print("new description:\n");
description=s1.next();

db.updateitem(sn, category, name, picture, description);
for (int i=0 ;i < db.dbitem.size();i++)
{

System.out.print(db.dbitem.get(i).sn);
System.out.print(db.dbitem.get(i).category);
System.out.print(db.dbitem.get(i).description);
	System.out.print(db.dbitem.get(i).name);
	System.out.print("\n");
	
}
break;

}

case 3:
{
System.out.print("please enter the SN of your item\n");
System.out.print("SN\n");
sn=s1.next();

db.deleteitem(sn);
for (int i=0 ;i <db.dbitem.size();i++)
{

	System.out.print(db.dbitem.get(i).sn);
	System.out.print(db.dbitem.get(i).category);
	System.out.print(db.dbitem.get(i).description);
	System.out.print(db.dbitem.get(i).name);
	System.out.print(db.dbitem.get(i).picture);
	System.out.print("\n");
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
System.out.print("enter the name of the user you want to search for:\n");

namuser=	s8.nextLine ();

db.searchuser(namuser);
break;

}
case 8:
{
Scanner s9=new Scanner(System.in);
String namPRO;

System.out.print("enter the name of the item you want to search for:\n");

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
System.out.print("the enter is wrong!");
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
			System.out.print("\n Exiting the program..");
		      return;
		}
		default : {
			System.out.print("the enter is wrong!.");
		}
			
				
		}
	}
}



static void account()
{
	System.out.print("|   press 1 if you have an account                                                            | \n");
	System.out.print("*   press 2 if you want to create account                                                       * \n");
	System.out.print("|   press 3 if you want to exite from app                                                     | \n");
	
}

static void account2()
{
	System.out.print("|   press 1 if you have an account                                                            | \n");
	System.out.print("|   press 2 if you want to exite from app                                                     | \n");
	
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
	
			
			System.out.print("\n Your email :");
	email=s.next();
	
	System.out.print("\n Your Password :");
	password=s.next();
	userlog=db.checkemail(email)&&db.checkpass(password);
	String iduser=db.returnid2(email,password);
	
	
	if (!userlog )
		System.out.print("\n Your email or password is incorrect, please check it..... ");
  else 
  {
  	System.out.print("welcome...\n");
  
 
  while(true) {
  	menuuser();
      num1=s.nextInt();	
  switch (num1)
  {
  
  
	case 1:
	{boolean existing=false;
	System.out.print(" \n enter your id:");
	
	id1=scan.nextLine();
	
	
	existing=db.checkifexist(id1);
	if(!existing) {
		
		
		
		System.out.print(" enter your new information: \n");
		System.out.print(" enter new name: ");	
  	name1=scan.nextLine();
  	  scan.nextLine();
  	  System.out.print(" enter new address: ");
  	address1=scan.nextLine();		
  	System.out.print(" enter new phone: ");	
  	phone1=scan.nextLine();
  	System.out.print(" enter new email: ");	
      email=scan.nextLine();	
      System.out.print("  enter new password:");	
  	password=scan.nextLine();
  	fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
		if(!fill) {
			System.out.print("All fields are required! Please re_enter your information ");
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
		System.out.print("please enter your ID :\n");
		System.out.print("ID\n");
		iduser=scan.next();
		 if(logout)System.out.print("Your account has been cancelled");
		
		db.deleteuser(iduser);
		for (int i=0 ;i <db.dbuser.size();i++)
		{

			System.out.print(db.dbuser.get(i).id);
			System.out.print(db.dbuser.get(i).phone);
			System.out.print(db.dbuser.get(i).email);
			System.out.print(db.dbuser.get(i).name);
			System.out.print(db.dbuser.get(i).password);
			System.out.print(db.dbuser.get(i).address);
			System.out.print("\n");
		
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
		System.out.print(" enter your information about Reservation:");
		String sas1=" enter SN :";
		System.out.print(sas1);
		sn=scan.next();
        
        System.out.print("sn :");
		System.out.print("2");
		System.out.print(" | location :");
		System.out.print("Beitwazan");
		System.out.print(" | capacity : ");
		System.out.print ("Two");
		System.out.print(" | description : ");
		System.out.print ("two beds,bathroom and kitchen");
		System.out.print(" | price : ");
		System.out.print("200");
	
		System.out.print("\n");
        System.out.print(" Do You wanna Reserve this apartment?: "); 
        sn=scan.nextLine();
		System.out.print(" This apartment has been reserved successfully!");

        break;
	}
	case 5:
	{
		System.out.print(" enter your information about order:");
		String sas1=" enter your id of order:";
		System.out.print(sas1);
	       	
      idorder=scan.nextLine();
        scan.nextLine();
      
        System.out.print(" enter your type: "); 
  		 type=scan.nextLine();
  		 System.out.print(" enter your count: ");
  		 count=scan.nextInt();
  		 
  		 db.createNewOrder(idorder, iduser, count, type);
  		 System.out.print(" your order is created  ");
  		 
  		 for(int i=0;i<db.dborder.size();i++) {
  			 if ( db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(idorder))
  				{
				 System.out.print("id= ");
  				
			 System.out.print(db.dborder.get(i).idorder);
			 System.out.print(" , id user= ");
			 System.out.print(db.dborder.get(i).id);
			 System.out.print(" , type of order= ");
			 System.out.print(db.dborder.get(i).name);
			 System.out.print(" , discount= "); 
			 String s0 ="" +db.dborder.get(i).discount;
			 System.out.print(s0); 
			 System.out.print(" , price= ");
			 String h0=""+db.dborder.get(i).price;
			 System.out.print(h0);
			 System.out.print(" , received date= "); 
			 String p0=""+db.dborder.get(i).lateDate;
			 System.out.print(p0);
			 System.out.print(" , days left= ");
			 String f0=""+db.dborder.get(i).timeReceipt;
			 System.out.print(f0);
			 String r0=db.dborder.get(i).count+"";
			 System.out.print(" , count= ");
			 System.out.print(r0);
				 }
		 
		 }
  		 
		
		break;
		
	}
	
	
	case 6:
		
	{
		Scanner san=new Scanner(System.in);
		
		System.out.print(" enter your id of order :");
		idorder=san.nextLine();
       
		
		db.cancleorder(iduser,idorder);
		
		
		break;
		
		
	}
	
	case 7:
	{
		Scanner sca = new Scanner(System.in);

		System.out.print(" enter your id of order. : ");
		
		idorder=sca.nextLine();
       
		db.infoorder(iduser,idorder );
		
		break;
	}
  
	
	
	case 8:
	{String nuser="";
	String addres="";
	 String hgf=" enter your id order:";
		boolean  com;
		System.out.print(hgf);
		idorder=scan.nextLine();
        scan.nextLine();

		com=db.iscomplete(iduser, idorder);
		
		if (!com)
		{
			System.out.print("The order is'n completed ,I can'n to view the invoce");	
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
		System.out.print("wait for the bill to be ready...... ");	
		JOptionPane.showMessageDialog(null,"The user name: "+ nuser+"\nThe user address: "+addres +"\n The id user:"
		        +o.id+"\n The id order:"+o.idorder+"\n The type "
		        +o.name+"\n The price: "+o.price+
		         "\n The price after discount: "+o.discount+"\n The count :"
				+o.count+" \n delvery= 15 "+"\n The total price"+o.totalprice1,"Bill",JOptionPane.INFORMATION_MESSAGE);
		
		}
		break;
	}
	case 9:
	{
		
		break ;
	}
	case 10:
	{
		break;
	}
	
	default :
		System.out.print("The enter is wrong!");
	
  }
  
 
  
  }
  }
	
	break;
	
		}
		
	break;
	}
	
	case 2: 
	{
		
		System.out.print(" enter your id:");
	       	
      	id1=scan.nextLine();
        scan.nextLine();
        System.out.print("enter your name: ");
      	name1=scan.nextLine();
      	System.out.print(" enter your address: "); 
  		 address1=scan.nextLine();
  		 System.out.print(" enter your phone: ");
  		 phone1=scan.nextLine();
  		 System.out.print(" enter your email: ");
  		 email=scan.nextLine();
  		 System.out.print(" enter your password:");
  		 password=scan.nextLine();
  		
  	

	
  		 fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
	if(!fill) {
		System.out.print("All fields are required! Please re_enter your information ");
		menuuser(); continue;
	} 
	exist=db.checkifexist(id1);
	if(!exist) {
		System.out.print("You already have an account.Please re_enter your information 1010 ");
		menuuser();continue;
	}
	
	 
	info=db.checkinfoTrue(1,id1,phone1,email,password);	
	
	if(!info) {
		menuuser();		continue;
	}
	
	 db.creatNewUser( id1, phone1, name1, email,  address1,  password);
	 System.out.print("An account has been created successfully ");
	 
	 for (int i=0 ;i <db.dbuser.size();i++)
	{
		
		 System.out.print(db.dbuser.get(i).name);
		 System.out.print("\n");
	}
		
		break;
	}
	
	case 3:
		{
			
			System.out.print("\n Exiting the program...");
			      return;
			  
		}
	
	default :
		System.out.print("your entery is wrong!");
	
	
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
			System.out.print("\n Exiting the program..");
		      return;
		}
		
		default : {
			System.out.print("the enter is wrong!.");
		}
			
				
		}
	}
	  
}

static void ca1() {
	
int owlogin = 0;
	
	int ownum;
	Scanner s7=new Scanner(System.in);
	while(true) {
		
	
			System.out.print("\n Your Email :");
	email=s7.next();
	
	System.out.print("\n Your Password :");
	password=s7.next();
	
	
	owlogin=Owner.checkifexi8(email,password);

	
	
	if (owlogin ==0)
		System.out.print("\n Your email or password is incorrect, please check it.. ");
  else 
  {
  	System.out.print("welcome..\n");
  
	
while(true) {

menuowner();
ownum=s7.nextInt();




switch(ownum)
{


case 1:
{


System.out.print("please enter the information about your appartment:\n");

System.out.print("Location: ");
location=s7.next();
System.out.print("capacity: ");
capacity=s7.next();
System.out.print("picture: ");
pic=s7.next();
System.out.print("description: ");
descrip=s7.next();


String sma="  ";
System.out.print("appartment created successfully, if you want to check it enter 1  ");
if (s7.nextInt()==1)
{db.createapartment(location,capacity, pic, descrip,10);
for (int i=0 ;i < db.dbapartment.size();i++)
{
System.out.print(sma);
System.out.print(db.dbapartment.get(i).sn);
	System.out.print(sma);
System.out.print(db.dbapartment.get(i).capacity);
	System.out.print(sma);
System.out.print(db.dbapartment.get(i).location);
	System.out.print(sma);
System.out.print(db.dbapartment.get(i).description);
	System.out.print(sma);
System.out.print(db.dbapartment.get(i).picture);
	System.out.print("\n");
}
}
break;
}

case 2:
{
System.out.print("please enter the SN of your apartment\n");
System.out.print("SN\n");
sn=s7.next();

db.deleteapartment(sn);
for (int i=0 ;i <db.dbapartment.size();i++)
{

	System.out.print(db.dbapartment.get(i).sn);
	System.out.print(db.dbapartment.get(i).location);
	System.out.print(db.dbapartment.get(i).description);
	System.out.print(db.dbapartment.get(i).capacity);
	System.out.print(db.dbapartment.get(i).picture);
	System.out.print("\n");
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
	System.out.print("sn :");
	System.out.print("2");
	System.out.print(" | location :");
	System.out.print("Beitwazan");
	System.out.print(" | capacity : ");
	System.out.print ("Two");
	System.out.print(" | description : ");
	System.out.print ("two beds,bathroom and kitchen");
	System.out.print(" | price : ");
	System.out.print("200");

	System.out.print("\n");
	
	System.out.print("This apartment has been reserved by ahmad Successfully");

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
System.out.print("the enter is wrong!");
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
		System.out.print("the number of enter is wrong!");
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
