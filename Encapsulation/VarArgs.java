package package_eg;
//we can take any no of arguments
public class VarArgs {
static void show(String...text) { //using varargs
	System.out.println("show method invoked.");
	for(String s:text) {//for each loop
		System.out.println(s);
	}}
	public static void main(String[] args) {
		show();//zero arguments
		show("hi");//one args
		show("I","Love","coding");//three args
		show("a","v","d","e","h");//five args
	}
}
