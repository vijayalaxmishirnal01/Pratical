package regexdemo;

import java.util.regex.Pattern;

//Character class 
//1) [abc]-a,b, or c only there char (Single)
//2) [^abc] - any other char except a,b or c
//3) [a-ZA-Z] - either lower/upper case and both (Single)
	
public class Regex1 {
	
	public static void main(String[] args) {
		boolean b1 = Pattern.matches("[abc]", "a"); //true
		boolean b2 = Pattern.matches("[^abc]", "x"); //true
		boolean b3 = Pattern.matches("[a-zA-Z]", "#"); //false
		
		System.out.println(b1+" "+b2+" "+b3);
	}
}
