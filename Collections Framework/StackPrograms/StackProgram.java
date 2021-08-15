package StackPrograms;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialization
		
		Stack<Integer> stack = new Stack<>();
		
		// add few elements --> push 
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(700);
		stack.push(500);
		
		System.out.println("elements inside stack are: "+stack);
		
		System.out.println("Element at the top is: "+stack.pop());
		
		System.out.println("updated stack is: "+stack);
		
		System.out.println("Element at the top: "+stack.peek());
		
		System.out.println("Is the stack empty? "+stack.empty());
		
		System.out.println("Search for the value: "+stack.search(200));
		
	
		
	}

}
