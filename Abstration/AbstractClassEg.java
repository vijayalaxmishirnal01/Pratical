package Abstration;

abstract class Parentabs{
	public Parentabs() { //cons
		System.out.println("No-args Cons");
	}
	abstract void show(); //abstract method
	void run() { // non abstract
		System.out.println("Non abstacr method");
	}
}
class Childabs extends Parentabs{
	
	@Override
	void show() {
		System.out.println("Parent class abstacrt method");
	}
}
public class AbstractClassEg {
	public static void main(String[] args) {
		Parentabs object=new Childabs();
		object.show();
		object.run();
	}

}
