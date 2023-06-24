package batchapplication;

import java.util.Iterator;
import java.util.Scanner;

public class BatchService1 {
	
	static Scanner sc = new Scanner(System.in);
	static Aws1 aws[] = new Aws1[50];
	static Java1 java[] = new Java1[50];
	static int jindex = 0;
	static int aindex = 0;
	static int i;
	
	public static void Create()
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
		
		java[jindex] =new Java1(id, name, phone, email);
		jindex++;
		System.out.println("Student details save Successfully!!");
		
		aws[aindex] = new Aws1(id, name, phone, email);
		aindex++;
	}
	
	public static void Read()
	{
		int i;
		for(i=0; i<jindex; i++)
		{
			System.out.println("Student Id: "+java[i].getStdid());
			System.out.println("Student Name: "+java[i].getStdName());
			System.out.println("Student Phone: "+java[i].getPhone());
			System.out.println("Student Email: "+java[i].getEmail());
		}
	}
	
	public static void Update()
	{
		boolean flag = false;
		System.out.println("Updating of the Student Id");
		int id = sc.nextInt();
		for(i=0; i<jindex; i++)
		{
			if(id==java[i].getStdid())
			{
				sc.nextLine();
				System.out.println("Student Name: "+java[i].getStdName());
				String name = sc.nextLine();
				
				System.out.println("Enter Student Email: ");
				String email = sc.nextLine();
				
				System.out.println("Enter Student phone number: ");
				long phone = sc.nextLong();
				flag=true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Student details not update!!");
		}
	}
}