package Inheritance;

public class AggregationEg_HAS_A {
	public static void main(String[] args) {
Address address=new Address("Solapur","Solapur","India");
Student s=new Student(101,"ABC",address);
s.show();
}
}
