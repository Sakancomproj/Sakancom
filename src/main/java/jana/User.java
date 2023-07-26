package jana;

import java.util.ArrayList;
import java.util.List;

public class User {

	 String address;
	 String email;
     String name;
	 String id;
     String password;
	 String phone;
	 float point=0;
	
	User u1;
	  static List <User> userarray=new  ArrayList <User> ();
	 boolean log=false;
		 static Database db=new Database();
		
	 
	 public User()
	 {
		 this.initialuser();
	 }
	
	//check thisssssss
	 
	public void initialuser() {
		this.address="Nablus";
		this.email="tala@gmail.com";
		this.id ="1";
		this.password="1";
		this.phone="0592825419";
		this.name="Tala masri";
	
		userarray.add(this);
			}
	

	
	public static int checkuser(String string1, String string2) {
		if((string1.equals("tala@gmail.com") && string2.equals("tala123")) )
				{
					return 1;
				}
		return 0;
	}
}
