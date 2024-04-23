package stack;

import java.util.LinkedList;

public class Bracket {

		public static boolean checkBrackets(String input) {
			
			LinkedList<Character> Stack = new LinkedList<>();
			 
	        for (char c : input.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	            	Stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (Stack.isEmpty()) {
	                	return false;
	                }
	 
	                char lastOpen = Stack.peek();
	 
	                if ((lastOpen == '(' && c != ')') ||
	                	(lastOpen == '{' && c != '}') ||
	                	(lastOpen == '[' && c != ']')) {
	                	return false;
	                }
	                Stack.pop();
	            }
	        }
	 
	        return Stack.isEmpty();
	    }

		public static void main(String[] args) {
			
		String ausdruck1 = "({})";
		String ausdruck2 = "moin";
			
		if(checkBrackets(ausdruck2) == true) {
			System.out.println("Korrekte Klammerung");
		} else {
			System.out.println("Fehlerhafte Klammerung");
		}
		}
}		

