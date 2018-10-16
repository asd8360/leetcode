package leetcode;

import java.util.Stack;

public class S020 {
	public static void main(String[] args) {
		String s = "{}{}()[])";
		System.out.println(isValid(s));
	}
//	public static boolean isValid(String s) {
//		if(s.length()==0) return true;
//		Stack<Character> stack = new Stack<>();
//		for(int i=0; i<s.length(); i++){
//			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
//				stack.push(s.charAt(i));
//			}
//			if(s.charAt(i)==']'){
//				if(stack.isEmpty() || stack.peek()!= '[') return false;
//				else stack.pop();
//			}
//			if(s.charAt(i)=='}'){
//				if(stack.isEmpty() || stack.peek()!= '{') return false;
//				else stack.pop();
//			}
//			if(s.charAt(i)==')'){
//				if(stack.isEmpty() || stack.peek()!= '(') return false;
//				else stack.pop();
//			}
//		}
//		if(!stack.isEmpty()) return false;
//		return true;
//	}
	public static boolean isValid(String s) {
		if(s.length()==0) return true;
		Stack<Character> stack = new Stack<>();
		for(char c: s.toCharArray()) {
			if(c=='(') stack.push(')');
			else if(c=='[') stack.push(']');
			else if(c=='{') stack.push('}');
			else {
				if(c != stack.pop() || stack.isEmpty()) return false;
			}
		}
		return stack.isEmpty();
	}
}

/* S020 Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/