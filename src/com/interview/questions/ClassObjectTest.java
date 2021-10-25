package com.interview.questions;

public class ClassObjectTest {
	
	public static void main(String[] args) {
		OldType ot = new OldType();
		NewType nt = new NewType();
		
		ot = nt;
		ot = (OldType) nt;
		nt = ot;
		nt = (NewType) ot;
		
	}

}

class OldType{}
class NewType extends OldType{}
