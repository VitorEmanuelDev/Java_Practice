package files;

import java.io.File;

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
