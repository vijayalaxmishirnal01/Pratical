package BookSystem;

import java.util.Scanner;

public class BookService {

	static Book book[] = new Book[10];
	static Scanner sc =new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("Enter Book Id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Book Name:");
		String bname=sc.nextLine();
		
		System.out.println("Enter Book Price:");
		double price = sc.nextDouble();
		
		book[index] = new Book(id, bname, price);
		index++; // increment the next value 0+1=1
		System.out.println("Book details created Sucessfully!");
	}
	
	//display all book details method
	public static void getAllBookDetails()
	{
		int i;
		for(i=0; i<index; i++)
		{
			System.out.println("Book Id: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookName());
			System.out.println("Book Price: "+book[i].getBookPrice());
			System.out.println("=====================================");
		}
	}
	
	//display book details using book Id
	public static void getBookDetailsUsingId() 
	{
		boolean flag = false;
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		for(int i=0; i<index; i++)
		{
			if(id==book[i].getBookId())
			{
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=====================================");
				flag=true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Book details not found!!");
		}
	}
	//display the book details using book name
	public static void getBookDetailsUsingName() 
	{
		boolean flag = false;
		//sc.nextLine();
		System.out.println("Enter Book Name: ");
		String bname=sc.nextLine();
		for(int i=0; i<index; i++)
		{
			if(bname.equalsIgnoreCase(book[i].getBookName()))
			{
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=====================================");
				flag=true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Book details not found!!");
		}
	}

	//Updating
	public static void UpdateBookDetailsUsingId()
	{
		boolean flag = false;
		System.out.println("Updating of the id book");
		int id = sc.nextInt();
		for(int i=0; i<index; i++)
		{
			if(id==book[i].getBookId())
			{
				sc.nextLine();
				System.out.println("Book Name: "+book[i].getBookName());
				String bname =sc.nextLine();
				System.out.println("Book Price: "+book[i].getBookPrice());
				double price = sc.nextDouble();
				
				book[i].setBookName(bname);
				book[i].setBookPrice(price);
				System.out.println("Book details created Sucessfully!!");
				System.out.println("=====================================");
				flag=true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Book details not update!!");
		}
	}
	
	
}
