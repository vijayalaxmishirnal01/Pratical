package Array;

public class ArrayEg {
	public static void main(String[] args) {
		int a[]=new int[5]; //declaration and instantiation
		//initialization
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		//traversing (printing one after another) an array using for loop
		System.out.println("Traversing an array by using for each Loop");
		for(int i:a)
			System.out.println(i);
		//traversing (printing one after another) an array using for loop
		System.out.println("Traversing an array by using for each Loop");
		for(int i=0;i<a.length;i++)//length is one of the property of an
			System.out.println(a[i]);
	}
}
