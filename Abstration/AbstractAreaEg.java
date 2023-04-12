package Abstration;
//Example of Area of rectangle and Area of perimeter.
abstract class Shape {//abstract class---parent class
	int l,b;
	abstract void printArea(int l,int b);//abstract class method
}

class Rectangle extends Shape { //1st child class 
	void printArea(int l,int b) { //abstract method of parent class
		System.out.println("The area of Rectangle is: " + (l*b));
	}
}

class Perimeter extends Shape{ // 2nd child class
	void printArea(int l,int b) { //abstract method of parent class
		System.out.println("The area of perimeter is:"+(2*(l+b)));
	}
}
public class AbstractAreaEg { 
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea(2,4);
		
		Perimeter per=new Perimeter();
		per.printArea(2,4);
}}