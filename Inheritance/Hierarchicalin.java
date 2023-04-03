package Inheritance;
//Hierarchical Inheritance

class Operating_System{ //parent class
	void boost() {
		System.out.println("Boosting mode on.");
	}
}

class Windows extends Operating_System{ //child class 1
	void run() {
		System.out.println("Run mode on");
	}
}

class Linux extends Operating_System{ // child class 2
	void storage_capasity() {
		System.out.println("Storage capacity is very high.");
	}
}
public class Hierarchicalin {
	public static void main(String[] args) {
		Linux b=new Linux();
		b.boost();
		b.storage_capasity();
		
		Windows c=new Windows();
		c.run();
		c.boost();
	}

}
