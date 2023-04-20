package Array;
//two Matrices Addition-2*2
public class AdditionArray {
public static void main(String[] args) {
	//create two matrix
	int a[][]= {{1,2},{3,4}};
	int b[][]= {{1,5},{3,5}};
	
	//for storing result creating another matrix
	int c[][]=new int[2][2];//two row three column
	
	//logic and printing
	for(int i=0;i<2;i++){//printing row
	for(int j=0;j<2;j++){//printing column
	c[i][j]=a[i][j]+b[i][j]; //logic for matrix addition array
	System.out.println(c[i][j]+" ");
	}
	System.out.println();
	}
	}}