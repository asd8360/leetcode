package leetcode;

import java.util.Arrays;
import java.util.*;

public class S001 {
	// public static int[] TwoSum(int[] nums, int target){
	// 	if(nums.length <2) return new int[] {-1, -1};
	// 	for(int i=0; i<nums.length-1;i++){
	// 		for(int j=0; j<nums.length; j++){
	// 			if(nums[i]+nums[j] == target) return new int[]{i, j};
	// 		}
	// 	}
	// 	return new int[]{-1, -1};
	// }

	public static int[] TwoSum(int[] nums, int target){
		if(nums.length < 2) return new int[]{-1, -1};
		Map<Integer, Integer> hashTable = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			if(hashTable.containsKey(target - nums[i])){
				int left = hashTable.get(target - nums[i]);
				return new int[]{left, i};
			}else{
				hashTable.put(nums[i], i);
			}
		}
		return new int[]{-1, -1};
	}
	 
	public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		System.out.println(Arrays.toString(TwoSum(nums, 9)));
	}
}

/* S001 Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/