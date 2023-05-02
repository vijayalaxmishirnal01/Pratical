package Exception;

import java.util.Scanner;

public class ExceptionDemo2 {

		public static void main(String[] args) {
			//Scanner sc =  new Scanner(System.in);
			
			//nested try block
			try(Scanner sc =  new Scanner(System.in))//try with resource
			//if we use the scanner object inside try then will automatically get closed
			
			{
				try {
					System.out.println("Enter a number:");
					int a= sc.nextInt();
					System.out.println("Enter divisor:");
					int b=sc.nextInt();
					System.out.println("Result:"+(a/b));					
				}
				catch(ArithmeticException e)
				{
					System.out.println("Cannot divide a number by zero");
				}
				int arr[] =  new int[5];
				arr[5] = 90;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			//finally block is the block/closing block which always gets executed
			finally {
				//sc.close(); //close the scanner
				System.out.println("Finally block always gets excuted");
			}
			//another alternative of finally close is try with resource
		}
}
