package leetcode;

import java.lang.StringBuffer;

public class S014{
	public static void main(String args[]){
		String[] str = new String[]{"flower", "flow", "fl", "flwew"};
		System.out.println(longestCommonPrefix(str));
	}
	public static String longestCommonPrefix(String[] strs){
		StringBuffer ans = new StringBuffer(strs[0]);
//		String cur = strs[0];
		for(int i = 1; i < strs.length; i++){
			int shortLength = Math.min(ans.length(), strs[i].length());
			for(int j = 0; j < shortLength; j++){
				if(ans.charAt(j) == strs[i].charAt(j)){
					ans.append(ans.charAt(j));
				}
				else {
					ans = new StringBuffer(ans.substring(0, j-1));
				}
			}
		}
		return ans.toString();
	}
}