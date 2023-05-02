package Exception;

public class Exceptiondemo {

	public static void main(String[] args) {
		
		System.out.println("We are learning exception handling");
		//null pointer exception
		//String s = null;
		//System.out.println("Length: "+s.length());
		
		String s1 ="hi";
		try {
			//array index out of bounds exception
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[4]);
			
			//arithmetic exception
			int a= 30, b=5;
			System.out.println("Division: "+(a/b));
		
			//number format exception
			int i = Integer.parseInt(s1);
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			//System.err.println(e.getMessage());
			System.out.println("You cannot divide a number by zero!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			//System.out.println("Exception occurred: Index not found!");
		}
		//Exception is like the parent class which contains all the exceptions
		//If you do not know which exception might occur then we can simple use this
		catch(Exception e)
		{
			//if(e instanceof ArithmeticException)
			//{
				//System.out.println("You cannot divide a number by zero");
			//}
			//else if(e instanceof ArrayIndexOutOfBoundsException)
			//{
				//System.out.println("Exception occured: Index not found!");
			//}
			//else
				System.out.println(e.getMessage());
		}
		//if we put other exceptions under this then it will throw an error that the exception has already been handled
		System.out.println("Rest of the code");
		
	}

}
