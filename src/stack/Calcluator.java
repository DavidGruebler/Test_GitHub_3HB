
package stack;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calcluator {
	
	   public static int calcluateUPN(String input) {
		   LinkedList<Integer> stack = new LinkedList<>();
		   //operatorPattern: überprüft auf mathematische Rechenzeichen
		   Pattern operatorPattern = Pattern.compile("[+*-/]");
		   //numericPattern: \\d... Ziffer [0-9], + belibig viele Ziffern
		   Pattern numericPattern = Pattern.compile("\\d+");
		   
		   // \\s+ ... teilt den String auch nach mehreren Leerzeichen
		   for(String token : input.split("\\s+")) {
			   Matcher operatorMatcher = operatorPattern.matcher(token);
			   Matcher numericMatcher = numericPattern.matcher(token);
			   
			   if(numericMatcher.matches()) {
				   stack.push(Integer.parseInt(token));
			   } else if(operatorMatcher.matches()) {
				   int operant1 = stack.pop();
				   int operant2 = stack.pop();
				   int result = 0;
				   switch(token) {
				   		case "+": result = operant1 + operant2; break;
				   		case "-": result = operant2 - operant1; break;
				   		case "*": result = operant1 * operant2; break;
				   		case "/": result = operant2 / operant2; break;
				   		default: System.out.println("Falscher Operator");
				   }
				   stack.push(result);
			   }
		   }
		   return stack.pop();
	   }
	
	
	public static void main(String[] args) {
		String str = "5 3 +";
		System.out.println(calcluateUPN(str));
		
	}
    
}
