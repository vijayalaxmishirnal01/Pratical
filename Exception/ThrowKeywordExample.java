package Exception;

public class ThrowKeywordExample {
	static void divisionNo(int num)throws ArithmeticException{
		if((num % 5 == 0) && (num % 11 == 0))
		{
			System.out.println("The number is divisible");
		}else {
			throw new ArithmeticException("The number is not divisible by both 5 and 11");
		}
	}
	public static void main(String[] args) {
		try {
			divisionNo(55);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
