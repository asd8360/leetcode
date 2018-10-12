package leetcode;


class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0, j = 0;
        outside:
        for(i = 0;i<nums.length-1;i++){
            for(j = i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) break outside;
            }
        }
    	int[] ans = {nums[i], nums[j]};
        return ans;
    }
    
    public static void main(String[] args) {
		int[] a = {2, 7, 11, 15};
		
		TwoSum1 test = new TwoSum1();
		int[] b = test.twoSum(a, 26);
//		System.out.println(b.toString());
		System.out.println(b[0]);
		System.out.println(b[1]);
//		System.out.println(b[2]);
	}
}