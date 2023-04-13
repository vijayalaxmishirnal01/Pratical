package Interface;

//Multiple Inheritance
 interface Vehicle{ //parent interface A
	void running();
}
interface Heavy_Vehicle{ //parent interface B
	void capacity();
}
class Car implements Vehicle,Heavy_Vehicle{
	void Speed() { //child class own method
		System.out.println("Car Speed is very high.");
	}

	@Override
	public void capacity() {
		// TODO Auto-generated method stub
		System.out.println("2nd parent interface method");
	}

	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("1st parent interface method");
	}
}
public class MultipleInterfaceEg{
	public static void main(String[] args) {
	Car c=new Car(); //object of child class car
	//child class method
	c.Speed(); 
	c.running();
	c.capacity();
	}
}