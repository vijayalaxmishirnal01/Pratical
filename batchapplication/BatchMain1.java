package batchapplication;

import java.util.Scanner;

public class BatchMain1 
{
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			BatchService1 batch = new BatchService1();
			int ch;
			
			System.out.println("Welcome to Aundip Foundation:");
			System.out.println("==============================");
			do {
				System.out.println("Press:\n 1)Java 2)AWS 3)Others 4)Exit");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					batch.Create();
					batch.Read();
					batch.Update();
					break;
					
				case 2:
			
				}
			}while(true);
	}
}
	
