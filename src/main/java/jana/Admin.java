package jana;

public class Admin {

	 String address;
	 String email;
	 String name;
	 String id;
	 String password;
	 String phone;

	public static int check(String string1, String string2) {
		
		if((string1.equals("jana@gmail.com") && string2.equals("jana123")) ||
				(string1.equals("raya@gmail.com") && string2.equals("raya123")) )
				{
			
			return 1;
				
				}
		
		return 0;
		
		
	}
	
}
