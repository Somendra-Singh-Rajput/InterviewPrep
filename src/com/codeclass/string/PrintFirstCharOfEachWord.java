package com.codeclass.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstCharOfEachWord {

	public static void main(String[] args) {
		
		String s = "Somendra Singh Rajput";
				
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		Matcher m =p.matcher(s);
		
		while(m.find()) {
			
			System.out.print(m.group());
		}
	}
}
