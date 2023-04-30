package fileStream;

import java.io.FileInputStream;

public class fileInputStream {
	
	public static void main(String[] args) {
		
		try {
		FileInputStream fis = new FileInputStream("D:\\File\\letter.txt");
		int i;
		System.out.println("Remaining bytes:"+fis.available());
		
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i); //typecasting int to char
		}
		System.out.println();
		System.out.println("Remaining bytes: "+fis.available());
		fis.close();
		}
		catch(Exception e)
		{
			System.out.println("An exception has occured!");
		}
	}
}

		