/*Problem Statement 2: Usage of Arithmetic operators.
In the TaxCalculator class  create a method named  calculateTax()  that  should calculate and print the tax, the tax should  be calculated as follows
tax = 30*basic salary/100
NOTE: The value stored in the instance variable” basicSalary” should be used in the above calculation.
The calculated tax needs to be stored in another instance float variable “tax”.
This method will display the following message in the console.
“The Tax of the employee  for  the   <basic Salary> is <tax>”*/

package com.cognizant.tax;
import java.util.Scanner;

public class TaxCalcalator1 {
	private int basicSalary;
	private float tax;	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basicSalary:");
		basicSalary=sc.nextInt();
	}
	//create method in class
	public void calculateTax() {
		tax = 30*basicSalary/100;
	}
	public void display() {
		System.out.println("The Tax of the employee for the BasicSalary:"+basicSalary+"is Tax:"+tax);
	}
	public static void main(String[] args) {
		TaxCalcalator1 obj=new TaxCalcalator1();
		obj.input();
		obj.calculateTax();
		obj.display();
	}
}
