//related to the Item class
public class FindLowestPrice {


	public static void main(String[] args){
		
		Item items[] = {
				new Item("Book", 150),
				new Item("Backpack", 175),
				new Item("Laptop", 2530),
				new Item("Pencil case", 35),
				new Item("Notebook", 25),
				new Item("Tablet", 1300),
				null,//nullPointerexception test
				null,
				null
		};
		
		int lowestPrice = lookForCheapest(items);
		
		System.out.println("The " + items[lowestPrice].getName() + " is the cheapest item and costs: " + items[lowestPrice].getPrice());
		
		
	}
	
private static int lookForCheapest(Item[] items) {
		
		int lowestPrice = 0;
		
		for(int currentPrice = 0; currentPrice < items.length && items[currentPrice] != null; currentPrice++) {
			
			if(items[currentPrice].getPrice() < items[lowestPrice].getPrice()) {
				
				lowestPrice = currentPrice;
				
			}
			
		}
		
		return lowestPrice;
		
	}
	
	
}