package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class S015 {
	public static void main(String[] args) {
		int [] nums = new int[] {-1, 0, 1, 2, -1, -4};
		List list = threeSum(nums);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //考虑多种特殊情况：长度小于3返回空；最大数小于0返回空；遍历过程中，最小数大于0结束遍历
        if(nums.length < 3) return list;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        if(max<0) return list;
        for(int i=0; i<nums.length-2;) {
        	if(nums[i] >0) return list;
        	if(nums[i] + 2 * nums[nums.length-1] < 0) { // 这个数没戏,去掉相同数，找更大的为起点
        		while(nums[i] == nums[++i] && i<nums.length-2);
        		continue;
        	}
        	int left = i+1, right = nums.length-1;
        	while(left < right) {
	        	int sum = nums[i] + nums[left] + nums[right];
	        	if(sum == 0) {
	        		list.add(Arrays.asList(nums[i], nums[left], nums[right]));
	        		while(nums[left] == nums[++left] && left <right);
	        		while(nums[right] == nums[--right] && left < right);
	        		//防止重复的连续数
	        	}else if(sum<0) left++;
	        	else right--;
        	}
        	while(nums[i] == nums[++i] && i < nums.length-2);
        }
        return list;
    }

}


/* S15 3sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/