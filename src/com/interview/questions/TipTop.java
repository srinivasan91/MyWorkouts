package com.interview.questions;

public class TipTop {

	static final Integer i1=1;
	final Integer i2=2;
	Integer i3=3;
	
	public static void main(String[] args) {
		final Integer i4=4;
		Integer i5=5;
		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
		System.out.println(i4);
//		TipTop tip = new TipTop();
//		TipTop.inner in = tip.new inner();
		
		class inner{
			final Integer i6 =6;
			Integer i7=7;
			inner(){
				System.out.println(i6 + i7);
			}
		}
	}
	
}
