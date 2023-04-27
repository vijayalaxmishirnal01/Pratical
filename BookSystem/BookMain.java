package BookSystem;

import java.util.Scanner;

public class BookMain {
	
	public static void main(String[] args) {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		BookService bService = new BookService();
		
		System.out.println("Welcome to The Congress Library");
		System.out.println("===============================");
		do {
		System.out.println("Choose the options: ");
		System.out.println("1) Create Book Details\n"
				+ "2) Display all book deatils\n"
				+ "3) Display book details using id\n"
				+ "4) Display book details using Name\n"
				+ "5) Update book details using id\n"
				+ "6) Exit");
		System.out.println("===============================");
		System.out.println("Enter the choice: ");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			bService.createBook();
			System.out.println();
			break;
	
		case 2:
			bService.getAllBookDetails();
			System.out.println();
			break;
			
		case 3:
			bService.getBookDetailsUsingId();
			System.out.println();
			break;
			
		case 4:
			bService.getBookDetailsUsingName();
			System.out.println();
			break;
			
		case 5:
			bService.UpdateBookDetailsUsingId();
			System.out.println();
			break;
			
		case 6:
			System.out.println("Thank you for visiting!!");
			System.exit(0);
			break;
			
			default:
				System.out.println("Wrong choices!!");
		}
		
		}while(true);
	}
}
