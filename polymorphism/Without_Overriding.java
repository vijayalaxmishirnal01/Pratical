package polymorphism;
//In my subclass not use overriding
class Test{ //parent class
	void Show() { //user-defined parent class method
		System.out.println("Show result");
	}}
public class Without_Overriding extends Test {
	public static void main(String[] args) {
		Without_Overriding obj=new Without_Overriding();
		obj.Show();
	}
}


