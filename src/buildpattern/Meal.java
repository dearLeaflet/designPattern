package buildpattern;

import java.util.ArrayList;

public class Meal {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void showItems() {
		for (Item item:items) {
			System.out.printf("Item : %s, packing : %s, price :%.2f", item.name(), item.packing().packing(), item.price());
			System.out.println();
		}
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
		
	}
}
