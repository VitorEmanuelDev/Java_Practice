package vector;

import java.util.*;

class VectorExample {
 
	public static void main(String[] args){
	 
	     int size = 5;

	     Vector<Integer> vector = new Vector<Integer>(size);
	
	     for (int i = 1; i <= size; i++)
	         vector.add(i);
	
	     System.out.println(vector);
	
	     vector.remove(3);
	
	     System.out.println(vector);
	
	     for (int i = 0; i < vector.size(); i++)
	         System.out.print(vector.get(i) + " ");
	}
}