package Array;

class Student_Array {//main class
	//declaring instance variable
	int studentNo;
	String Name,Mail,Address;
	double fees;
	//Static member for increaseFees method
static double increasedFees;

/*creating constructor for assessing the details to student passing
 values through overloaded constructor */
Student_Array(int sn,String name,String mail,String address){
	this.studentNo=sn;
	this.Name=name;
	this.Mail=mail;
	this.Address=address;
}
//method for initializing fees to student 
void fees(double f) {
	fees=f; //assigning passing value
}
//method for printing output
//for concatenation and sop the output
void display() {
	//updating fees before printing
	this.fees=this.fees+increasedFees;
System.out.println("Id-"+this.studentNo+"   "+"Name-"+this.Name+"  "+"Address-"+this.Address+ "Fees-"+fees);
}
//increasing fees method
static void increaseFees(int n,double f) {
	if(f<2000) { //condition
		f=10*f/100; //logic for increasing fees
		increasedFees=f; //assigning the value to static increasing fees
	}
}
//main method
public static void main(String[] args) {
	//Instantiating student type of array and declaring
	Student_Array[] s=new Student_Array[5];
	
//Instantiating objects of Studentclass and Initializing
	s[0]=new Student_Array(101,"Akash","akash@gmail.com","somewhere,Delhi");
	s[1]=new Student_Array(102,"ravi","ravi@gmail.com","somewhere,pune");
	s[2]=new Student_Array(103,"Sam","sam@gmail.com","somewhere,Usa");
	s[3]=new Student_Array(104,"Ram","ram@gmail.com","somewhere,Mumbai");
	s[4]=new Student_Array(105,"Purushottam","purushottam@gmail.com","somewhere,Bihar");
	
	//adding fees values
	s[0].fees(1064);
	s[1].fees(2056);
	s[2].fees(957);
	s[3].fees(1999);
	s[4].fees(2001);
	
	//increasing fees whose fees is less than 2000
	increaseFees(100,1064);
	increaseFees(102,957);
	increaseFees(10,1999);
	
	//traversing the array of student objects
System.out.println("--------------Details of Students");
for(Student_Array i:s) {
i.display();//traversing with invocation of display
}
}
}

