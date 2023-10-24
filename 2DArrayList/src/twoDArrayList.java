import java.util.*;

public class twoDArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donut");

		ArrayList<String> produceList = new ArrayList();
		produceList.add("oranges");
		produceList.add("apples");
		produceList.add("Mangos");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("coke");
		drinkList.add("pepsi");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);

		System.out.println(groceryList.get(0).get(0));
	}
}
