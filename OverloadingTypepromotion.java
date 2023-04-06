package polymorphism;
//bye-int---short----long-float-double
//char-int-float-double-long
public class OverloadingTypepromotion { //class
	void add(int a,double b) { //method 1
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c) { //method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		OverloadingTypepromotion obj=new OverloadingTypepromotion();//object
		obj.add(2, 3);//2nd int value (3) will be promoted to double
		obj.add(10, 20, 30);
	}

}
