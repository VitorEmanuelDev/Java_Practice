import java.util.Scanner;

// Write a Java program to find the number of boxes needed. 

public class FlourPackProblem {
	  
	    private static Scanner scan;
		private static int totalWeight;

		public static int boxFit(int weightArray[], int totalWeight, int boxCapacity){ 
	  

	        /*int newBox = 0, availableSpace = boxCapacity; 
	  
	       for (int value = 0; value < weightArray.length; value++) { 
	            
	            if (weightArray[value] > availableSpace) { 
	                
	                availableSpace =  boxCapacity - weightArray[value]; 
	                
	                newBox++;
	                
	                
	            }else{
	            	
	            	availableSpace -= weightArray[value]; 
	                
	            }
	            
	        } */
	       
			int numberOfBoxes = 0;
			
			if(totalWeight % boxCapacity != 0) {
				
				 numberOfBoxes = (totalWeight / boxCapacity) + 1;
				
			}else {
				
				 numberOfBoxes = (totalWeight / boxCapacity);
				
			}
	        
	        
			return numberOfBoxes; 
	        
	    } 
	  
	    
	    public static void main(String[] args){ 
	    	
	    	scan = new Scanner(System.in);
	    	
	    	System.out.println("How many Kg can a box handle?");
		    int boxCapacity = scan.nextInt();
	    	
	        System.out.println("How many packs are there?");
	        int length = scan.nextInt();
	        
	        int [] weightArray = new int[length];
	        
	        System.out.println("What are the weights of each pack?");

	        for(int value = 0; value < weightArray.length; value++){
	        	
	        	weightArray[value] = scan.nextInt();
	        	totalWeight += weightArray[value];
	        	
	        }
	        
	  
	        
	        System.out.println("Number of boxes needed to fit the total weight: " + boxFit(weightArray, totalWeight, boxCapacity)); 
	        
	    } 
	    
	} 


