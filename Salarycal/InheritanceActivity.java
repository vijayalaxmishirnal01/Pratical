package Salarycal;

class Employee {
	//instance variable
 long employeeId;
 String employeeName;
 String employeeAddress;
 long employeePhone;
 double basicSalary;
 double specialAllowance = 250.80;
 double hra = 1000.50;
	
	Employee(long id,String name,String address,long phone){
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
	}

	void calculateSalary () {	
		double salary = basicSalary + (basicSalary * specialAllowance/100) + basicSalary * hra/100;
		System.out.println(salary);
	}
	void calculateTransportAllowance() {
		double transportAllowance = 10/100*basicSalary;
		System.out.println(transportAllowance);		
	}
	
}

//Manager class
class Manager extends Employee { 
		Manager(long id, String name, String address, long phone, double salary)
		{
		super(id, name, address, phone); 
		this.basicSalary = salary; 
		}
		void calculateTransportAllowance () {
		double transportAllowance = 15 * basicSalary/100;
		System.out.println(transportAllowance);
		}
	}

//Trainee class
class Trainee extends Employee{
	Trainee(long id, String name, String address, long phone, double salary)
	{
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
	void calculateTransportAllowance() {
		double transportAllowance = 10.0/100.0*basicSalary;
		System.out.println(transportAllowance);		
	}
}
	
//InheritanceActivity class
public class InheritanceActivity {
	public static void main(String[] args) {
		//Test Case1
		Manager m= new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Peter Salary:");
		m.calculateSalary();
		System.out.println("Peter Transport Allowance:");
		m.calculateTransportAllowance();
		
		//Test case2
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Peter Salary:");
		t.calculateSalary();
		System.out.println("Jack Transport Allowance:");
		t.calculateTransportAllowance();
	}
}
