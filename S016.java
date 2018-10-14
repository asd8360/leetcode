package leetcode;

public class S016 {
	public static void main(String[] args) {
		
	}
	
	public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return -1;
        Arrays.sort(nums);
        int diffmin = Integer.MAX_VALUE;
        int ans=0;
        for (int i=0; i<nums.length -2; i++) {
        	int left = i+1, right = nums.length-1;
        	while(left < right){
        		int sum = nums[i] + nums[left] +nums[right];
        		if(sum == target) return target;
        		else if(sum < target){
        			int diff = target - sum;
        			if(diff < diffmin) {
                        diffmin = diff;
                        ans = sum;
                    }
        			left++;
        		}else{
        			int diff = sum - target;
        			if(diff < diffmin) {
                        diffmin = diff;
                        ans = sum;
                    }
        			right--;
        		}
        	}
        }
        return ans;
    }
}


/* S16 3Sum Closest

Given an array nums of n integers and an integer target, 
find three integers in nums such that the sum is closest to target. 
Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

*/