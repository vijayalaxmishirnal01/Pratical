package com.cognizant.shapes;

class Shape {
	void calculateArea(int radius)
	{
		System.out.println("The Area of the Circle is"+(3.14 *radius * radius));
	}
	
	void calculateArea1(int sides)
	{
		System.out.println("The Area of the Triangle is"+(0.433 * sides  * sides ));
	}
	
	void calculateArea11(int  sides)
	{
		System.out.println("The Area of the Squares is"+(sides  * sides ));
	}
	
	public class Shapes {
		public static void main(String[] args) {
			Shape s=new Shape();
			s.calculateArea(4);
			s.calculateArea1(2);
			s.calculateArea11(4);
		}
	}
}
