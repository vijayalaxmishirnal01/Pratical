package assignment;

public class Book {
 
	String Bname;
	int Price;
	Book(String Bname,int Price){
		this.Bname=Bname;
		this.Price=Price;		
	}
	void display() {
		System.out.println("---------Book Details--------");
		System.out.println("Name:"+Bname);
		System.out.println("Price:"+Price);
	}
	public static void main(String[] args) {
		Book b=new Book("core java",800);
		b.display();
		Author a1=new Author("Micheal","32","USA");
		a1.print();
		Publisher p=new Publisher("Sun Publisher","ABC-1110","London");
		p.show();
		
	}
}
