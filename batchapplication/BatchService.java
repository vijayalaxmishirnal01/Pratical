package batchapplication;

import java.util.Scanner;

public class BatchService {
	
	static Scanner sc = new Scanner(System.in);
	static Java java[] = new Java[50];
	static int jindex = 0;
	
	public static void saveJavaStudentDetails()
	{
		System.out.println("Enter Student Id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Student phone number: ");
		long phone = sc.nextLong();
		
		java[jindex] =new Java(id, name, email, phone);
		jindex++;
		System.out.println("Student details save Successfully!!");
	}
	
	public static void getJavaStudentDetailsByID() throws StudentNotFoundException
	{
		boolean flag =false;
		System.out.println("Enter the student Id to Search: ");
		int id = sc.nextInt();
		for(int i=0; i<jindex; i++)
		{
			if(id==java[i].getStdid())
			{
				System.out.println("Student Id: "+java[i].getStdid());
				System.out.println("Student Name: "+java[i].getStdName());
				System.out.println("Student Email: "+java[i].getEmail());
				System.out.println("Student Phone: "+java[i].getPhone());
				flag= true;
				break;
			}
		}
		if(flag==false)
		{
			throw new StudentNotFoundException("Student Details Not Found");
		}
	}
}
