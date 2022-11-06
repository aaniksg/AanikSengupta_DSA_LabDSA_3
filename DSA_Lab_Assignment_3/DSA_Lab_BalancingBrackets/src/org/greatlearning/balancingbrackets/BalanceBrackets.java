package org.greatlearning.balancingbrackets;

import java.util.Stack;

public class BalanceBrackets {
	public static boolean isStringBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char c;
			switch (ch) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;
			}

		}
		return (stack.isEmpty());
	}
}