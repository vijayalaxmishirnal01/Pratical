package fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream fs =new FileInputStream("D:\\File\\letter2.txt");
			FileOutputStream os = new FileOutputStream("D:\\File\\copy.txt");
			
			int i;
			while((i=fs.read())!=-1)
			{
				os.write(i);
			}
			System.out.println("File has been Successfully copied!");
			
			fs.close();
			os.close();
		}
		catch(Exception e)
		{
			System.out.println("An exception has occured!");
		}
	}
}
