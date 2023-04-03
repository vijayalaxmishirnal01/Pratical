package Inheritance;

class Arithmetic1 {
public int add(int a,int b)
	{
		return a+b;
	}
}
class Adder1 extends Arithmetic1
{
	public static void main(String[] args) {
	        Adder1 a = new Adder1();
	        int sum = a.add(12, 13); // 
	        System.out.println("sum : "+sum);
	    }
}