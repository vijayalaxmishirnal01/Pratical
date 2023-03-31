
class Static {
	
int rollno;
String name;
float fee;
static String collage="Agpatil";
//Constructor
Static(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
		}

	public class Static1 {//cls2
		public static void main(String[] args) {
			//object
		Static s1= new Static(101,"Laxmi",5000);
		Static s2= new Static(102,"Ashmita",7000);
			s1.display();
			s2.display();
		}
	}
}
