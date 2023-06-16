/*
 * Write a Java program that reads a file name from the user, and then displays
 * information about whether the file exists, whether the file in readable,
 * whether the file is writable, the type of file and the length of the file in
 * bytes.
 */

import java.io.*;
import java.io.File;

public class FileInfo {
	public static void main(String args[]) throws IOException {
		File f = new File("file.txt");
		if (f.exists()) {
			System.out.println("File exits");
			System.out.println("File path is " + f.getAbsolutePath());
			System.out.println("File is readable " + f.canRead());
			System.out.println("File is writable " + f.canWrite());
			System.out.println("File length is " + f.length());
		} else {
			System.out.println("File doesn't exist");
		}
	}
}
