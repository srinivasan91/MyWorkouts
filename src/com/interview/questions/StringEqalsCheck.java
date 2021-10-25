package com.interview.questions;

public class StringEqalsCheck {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
	}

}
