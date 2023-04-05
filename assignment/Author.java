package assignment;

public class Author {

	String name;
	String age;
	String place;
	
	 public Author(String name,String age,String place){
		this.name=name;
		this.age=age;
		this.place=place;
	}
	void print() {
		System.out.println("-----------Author details---------");
		System.out.println("Author Name:"+name);
		System.out.println("Author Age:"+age);
		System.out.println("Author place:"+place);
	}
	
}
