package Array;

class Student_detail{
	private int Student_no;
	private String Student_name;
	private String Student_mailId;
	private String Student_Address;
	private double Student_fees;
	
	public Student_detail(int Student_no,String Student_name,String Student_mailId,String Student_Address,double Student_fees) {

		this.Student_no = Student_no;
		this.Student_name=Student_name;
		this.Student_mailId=Student_mailId;
		this.Student_Address=Student_Address;
		this.Student_fees=Student_fees;
}
	public void fees(int Student_no) {
		System.out.println("Student of fees"+Student_no+"is:"+Student_fees);
	}
	
	public void display(int Student_no) {
		System.out.println("Student Details"+Student_no+":");
		System.out.println("Student no:"+Student_no);
		System.out.println("Student Name:"+Student_name);
		System.out.println("Studnet MailId:"+Student_mailId);
		System.out.println("Student Address:"+Student_Address);
		System.out.println("Student Fees:"+Student_fees);
	}
	
public class StudentDetails {
public static void main(String[] args) {
	Student_detail[] s=new Student_detail[5];
	
	s[1]=new Student_detail(1,"Ram","ram@gmail.com","Pune",2000.0);
	s[2]=new Student_detail(2,"sam","sam@gmail.com","Mumbai",2500.0);
	s[3]=new Student_detail(3,"john","john@gmail.com","Delhi",1000.0);
	s[4]=new Student_detail(4,"Peter","peter@gmail.com","Goa",1500.0);
	s[5]=new Student_detail(5,"Lisa","lisa01@gmail.com","Usa",3000.0);

}
}
}
