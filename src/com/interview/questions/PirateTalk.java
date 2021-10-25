package com.interview.questions;

import java.util.Properties;

public class PirateTalk {

	public static void main(String... arrrrrg) {
		Properties p= System.getProperties();
		p.setProperty("pirate", "scurvy");
		String s = p.getProperty("argProp") + " ";
		s += p.getProperty("pirate");
		System.out.println(s);
				
	}
}
