package String;
//check equality by using comparision method ---1. equal() ,2. ===,3.campareTo
import java.util.Scanner;
public class StringEquality {
	public static void main(String[] args) {
		String str1,str2;
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Enter first String:"); //java
		str1 = ab.nextLine();
		
		System.out.println("Enter Second String:"); //Anudip
		str2 = ab.nextLine();
	//comparing two input string (java string campare)
		
	//if {str1.equals(str2)} // equals() - campare original content of string
		if(str1==str2) //== campare reference not value
				//if{str1.campareTo(str2)>0} //compare lexicographically
			System.out.println("Equal Stings");
		else
			System.out.println("Unequal Strings");
				
}
}
