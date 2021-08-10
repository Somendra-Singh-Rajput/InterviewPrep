package com.codeclass.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {

	public static void main(String[] args) {
		
		String s = "Somendra";
		
		Character[] ch = new Character[s.length()];
		
		
		for(int i=0;i<s.length();i++) {
			
			ch[i] = s.charAt(i);
		}

		Arrays.sort(ch, new Comparator<Character>() {
			
			public int compare(Character ch1, Character ch2) {
				return Character.compare(Character.toLowerCase(ch1), Character.toLowerCase(ch2));
			}
		});
		
		for(Character c : ch) {
			System.out.print(c);
		}
	}

}
