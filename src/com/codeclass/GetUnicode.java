package com.codeclass;

public class GetUnicode {

	public static void main(String[] args) {


		String s = "Somendra@";
		int unicode = s.codePointAt(8);
	
		System.out.println(unicode);

	}

}
