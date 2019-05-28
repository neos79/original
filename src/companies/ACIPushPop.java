package companies;

import java.util.Stack;

/**
 * @author naveen.singh
 *
 * 
 */
public class ACIPushPop {

	public static void main(String[] args) {
		String str="10 DUP 13 + 5 POP 12 - ";
		System.out.println(pushpop(str));
	}
	public static Long pushpop(String input){
		
		String[] str1=input.split(" ");
		Stack<Long> stack=new Stack<Long>();
		for(String s:str1){
			if(s.equals("DUP")){
				Long dup=stack.peek();
				stack.push(dup);
			}else if(s.equals("+")){
				Long add1=Long.valueOf(stack.pop());
				Long add2=Long.valueOf(stack.pop());
				stack.push(add1+add2);
				
			}else if(s.equals("-")){
				Long add1=Long.valueOf(stack.pop());
				Long add2=Long.valueOf(stack.pop());
			    stack.push(add1-add2);
				
			}else if(s.equals("POP")){
				stack.pop();
			}
			else {
				stack.push(Long.valueOf(s));
			}
			System.out.println(stack);
		}
		return stack.peek();
	}

}
