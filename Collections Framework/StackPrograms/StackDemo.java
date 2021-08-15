package StackPrograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an object of Stack
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Kunal Shah");
		stack.push("Satya Nadela");
		stack.push("Sundar Pichai");
		stack.push("Elon Musk");
		stack.push("Vijay Shekhar");
		stack.push("Ratan Tata");
		
		System.out.println("Element at the top is: "+stack.peek());
		
		System.out.println("Element removed from the top: "+stack.pop());
		
		System.out.println("Size of the current stack is: "+stack.size());
		
		System.out.println("Elon Musk exists:  "+stack.search("Elon Musk"));
		
	}

}
