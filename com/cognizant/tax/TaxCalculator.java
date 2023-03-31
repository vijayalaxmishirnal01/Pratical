/*Problem Statement 1: Declaring instance variables.
Develop a class “TaxCalculator” inside a package “com.cognizant.tax”. 
The class should have an instance float variable named “basicSalary” and
 a boolean variable  named “citizenship”.*/

package com.cognizant.tax;

public class TaxCalculator {
//instance class
    float basicSalary;
	
	boolean  citizenship;
	TaxCalculator(float bascicSalary,boolean citizenship) {
		//Accessing instance variable
		this.basicSalary=bascicSalary;
		this.citizenship=citizenship;
	}
	void display() {
		System.out.println(this.basicSalary);
	}

	public static void main(String[] args) {
		//Creating an instance of the class
		TaxCalculator obj=new TaxCalculator(5000, false);
		obj.display();
	}
}

    