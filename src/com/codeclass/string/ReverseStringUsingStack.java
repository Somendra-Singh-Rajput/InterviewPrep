package com.codeclass.string;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		String s = "Somendra";
		char[] c = new char[s.length()];
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		
		int i=0;
		
		while(!stack.isEmpty()) {
			
			c[i++] = stack.pop();
		}

		
		for(char ch : c) {
			System.out.print(ch);
		}
	}

}
