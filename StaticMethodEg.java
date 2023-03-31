
public class StaticMethodEg {
int m=20;//normal instance variable
static int n=10;// static variable
static int add(int a,int b) { // static method
	return a+b;
}
public static void main(String[] args) {
	int c=StaticMethodEg.add(5, 4);
	System.out.println(c);
	//we can not call non static variable
	//inside main without obj because main method is a static
	StaticMethodEg refvar =new StaticMethodEg();
	System.out.println(refvar.m); //m is non static
	System.out.println(n);//static variable
}
}
