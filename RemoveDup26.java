package leetcode;

import java.util.Arrays;

public class RemoveDup26 {
	public static void main(String[] args) {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
//	public static int removeDuplicates(int[] nums) {
//		if(nums.length == 0)
//			return 0;
//		int len = nums.length;
//		int current = nums[0];
//		for(int i = 1; i < len ; ) {
//			
//			if(nums[i] == current) {
//				
//				for(int j = i; j < nums.length-1; j++) {
//					nums[j] = nums[j+1];
//				}
//				
//				len--;
//				
//			}
//			else {
//				current = nums[i];
//				i++;
//			}
//		}
//		
//		
//		return len;
//	}
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for(int j = 0; j< nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
			
		}
		return i+1;
	}
}
