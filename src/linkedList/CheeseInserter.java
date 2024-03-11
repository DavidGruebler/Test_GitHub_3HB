package linkedList;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?1Tomaten?"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//initialisierung Laufvariable (iterator)
		//Abbruchbedingung hasNext
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingedient = iterator.next();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
