package files;

import java.io.File;

/*11.1 Write a program to create a text file in the path c:\java\abc.txt and check
whether that file is exists. Using the command exists(), isDirectory(),
isFile(), getName() and getAbsolutePath().*/

public class Files {
	
	public static void main(String [] args){
		
	 File file = new File("/home/vitor/Desktop/JAVA/Java_Practice/Lab_OOP_Java.pdf") ;
	 System.out.println("Name:" + file.getName());
	 System.out.println("Path :" + file.getPath());
	 System.out.println("Absolute path :"+file.getAbsolutePath());
	 System.out.println(file.exists() ? "file exists" : "file does not exist");
	 System.out.println(file.isDirectory() ? "file is a directory" : "file is not a directory");
	 System.out.println(file.isFile()? "file is an ordinary file" : "file may be a named pipe") ;
	 
	} 

}
