package leetcode;

public class S003 {
	public static void main(String[] args) {
		String string = "asdfghjkl";
		System.out.println(lengthOfLongestSubstring(string));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s.length()==0 || s.length()==1) return s.length();
		char[] str = s.toCharArray();
		int firstNew = 0, maxlen = 0;
		for(int i=1; i<s.length(); i++){
		    for(int j=i-1; j>=firstNew; j--){
		        if(str[i] == str[j]){
		            firstNew = j+1;
		            break;
		        }
		    }
		    maxlen = Math.max(maxlen, i-firstNew+1);
		}
		return maxlen;
	}
}

/* S003 Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/