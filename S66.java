package leetcode;

import java.util.Arrays;

public class S66 {
	public static void main(String[] args) {
		int[] digits = new int[] {9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	public static int[] plusOne(int[] digits) {
		if(digits[0] == 0) {
			digits[0] += 1;
			return digits;
		}
        for(int i=digits.length-1; i>=0; i--) {
        	if(digits[i] != 9) {
        		digits[i] += 1;
        		return digits;
        	}
        	else {
        		digits[i] = 0;
        	}
        }
        //类似999这种怎么办？
        
        if(digits[0] == 0) {
        	int[] digits2 = new int[digits.length+1];
//        	for(int i=0; i<digits.length; i++) {
//        		digits2[i+1] = digits[i];
//        	}
        	//java默认初始值都为0
        	digits2[0] = 1;
        	return digits2;
        }
        
		
		return digits;
    }
}

/* S66 Plus One

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/