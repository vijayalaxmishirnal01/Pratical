package Inheritance;

class Parent1{ //parent class
	void show() { //parent class user-defined method
		System.out.println("Show the details of parent class.");
	}
}
//child class of Parent class of child 2 class 
class Child1 extends Parent1{// child class
	void display() { //child class user-defined method
		System.out.println("Display the details of child1 class.");
	}
}

class Child2 extends Child1{ //child 2 class
	void print() { //child1 class user-defined method
		System.out.println("print the output of child2 class.");
	}
}
public class MultilevelInheritance { //main class
	public static void main(String[] args) {
		Child2 c= new Child2(); // create a object of child2 class
		c.display();
		c.show();
		c.print();
	}
}



