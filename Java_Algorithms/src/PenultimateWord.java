import java.util.*;

//Write a Java program to find the penultimate (next to last) word of a sentence

 public class PenultimateWord {
	 
     private static Scanner scan;

	public static void main(String[] args){
    	 
     scan = new Scanner(System.in);
     
     System.out.print("Write a sentence: ");
     
	 String str = scan.nextLine(); //this string is one unit, and it's immutable unless we use a function
	 
	 String[] arrStr = str.split(" ");//the split function here is set to split the string into array elements whenever there's a space between them. this will make each word become a single element in an array structure which will allow us to navigate the string array strArr with indexes
	 
	 System.out.println("Penultimate word: "+ arrStr[arrStr.length - 2]);// to show the penultimate word/element, we have to remember '\0' comes after the last word/element of any string, and that the attribute .length will count it. so, putting strArr[strArr.length - 1] would get us the last word/element, but we want to get the penultimate word/element, so let's write strArr[strArr.length - 2] instead.
	 
	 }			
	
}