package BookSystem;

public class Book {
	private int BookId;
	private String BookName;
	private double BookPrice;
	
	//getter and setter method
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	
	//no-Arg constructor
	public Book()
	{
		super();
	}
	
	
	//Parameterized  constructor
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookPrice = bookPrice;
	}
	
	
}
