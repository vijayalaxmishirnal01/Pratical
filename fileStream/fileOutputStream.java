package fileStream;

import java.io.FileOutputStream;

public class fileOutputStream {

	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("D:\\File\\letter2.txt");
		//fos.write(65); 
		}
		catch(Exception e)
		{
			System.out.println("An exception has occured!");
		}
	}
}
