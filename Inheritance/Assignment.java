package Inheritance;

class Arithmetic{// Parent class
	int sum;
	void addition(int a,int b)
	{
		sum=a+b;
	}
}

class Adder extends Arithmetic{ // child class
	void display() {
		System.out.println("Sum: "+sum);
	}
}
public class Assignment {
public static void main(String[] args) {
	Adder a=new Adder();
	a.addition(10, 20);
	a.display();
}
}
