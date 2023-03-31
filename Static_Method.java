class Static_Method1{ //class 1
	//Instance Variable
int rollno;
String Name;
float fee;
static String clg="Agpatil";//static variable
 //static method to change the value of static variable
static void change() { //static method
	clg="SPM";
}
//Parameterized constructor
Static_Method1(int rollno,String name,float fee){
	this.rollno=rollno;
	this.Name=name;
	this.fee=fee;
}
//user defined method
	void display(){
		System.out.println(rollno+" "+Name+" "+fee+" "+clg);
	}

public class Static_Method {
public static void main(String[] args) {
	//no need to create object for static method 
	//calling static method with class name
	Static_Method1.change();
//creating object	
Static_Method1 s1=new Static_Method1(102,"abc",5000);
Static_Method1 s2=new Static_Method1(103,"xyz",5000);
s1.display();
s2.display();
}
}
}