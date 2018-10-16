package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class S018 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) return Collections.emptyList();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3;){ //不要自增 最后检查重复会自增

        	if(nums[i] * 4 > target) return list;
        	if(nums[i] + 3*nums[nums.length-1] < target){
        		while(nums[i] == nums[++i] && i<nums.length-3);
        		continue;
        	}

        	inner:for(int j=i+1; j<nums.length-2;){//不要自增 最后检查重复会自增
        		
        		if(nums[j]*3 +nums[i] > target) break inner;
	        	if(nums[i] +nums[j] + 2*nums[nums.length-1] < target){
	        		while(nums[j] == nums[++j] && j<nums.length-2);
	        		continue inner;
	        	}
	        	int left = j+1, right = nums.length-1;
	        	while(left<right){
	        		int sum = nums[i]+nums[j]+nums[left]+nums[right];
	        		if(sum==target){
	        			list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
	        			while(nums[left]==nums[++left] && left<right);
	        			while(nums[right] == nums[--right] && left<right);
	        		}else if(sum<target) left++;
	        		else right--;
	        	}
	        	while(nums[j] == nums[++j] && j<nums.length-2);
        	}
        	while(nums[i] == nums[++i] && i<nums.length-3);
        }
        return list;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {-3,-2,-1,0,0,1,2,3};
		List list = fourSum(nums, 0);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
/* S18 4-Sum

Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/
