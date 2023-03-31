package package_eg;

class Rect{
	void calculateArea(double length,double breadth) {
		System.out.println("The Area of the rectangle is calculated using"
				+ " the formula length * breadth");
	}
}
public class AreaCal {
	public static void main(String[] args) {
		Rect obj=new Rect();
		obj.calculateArea(4,5);
	}

}
