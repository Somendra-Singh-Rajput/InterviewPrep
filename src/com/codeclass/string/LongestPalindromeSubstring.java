package com.codeclass.string;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		
		String s = "abcdc";
		
		if(s != null) {
			
			String longest = ""; //s.substring(0,1);
			//System.out.println(longest);
			
			for(int i=0;i<s.length()-1;i++) {
				
				String p = findPalindromeString(s,i,i);
				
				if(p.length() > longest.length()) {
					longest = p;
				}
				
				p = findPalindromeString(s, i, i+1);
				
				if(p.length() > longest.length()) {
					longest = p;
				}
			}
			
			System.out.println(longest);
			
		}

	}
	
	
	public static String findPalindromeString(String s,int start,int end) {
		
		if(s.length() <= 1) return s;
		
		while( start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			
			start--;
			end++;
		}
		
		return s.substring(start + 1, end);
	}

}
