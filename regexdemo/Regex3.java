package regexdemo;
import java.util.regex.Pattern;

//Quantifiers
//X{n} - x occurs n time X[6] only 6 characters
//X{n,} - x occurs n times or more X[6] only 6 characters or more

public class Regex3 {
	
	public static void main(String[] args) {
		boolean p1 = Pattern.matches("[a-z]{6}", "Vijaya");
		boolean p2 = Pattern.matches("[a-zA-Z0-9-+@$]{8,}", "Anudip@123");
		
		//for phone number
		boolean p3 =Pattern.matches("[6789][0-9]{9}", "9156546714");
		
		System.out.println(p1+" "+p2+" "+p3);
		
		//meta characters \d - [0-9], \s - any white space char , \w- [a-zA-Z_0-9]
		boolean b1 =Pattern.matches("[\\w]{8,}", "Anudip123");
		
		boolean phone = Pattern.matches("[6789][\\d]{9}", "6865798451");
		
		System.out.println(b1+" "+phone);
		
		//for email
		
		boolean email = Pattern.matches("[a-z0-9]+@gmail.com", "anudip89@gmail.com");
		
		System.out.println(" "+email);
	}
}