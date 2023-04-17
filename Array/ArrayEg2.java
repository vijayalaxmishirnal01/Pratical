package Array;
//Returning array from a method
public class ArrayEg2 {
	static int[]get(){//method which return an array 
		return new int[] {10,20,30};//instantiation and initialoization
	}
	public static void main(String[] args) {
		int arr[]=get();//
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	}

