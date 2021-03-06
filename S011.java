package leetcode;

public class S011 {
	public static int maxArea(int[] height) {
        int left =0, right = height.length-1;
        int maxSize=0;
        while(left<right){
        	int curSize = (right-left) * Math.min(height[left], height[right]);
        	if(curSize>maxSize) maxSize=curSize;
        	if(height[left]<height[right]) left++;
        	else right--;
        }
        return maxSize;    
    }
    public static void main(String[] args) {
    	int[] height = new int[] {1,8,6,2,5,4,8,3,7};
    	System.out.println(maxArea(height));
    }
}

//双指针向中间夹 

/* S011 Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
  Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 



The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.

 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
*/