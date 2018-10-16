package leetcode;

public class S009 {
	// public boolean isPalindrome(int x) {
	// 	if(x<0) return false;
	// 	if(x<10) return true;
	// 	int[] nums=new int[32];
	// 	int i=0;
	// 	while(x!=0){
	// 		nums[i] = x%10;
	// 		x /= 10;
	// 		i++;
	// 	}
	// 	i--;
	// 	for(int j=0; j<(i+1)/2; j++){
	// 		if(nums[j] != nums[i-j]) return false;
	// 	}
	// 	return true;

	// }
	
	public static boolean isPalindrome(int x){
		if(x<0) return false;
		int reversed=0, origin =x;
		while(x!=0){
			reversed = reversed *10 + x%10;
			x/=10;
		}
		if(reversed == origin) return true;
		return false;
	}
	public static void main(String[] args) {
		int x = 1233421;
		System.out.println(isPalindrome(x));
	}
}

/* S009 Palindrome Number
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/