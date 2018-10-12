package leetcode;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int []nums = {1,2,6,7,8};
		int target = 13;
		int[] ans = twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] loc = new int[2];
		for(int i = 0; i < nums.length -1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					loc[0] = i;
					loc[1] = j;
				}
			}
		}
		return loc;
		
	}
}
