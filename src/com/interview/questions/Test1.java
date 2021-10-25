package com.interview.questions;

public class Test1 {

	public static void main(String[] args) {
		try {
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			System.out.println("Byte val : " + b);
			double d = f1.doubleValue();
			System.out.println(x + b + d);
		} catch (NumberFormatException e) {
			System.out.println("bad number");
		}
	}
}
