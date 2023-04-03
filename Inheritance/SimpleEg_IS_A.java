package Inheritance;

class Parents_SimpleEg_IS_A{ //Parent class
	int marks=80;	
}
class SimpleEg_IS_A extends Parents_SimpleEg_IS_A{ //Child class
	int Additional_per=5;
	public static void main(String[] args) {
		SimpleEg_IS_A obj=new SimpleEg_IS_A();
		System.out.println("Total marks:"+(obj.marks+obj.Additional_per));
		}
}
