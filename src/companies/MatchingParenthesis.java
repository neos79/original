package companies;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author naveen.singh
 *
 * 
 */
public class MatchingParenthesis {

	public static void main(String[] args) {
		System.out.println(CheckParentesis("{{()}[]{}}"));
		System.out.println(isValid("{{()}[]{}}"));
	}
	
	public static boolean CheckParentesis(String str){
	    if (str.isEmpty())
	        return true;
	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++){
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '['){
	            stack.push(current);
	        }
	        if (current == '}' || current == ')' || current == ']'){
	            if (stack.isEmpty())
	                return false;
	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                stack.pop();
	            else 
	                return false;
	        }
	    }
	    return stack.isEmpty();
	}
	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
}
