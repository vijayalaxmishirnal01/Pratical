package Super;

class Shape {//Parent class
	String name = "circle";
}
class Size extends Shape{ //child class
	String name="No size";
	void print() { //child class method
		System.out.println(name);
		System.out.println(super.name);
	}
}

//main class
public class SuperIV {
	public static void main(String[] args) {
		//creating object o child class
		Size obj = new Size();
		obj.print();
	}
}