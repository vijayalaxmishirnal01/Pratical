package Inheritance;

public class Student {
	int StuId;
	String StuName;
	Address adr; //Aggregation
	Student(int StuId,String StuName,Address adr){
		this.StuId=StuId;
		this.StuName=StuName;
		this.adr=adr;
	}
	void show() {
		System.out.println(StuId+" "+StuName);
		System.out.println(adr.City+" "+adr.Dist+" "+adr.Country);
	}
}
