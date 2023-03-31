/*Problem Statement:
Develop a class “Rectangle” inside a package “com.cognizant.shapes”. The class should have a method called calculateArea()  which should print a message “The Area of the rectangle is calculated using the formula length * breadth”. Develop another class “AreaCalculator”  inside the package “com.cognizant.shapes” add a main method which invokes the calculateArea of the rectangle object.
Output:  The following message should be displayed in the console
“The Area of the rectangle is calculated using the formula length * breadth”*/

package com.cognizant.shapes;

class Rectangle{
	void calculateArea() {
		System.out.println("The Area of the rectangle is calculated using"
				+ " the formula length * breadth");
	}
}
public class AreaCalculator {
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.calculateArea();
	}

}


