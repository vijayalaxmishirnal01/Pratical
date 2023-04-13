package Interface;

//Multiple Inheritance
 interface Vehicle1{ //parent interface A
	void running();
}
interface Heavy_Vehicle1{ //parent interface B
	void running();
}
class Car1 implements Vehicle1,Heavy_Vehicle1{ //child class c
	void Speed() { //child class own method
		System.out.println("Car Speed is very high.");
	}
	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("Parent interface method");
	}
}
public class MultipleInterfaceEg1{
	public static void main(String[] args) {
	Car1 c=new Car1(); //object of child class car
	//child class method
	c.Speed(); 
	c.running();
	}
}