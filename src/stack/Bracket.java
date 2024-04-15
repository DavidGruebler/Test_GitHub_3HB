package stack;

	import java.util.Stack;

public class Bracket {

		public static boolean checkBrackets(String input) {
			
			Stack<Character> Stack = new Stack<>();
			 
	        for (char c : input.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	            	Stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (Stack.isEmpty()) {
	                	return false;
	                }
	 
	                char letzterÖffner = Stack.pop();
	 
	                if (letzterÖffner == '(' && c != ')') {
	                	return false;
	                } else if (letzterÖffner == '{' && c != '}') {
	                	return false;
	                } else if (letzterÖffner == '[' && c != ']') {
	                	return false;
	                }
	            }
	        }
	 
	        return Stack.isEmpty();
	    }

		public static void main(String[] args) {
			
		String ausdruck1 = "(a + b) * (c - d)";
			
		if(checkBrackets(ausdruck1) == true) {
			System.out.println("Korrekte Klammerung");
		} else {
			System.out.println("Fehlerhafte Klammerung");
		}
		}
}		

