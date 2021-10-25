package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorting {

	public static void main(String[] args) {
		
		List<String> s = new ArrayList<>();
		s.add("aAaA");
		s.add("AaA");
		s.add("aAa");
		s.add("aaA");
		s.add("AAaa");
		s.add("AAA");
		
		Collections.sort(s);
		s.forEach(System.out::println);
	}
}
