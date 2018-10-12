package leetcode;

import java.util.Stack;

public class S20 {
	public static void main(String[] args) {
		String s = "】";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length; i++) {
        	if(str[i] == '(' |str[i] == '[' | str[i] == '{') {
        		stack.push(str[i]);
        	}
        	else if(str[i]==')') {
        		if( stack.isEmpty()||stack.peek()!='(' ) return false;
        		stack.pop();
        	}
        	else if(str[i]==']') {
        		if(stack.isEmpty()||stack.peek()!='['  ) return false;
        		stack.pop();
        	}
        	else if(str[i]=='}') {
        		if(stack.isEmpty()||stack.peek()!='{'  ) return false;
        		stack.pop();
        	}
        	else return false;
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}	

/* S20  Valid Parentheses
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

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
