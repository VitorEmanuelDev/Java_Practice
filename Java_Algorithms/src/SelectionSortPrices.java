//class related to the Item class

public class SelectionSortPrices {
	
	int start = 0;
	
	public static void main(String[] args) {
				
		Item items[] = {
				new Item("Book", 150),
				new Item("Backpack", 175),
				new Item("Laptop", 2530),
				new Item("Pencil Case", 35),
				new Item("Notebook", 25),
				new Item("Tablet", 1300),
				null,//test
				null
		};
		
		sortItemsAscedingOrder(items);
		
		for(Item item : items) {
			
			if(item != null) {
			
				System.out.println(item.getName() + " -------- " + item.getPrice());
			
			}
			
		}
		
	}
	
private static void sortItemsAscedingOrder(Item[] items) {
		
	for(int currentPrice = 0; currentPrice < items.length && items[currentPrice] != null; currentPrice++) {
		
		int lowestPrice = lookForCheapest(items, currentPrice);
		Item currentItem = items[currentPrice];
		Item lowerPriceItem = items[lowestPrice];
		items[currentPrice] = lowerPriceItem;
		items[lowestPrice] = currentItem;
		
	}
		
}

private static int lookForCheapest(Item[] items, int start) {
	
		int lowestPrice = start;
		
		for(int currentPrice = lowestPrice; currentPrice < items.length && items[currentPrice] != null; currentPrice++) {
			
			if(items[currentPrice].getPrice() < items[lowestPrice].getPrice()) {
				
				lowestPrice = currentPrice;
				
			}
			
		}
		
		return lowestPrice;
	}

}
