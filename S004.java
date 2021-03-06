package leetcode;

public class S004 {
	
	public static void main(String[] args) {
		int[] nums1=new int[]{1};
		int[] nums2=new int[]{3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
		int length = num1.length + nums2.length;
		if(length % 2 != 0) return findminK(nums1, 0, nums2, 0, length/2+1);
		else return findminK((nums1, 0, nums2, 0, length/2) + findminK(nums1, 0, nums2, 0, length/2+1)) / 2.0;
	}
	public static double findminK(int[] nums1, int left, int[] nums2, int right, int k){
		//递归跳出条件：其中一个数组为空，返回另一数组后k个数；k为1， 找到两数组开头较小的数
		if(left >= nums1.length) return nums2[right+k-1];
		if(right >= nums2.length) return nums1[left+k-1];
		if(k==1) return Math.min(nums1[left], nums[right]);

		int leftmid = Integer.MAX_VALUE, rightmid = Integer.MAX_VALUE;
		if(left+k/2-1 < nums1.length) leftmid = nums1[left+k/2-1];
		//若没有越界，则选出leftmid去比大小
		if(right+k/2-1 < nums2.length) rightmid = nums2[right+k/2-1];
		//若没有越界，则选出rightmid去比大小
		if(leftmid < rightmid) return findminK(nums1, left+k/2, nums2, right, k-k/2);
		//leftmid 比不过 rightmid ，或right越界 说明nums1前leftmid被淘汰
		else return findminK(nums1, left, nums2, right+k/2, k-k/2);
	}
}

/*S004 Median of Two Sorted Arrays

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/