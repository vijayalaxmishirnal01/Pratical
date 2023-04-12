package Super;

class shape2 { //parent class
	void Shape2()
	{ // parent class method
		System.out.println("Hello");
	}
}
class Size2 extends shape2 { //child class
	Size2() {
		super(); //Super method
		System.out.println("Hii");
	}
}
//main class
public class Supercons {
	public static void main(String[] args) {
		//creating object on child class
		Size2 obj = new Size2();
	}

}
