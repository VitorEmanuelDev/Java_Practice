
public class LowestAndHighestPrice {

	public static void main(String[] args){
		
		Item items[] = {
				new Item("Book", 150),
				new Item("Backpack", 175),
				new Item("Laptop", 2500),
				new Item("Pencil case", 40),
				new Item("Notebook", 30),
				null,//nullPointerexception test
				null,
				null
		};
		
		int lowestPrice = lookForCheapest(items);
		int highestPrice = LookForMostExpensive(items);
		
		System.out.println("The " + items[highestPrice].getName() + " is the most expensive item and costs: " + items[highestPrice].getPrice());
		
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
	
	
	private static int LookForMostExpensive(Item[] items) {
		
		int highestPrice = 0;
		
		for(int currentPrice = 0; currentPrice < items.length && items[currentPrice] != null; currentPrice++) {
			
			if(items[currentPrice].getPrice() > items[highestPrice].getPrice()) {
				
				highestPrice = currentPrice;
				
			}
			
		}
		
		return highestPrice;
		
	}
	
}