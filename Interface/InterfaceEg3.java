package Interface;
//java 8 onwards,can have default and static method in an interface

interface Shapes{ //parent interface class
	void sides(); //Abstract method
	default void show() { //default method
		System.out.println("Default Method");
	}
	static int square(int a) { //static method
		return a*a;
	}
}
class Rectangle implements Shapes{ //child class

	@Override
	public void sides() {
		// TODO Auto-generated method stub
		System.out.println("Parent abstract method");
	}
}
public class InterfaceEg3 {
	public static void main(String[] args) {
		Shapes obj=new Rectangle();
		obj.show();//default method
		obj.sides();//abstract method
		System.out.println(Shapes.square(8));
}
}
