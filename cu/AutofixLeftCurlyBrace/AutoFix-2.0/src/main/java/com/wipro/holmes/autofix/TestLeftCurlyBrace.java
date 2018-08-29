package com.wipro.holmes.autofix;

/**
 * Created by NA318604 .
 */

public class TestLeftCurlyBrace {

	//Test file to test Left Curly Brace  fix

	public void num1() {
		boolean a = false;
		if (a) {
			System.out.println("do nothing");
		}
		System.out.println("2nd method");
	}

	/*public void num2() {
		if (true) {
			System.out.println("do nothing");
		}
		System.out.println("2nd method");
	}

	public void num3() {
		System.out.println("3rd method");
	}*/
}
