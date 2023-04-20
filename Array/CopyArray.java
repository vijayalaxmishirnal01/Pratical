package Array;
public class CopyArray { //class
	public static void main(String[] args) {
		//declaring a source array
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		//declaring a destination array
		char[]copyTo=new char[7];//new array
	System.arraycopy(copyFrom, 3, copyTo, 2, 4);
	//print the destination array
	System.out.println(String.valueOf(copyTo));
	}
}
