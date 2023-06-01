import java.io.*;
import java.io.File;
public class file_basics
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("f2.txt");
		if(f.exists()) {
			System.out.println("File exits");
			System.out.println("File path is " + f.getAbsolutePath());
			System.out.println("File is readable " + f.canRead());
			System.out.println("File is writable " + f.canWrite());
			System.out.println("File length is " + f.length());
		}
		else
		{
			System.out.println("File doesn't exist");
		}
	}
}
