package Access_modifier;
//private datamember/constructor/method/Not for class except nested class

class Test {
private int a=10;
private void display() {
	System.out.println("Private method");
}
}
public class Private{
	public static void main(String[] args) {
		Test obj = new Test();
		//Complilation error
		System.out.println();//outside class cant access private datamember
		obj.display();//outside class cant access private method
	}
}

