package Array;
import java.util.Arrays;
public class EvenOddArray { //class
	public static void main(String[] args) {
		//declaration and initialization of an array
		int[] myArray = {5,7,2,3,4};
		System.out.println("Original Array: "+Arrays.toString(myArray));
		System.out.println("Even numbers:");
		for (int i=0; i<myArray.length; i++) {
		   if(myArray[i]%2 == 0) {
		      System.out.println(myArray[i]);
		   }
		}
		System.out.println("Odd numbers: ");
		for (int i=0; i<myArray.length; i++) {
		   if(myArray[i]%2 != 0) {
		      System.out.println(myArray[i]);
		   }

		}

	}
}









		/*int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int a = 0;
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0)
				a++;
		}
		System.out.println("Number of even numbers : "+a);
		System.out.println("Number of odd numbers  : "+(array_nums.length-a));*/
	