package StackPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reverse the given sentence 
		
		// Marry had a little lamb. Its fleece was white as Snow. 
		
		Stack<String> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentece: ");
		
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		int i = 0;
		do {
			for( ; i < words.length;) {
				String temp = words[i];
				i++;
				if(temp.endsWith(".")) {
					temp = temp.substring(0, temp.length()-1);
					char[] ca = temp.toCharArray();
					ca[0] = Character.toUpperCase(ca[0]);
					
					String temp2 = new String(ca);
					stack.push(temp2);
					break;
				}
				else {
					stack.push(temp);
				}
		}
		while(!stack.isEmpty()) {
			if(stack.size() == 1) {
				System.out.print(stack.pop()+". ");
			}
			else {
				System.out.print(stack.pop()+" ");
			}
		}
		}while(i < words.length);
		
		
	}

}
