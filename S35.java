package leetcode;

public class S35 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,3,5,6};
		System.out.println(searchInsert(nums, 2));
	}
	
	public static int searchInsert(int[] nums, int target) {
        int position = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] >= target) {
        		position = i;
        		break;
        	}
        }
        if(nums[nums.length-1] < target)
        	position = nums.length;
        
        return position;
    }
}

/*
 * 35 Search Insert Position

 * 
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */
