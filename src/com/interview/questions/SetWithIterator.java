package com.interview.questions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetWithIterator {

	public static void main(String[] args) {
		before();
	}

	private static void before() {
		Set set = new TreeSet();
		set.add("2");
		set.add("3");
		set.add("1");
		
		set.forEach(System.out::println);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}
}
