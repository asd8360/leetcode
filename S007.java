package leetcode;

public class S007 {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(1563847421));
	}
	public static int reverse(int x) {
		int signal = 1;
		int ans = 0;
		int reversed = 0;
		if(x<0){
			signal = -1;
			x = -x;
		}
		while(x!=0) {
			if((Integer.MAX_VALUE - x % 10)/10 < reversed) return 0;
			reversed = reversed * 10 + x % 10;
			x /= 10;
		}
		return reversed * signal;
	}
}
/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/