package assignment;

import java.util.Scanner;

public class Circle {
private float radius;
static  float pi=3.5f;

Circle(){
	radius=1.5f;
}
Circle(float radius){
	this.radius=radius;
}
Circle(float radius,float pi){
	this.radius=radius;
}
static float calculateCircleArea(float radius) {
	return pi*radius*radius;
}
static float calculateCircumference(float radius) {
	return 2*pi*radius;
}
	public static void main(String[] args) {
		Circle obj=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		float radius =sc.nextFloat();
		System.out.println("the area is:"+calculateCircleArea(radius));
		System.out.println("the circumference is :"+calculateCircumference(radius));
	
	}
}
