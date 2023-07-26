package jana;
/*
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;
*/
/*
@Builder
@Data
@AllArgsConstructor
@Accessors(chain =true)
*/
public class Item {
/*	@NonNull
	String name;
	String pic;
	Float price;
	PaymentType paymentType;
	String description;
	Float getTotal() {
		if(paymentType.equals(PaymentType.YEARLY))
		return price*12;
		return price;
	}
	*/
	
	  String sn;
		 String category;
		 String name;
		 String picture;
			 String description;
			 int  price;


		 static Database db=new Database();
}
