package Encapsulation;

class Students{ //encapsulated class
	//private data member
	private int stu_id;
	private String name,email;
	private float fees;
	//public getter and setter method
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}	
}
public class Encap_Test {
	public static void main(String[] args) {//class to test the encapsulation getter and setter
		Students s=new Students();//creating object of students class
//setting the values through setter method
		s.setStu_id(101);
		s.setName("XYZ");
		s.setEmail("xyz@gmail.com");
		s.setFees(5000);
//getting the values through getter method
		System.out.println(s.getStu_id()+" "+s.getName()+" "+s.getEmail()+" "+s.getFees());
	}
	
}