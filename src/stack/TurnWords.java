package stack;
 
import java.util.LinkedList;
 
public class TurnWords {
	
	public static String reverseString(String input) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
			
			for(char c : input.toCharArray()) {
				stack.push(c);
			}
		
			StringBuilder reversedString = new StringBuilder();
			
			while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }
			return reversedString.toString();	 
    }
	
	public static void main(String[] args) {
		
		System.out.println("reittier");
		System.out.println(reverseString("reittier  "));
        
    }
}