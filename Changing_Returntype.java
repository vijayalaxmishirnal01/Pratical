package polymorphism;
//changing return type is not possible in case of method overloading
public class Changing_Returntype {
	static int sum(int a,int b) { //two parameters/arguments
		return a+b;
	}
		//double type arguments
	static double sum(int a,int b) { //two parameters/arguments
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println( OverloadingChangingargdatatype.sum(2,3));//ambiguity
}
}