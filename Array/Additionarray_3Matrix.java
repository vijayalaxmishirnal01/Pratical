package Array;
//two Matrices Addition-3*3
public class Additionarray_3Matrix {
public static void main(String args[]){  
	//creating two matrices    
	int a[][]= {{1,2,3},{4,5,7},{5,1,2}};
	int b[][]= {{1,5,3},{4,2,1},{1,1,2}};   
	    
	//for storing result creating another matrix
	int c[][]=new int[3][3];  //3 rows and 3 columns  
	    
	//adding and printing addition of 2 matrices    
	for(int i=0;i<3;i++){    //printing row
	for(int j=0;j<3;j++){    //printing column
	c[i][j]=a[i][j]+b[i][j]; //logic for matrix addition array
	System.out.print(c[i][j]+" ");    
	}    
	System.out.println();//new line    
	}    
	}}  
	

