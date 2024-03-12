	package linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	
	//private - Sichtbarkeitsbereich auf Klassen beschränkt
	//static - von der Klasse abhängig und nicht vum Objekt
	//final - Variable nach Initialisierung unveränderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//initialisierung Laufvariable (iterator)
		//Abbruchbedingung hasNext
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingedient = iterator.next();
			//macher - wird verwendet, um ingredient in unserem Muster zu finden
			//machers() - für den direckten Vergleich 
			if(vegetables.matcher(ingedient).matches()) {
				iterator.add("Käse");
				
			}
			
		}
	}

	public static void main(String[] args) {
		
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi","Paprika","Tomate","Pfeffer","Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
  
	}

}
