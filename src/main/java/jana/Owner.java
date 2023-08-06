package jana;

public class Owner {
	String address;
	 String name;
	 String id;
	 String email;
boolean available=true;
String idorder;
	 String password;
	 String phone;
	 String balance ;
static boolean logowner=true;

public static int checkifexi8(String string1, String string2) {
	
	 if((string1.equals("hala@gmail.com") && string2.equals("hala123")) ||
				(string1.equals("deema@gmail.com") && string2.equals("deema123")) )
				{
	
			
			return 1;
				
				}
		
		return 0;
		
	}
}
