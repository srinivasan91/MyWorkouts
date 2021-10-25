package com.interview.questions;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Integer.parseInt("1.0");
		} catch(Exception e) {
			System.out.println("ex : " + e);
		} catch(RuntimeException e1) {
			System.out.println(e1);
		}
	}
}
