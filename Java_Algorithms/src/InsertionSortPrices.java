//class related to the Item class

public class InsertionSortPrices {
	
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
		
		sortItemsAscedingOrder(items);//Insertion sort
		
		for(Item item : items) {
			
			if(item != null) {
			
				System.out.println(item.getName() + " -------- " + item.getPrice());
			
			}
			
		}
		
	}
	
private static void sortItemsAscedingOrder(Item[] items) {
		
	for(int currentPrice = 1; currentPrice < items.length && items[currentPrice] != null; currentPrice++) {
		
		int analysis = currentPrice;
		
		while(analysis > 0 && items[analysis].getPrice() < items[analysis - 1].getPrice()) {
		
			Item currentItem = items[analysis];
			Item lowerPriceItem = items[analysis - 1];
			items[analysis] = lowerPriceItem;
			items[analysis - 1] = currentItem;
			
			analysis--;
			
		}
	
		
	}
		
}

}
