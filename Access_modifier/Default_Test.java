package Access_modifier;
import package_eg.Default;
public class Default_Test {
public static void main(String[] args) {
	//outside package we can not access default method and class
	Default obj = new Default();
	obj.show();
}
}
