package leetcode;

public class S53 {
	public static void main(String[] args) {
		int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int maxSum = 0;
		for(int i=0; i<nums.length; i++) {
			if((sum+=nums[i]) <= 0)  sum=0;
			if(sum > maxSum) maxSum = sum;
		}
		
		if(maxSum == 0) {
			int max = nums[0];
			for(int i=1; i<nums.length; i++) {
				if(nums[i] > max) max = nums[i];
			}
			maxSum = max;
		}
		return maxSum;
	}
}

/*
 * S53 Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

//分治法， 动态规划法

 */