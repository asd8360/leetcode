package leetcode;

import java.util.Arrays;

public class S169 {
	public static void main(String[] args) {
		int [] nums = new int[] {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
	//O(n*logn)
//	public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
	
	//better way O(n)
	public static int majorityElement(int[] nums) {
		int ans = nums[0];
		int count = 1;
		for(int i=1; i<nums.length; i++) {
			if(count ==0) {
				count = 1;
				ans = nums[i];
			}else if(nums[i] == ans)
				count++;
			else { //nums[i] != ans
				count--;
			}
		}
		return ans;
	}
}

/* S169 Majority Element
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

*/
