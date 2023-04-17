package Array;
import java.util.Scanner;
public class Arrayeg4 {
	int n;
	int []s=new int[n];//n is a size of an array
	public static void main(String[] args) {
		Arrayeg4 obj=new Arrayeg4();
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		obj.n=n;
		obj.s=new int[obj.n];
		int sum=0,avg=0,multi=1;
		for (int i=0;i<obj.n;i++){
			obj.s[i]=sc.nextInt();
			sum=sum+obj.s[i];
			
			multi=multi*obj.s[i];
		}
		avg=sum/n;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(multi);
	}
}
