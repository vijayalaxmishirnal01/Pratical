package Interface;

interface Shape{
	void shape_name(); //abstract method
}
class User_Circle implements Shape
{
	@Override
	public void shape_name() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Circle");
	}
	
}
class User_Triangle implements Shape  
{ 
	@Override
	public void shape_name() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Triangle");
	}
}
public class InterfaceEg {
	public static void main(String[] args) {
	Shape object=new User_Triangle();
	object.shape_name();
	}
}
