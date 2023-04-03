package Inheritance;

	class Parent{ //parent class
		void show() { //parent class user-defined method
			System.out.println("Show the details of parent class.");
		}
	}
	class Child extends Parent{// child class
		void display() { //child class user-defined method
			System.out.println("Display the details of child class.");
		}
	}
	public class SingleInheritance { //main class
		public static void main(String[] args) {
			Child c= new Child(); // create a object of child class
			//by using child object we can use parent class method
			c.display();
			c.show();
		}
}
