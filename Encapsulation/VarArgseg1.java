package package_eg;
class Calculator{
	int addition(int...n) {//varagrs
		int sum=0;
		for(int i:n) {//for each loop
			sum+=i;//0+2+3+4
		}
		return sum;
	}
	int subtraction(int...n) {//varagrs
		int result=0;
		for(int i:n) {//for each loop
			result-=i;//0+2+3+4
		}
		return result;
	}
	int multiplication(int...n) {//varagrs
		int result=1;
		for(int i:n) {//for each loop
			result*=i;//0+2+3+4
		}
		return result;
	}
}
public class VarArgseg1{
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println("The addition of 2,3,4 is:"+obj.addition(2,3,4));
		System.out.println("The subtraction of 6,7,8,9:"+obj.subtraction(6,7,8,9));
		System.out.println("The multiplication of 1,2,3,4,5:"+obj.multiplication(1,2,3,4,5));
	}
}

