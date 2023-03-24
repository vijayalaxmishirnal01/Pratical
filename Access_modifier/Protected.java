package Access_modifier;
import package_eg.*;
//If you want to access protected method it is possible only through inherited
class Protected extends Protected_Test{
	public static void main(String[] args) {
		Protected obj = new Protected();
		obj.result();
	}

}
