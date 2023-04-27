package String;
//char[] work same as java string
public class StringExample {
	public void show() { // method 1
		char [] arr= {'j','a','v','a'}; //char type array
		System.out.println(arr);
		String s=new String(arr); //by using new keyword creating String
		System.out.println("Value is:"+s); //"java"	
		}
		public void myFunction() { //method 2
		String s1="Laxmi"; //String literal(creating object of string
		String s2="Laxmi"; //It does not create any new object
			String s3 = new String(s1);
			System.out.println(s2); //Laxmi
		}
		public static void main(String[] args) {
		StringExample str=new StringExample();
		str.show();
		str.myFunction();
		}
}
