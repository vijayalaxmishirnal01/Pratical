package Inheritance;
//Multiple Inheritance
class A{
	void show() {
		System.out.println("Show the Multilevel Inheritance.");
		
	}
}
class B extends A{
	void run() {
		System.out.println("Running the Multilevel Inheritance.");
	}
}
public class c {
public static void main(String[] args) {
	B b=new B();
	b.show();
	b.run();
}
}
