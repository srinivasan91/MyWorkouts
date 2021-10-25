package com.interview.questions;

public class Test2 {

	static void test() throws Error{
		if(true)
			throw new AssertionError();
		
		System.out.println("Test ");
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println("ex");
		} 
//		catch(Error e1) {
//			System.out.println("got error : " +  e1);
//		}
		
		System.out.println("End");
	}
}
