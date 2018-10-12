package leetcode;

public class S14new {
	public static void main(String[] args) {
		String[] strs = new String[] {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		int shortestLength = Integer.MAX_VALUE;
		String ans = "";
		for(int i=0; i<strs.length; i++) {
			if(strs[i].length() < shortestLength) shortestLength = strs[i].length();
		}
		out:for(int i=0; i<shortestLength; i++) {
			for(int j=0; j<strs.length-1; j++) {
				if(strs[j].charAt(i) != strs[j+1].charAt(i)) break out;
			}
			ans = ans + strs[0].charAt(i);
		}
		return ans;
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