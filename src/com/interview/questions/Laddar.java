package com.interview.questions;

public class Laddar {

	public static void main(String[] args) {
		try {
			System.out.println(doStuff(args));
		} catch(Exception e) {
			System.out.println("test : " + doStuff(args));
			doStuff(args);
		}
	}

	private static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}
}
