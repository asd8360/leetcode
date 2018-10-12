package leetcode;

import java.util.Arrays;

public class S88 {
	public static void main(String[] args) {
		int[] nums1 = new int[] {-12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				
		int[] nums2 = new int[] {-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,-33,-33,-32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-11,-7,-6,-5,-4,-4,-3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,19,20,20,20,21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,42,45,46,46,46,47,48};
				
		merge(nums1, 1, nums2, 90);
		System.out.println(Arrays.toString(nums1));
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int count0 = 0;
        nums2:for(int i=0; i<n; i++) { //nums2遍历
        	if(nums2[i] == 0)
        		count0++;
        	for(int j=0; j<(m+n); j++) { //nums1遍历
        		if(nums2[i] <= nums1[j]) { //符合插入条件
        			int k= m+n-1;
        			while(k>j) {
        				nums1[k] = nums1[k-1];
        				k--;
        			}
        			nums1[j] = nums2[i];
        			continue nums2;
        		}
        	}
        	int k = 0;//记录nums1结束的位置
        	for(int j=0; j<(m+n); j++) {
        		if(nums1[j] != 0) {
        			k = j;
        		}//k 指向最后一个不是0 的元素
        	}
        	if(k==0) nums1[k+count0] = nums2[i];//nums1全0怎么办
        	else nums1[k+1count0] = nums2[i];
        }
        return;
    }
}

/* S88 Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

*/
