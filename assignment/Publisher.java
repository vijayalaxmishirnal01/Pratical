package assignment;

public class Publisher {// P
 
	String pubname;
	String id;
	String city;
	
	Publisher(String pubname,String id,String city) {
		this.pubname=pubname;
		this.id=id;
		this.city=city;
	}
	void show() {
		System.out.println("--------Publisher details-------");
		System.out.println("Publisher Name:"+pubname);
		System.out.println("Publisher ID:"+id);
		System.out.println("Publisher City:"+city);
}
}
