package assignment;

class Employee{//parent class
float salary = 40000;
void incrementSalary()//parent class method
{
System.out.println("The Employee incremented salary is :" +(salary + (salary * 0.2)) );
}
}
class Developer extends Employee{//child 1 class
void incrementSalary()//child 1 class method 
{
System.out.println("The Developer incremented salary is :" +(salary + (salary * 0.5)) );
}
}
class Manager extends Employee{//child 2 class
void incrementSalary()//child 2 class method
{
System.out.println("The Manager incremented salary is :" +(salary + (salary * 0.10)) );
}
}
//Main class 
public class Assignment_Overriding  {
public static void main(String args[]){
Employee e =new Employee( );
Developer d = new Developer();
Manager m = new Manager();
// an object  class incrementSalary() method to be execute
e.incrementSalary();
d.incrementSalary();
m.incrementSalary();
}
}


