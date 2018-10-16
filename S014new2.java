package leetcode;

public class S014new2 {
	public static void main(String[] args) {
		String[] strs =new String[] {"123", "1234", "12345"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length ==0) return "";
		if(strs.length == 1) return strs[0];
		int minLen = Integer.MAX_VALUE;
		for(String st :strs) 
			minLen = Math.min(minLen, st.length());
		for(int i=0; i<minLen; i++){
			for(int j=1; j<strs.length; j++){
				if(strs[0].charAt(i) != strs[j].charAt(i)) return strs[0].substring(0, i);
			}
		}
		//输出最短的

		return strs[0].substring(0, minLen);

		

	}
}

/* S14 Longest Common Prefix


Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.



*/