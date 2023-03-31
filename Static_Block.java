//till jdk 1.6 it is possible that without main we can execute static block.
//jdk 1.7 onwards it is not possible to execute a javacode without main()
public class Static_Block {
	static{
		System.out.println("This is Static Block.");
	}
	/*public static void main(String[] args) {
		System.out.println("Main method executed.");
	}*/
}
