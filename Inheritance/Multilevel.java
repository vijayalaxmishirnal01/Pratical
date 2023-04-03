package Inheritance;
//Multilevel Inheritance
class Vehicle{ //parent class A
	void running() {
		System.out.println("Running mode on");
	}
}
class Car extends Vehicle{
	void run() {
		System.out.println("Car run mode on");
	}
}
class I10 extends Car{
	void Speed() {
		System.out.println("Speed is very high.");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		I10 d=new I10();
		d.running();
		d.run();
		d.Speed();
	}

}
