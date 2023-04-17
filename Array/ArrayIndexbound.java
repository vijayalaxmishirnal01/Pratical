package Array;
/*JVM throws an ArrayIndexOutOfBoundsException if length of the array in
-ve,equal to the array size or greater than the array size.*/
public class ArrayIndexbound {
public static void main(String[] args) {
	int a[]= {2,5,4,8,9};
	for(int i=0; i<=a.length;i++)
		System.out.println(a[i]);
}
}
