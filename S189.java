package leetcode;

import java.util.Arrays;

public class S189 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2};
		rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}
	
	
	//extra place O(N)
//	public static void rotate(int[] nums, int k) {
//		if(k==0) return;
//		int[] nums2 = new int[nums.length];
//		for(int i=0; i<nums.length; i++) {
//			k %= nums.length;
//			nums2[i] = nums[(i-k+nums.length)%nums.length];
//		}
//		for(int i=0; i<nums.length; i++)
//			nums[i] = nums2[i];
//		return;
//    }
	
	
	//extra place O(1)
	public static void rotate(int[] nums, int k) {
		
	}
}

/*

189. Rotate Array

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?

*/