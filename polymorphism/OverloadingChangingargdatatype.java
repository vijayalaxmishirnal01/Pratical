package polymorphism;

/*Method Overloading -same name method
 * two way we can overload the methods
 * 1.changing no. of arguments
 * 2.changing data type of arguments
 */
public class  OverloadingChangingargdatatype {
	//integer type arguments
static int sum(int a,int b) { //two parameters/arguments
	return a+b;
}
	//double type arguments
static double sum(int a,double b) { //two parameters/arguments
	return a+b;
}
public static void main(String[] args) {
	System.out.println( OverloadingChangingargdatatype.sum(2,3));
	System.out.println( OverloadingChangingargdatatype.sum(2,3));
}
}
