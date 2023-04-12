package Super;

class Shape1 {//Parent class
	void print() { //parent class method
		System.out.println("print circle");;
	}
}
class Size1 extends Shape1{ //child class
	void print() { //parent class method
		System.out.println("print triangle");
	}
		void display() { //child class method
			System.out.println("print nothing ");
		}
		void show() { //super method on child class
			super.print();
			display();
			print();
		}
	}
//Main class
public class SuperMethod {
	public static void main(String[] args) {
		//Creating child class object
		Size1 obj = new Size1();
		obj.show();
	}
}