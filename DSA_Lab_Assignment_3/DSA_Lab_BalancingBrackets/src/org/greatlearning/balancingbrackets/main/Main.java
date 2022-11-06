package org.greatlearning.balancingbrackets.main;

import org.greatlearning.balancingbrackets.BalanceBrackets;

public class Main {
	public static void main(String s[]) {
		String expression1 = "([[{}]])";
		boolean result = BalanceBrackets.isStringBalanced(expression1);
		if (result) {
			System.out.println("The Entered String has Balanced Brackets");
		} else {
			System.out.println("The Entered String do not contain Balanced Brackets");
		}
	}
}
