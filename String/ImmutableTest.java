package String;

public class ImmutableTest {
	public static void main(String[] args) {
	String str ="Abhinadhan";
	str.concat("Talwar");//insert the string at the end
	str=str.concat("Talwar");//it will print Abhinadhan Talwar
	//it will print Abhinadhan only because String is immutable
	System.out.println(str);
	
}
}