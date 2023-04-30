package fileStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		//write in a file
		try
		{
			FileWriter fw = new FileWriter("D:\\File\\letter2.txt");
			//String s ="Hello world";
			fw.write("Hello world Again");
			
			fw.close();
			//System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("An exception has occured!");
		}
		
		//write in a file
				try
				{
					FileReader fr = new FileReader("D:\\File\\letter2.txt");
					
					int i;
					
					while((i=fr.read())!=-1)
					{
						System.out.println((char)i);
					}
					fr.close();
				}
				catch(Exception e)
				{
					System.out.println("An exception has occured!");
				}
	}
}
