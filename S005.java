package leetcode;

public class S005 {
	// public static String longestPalindrome(String s) {
	// 	//回文串
	// 	if(s.length()==0||s.length()==1) return s;
	// 		int ansi=0, ansj=0;
	// 		int maxlength=0;
	// 		for(int i=0; i<s.length(); i++){
	// 			for(int j=i+1; j<s.length(); j++){
	// 				if(isHuiwenchuan(s, i, j)){
	// 					int length = j-i+1;
	// 					if(length>maxlength){
	// 						maxlength = length;
	// 						ansi=i;
	// 						ansj=j;
	// 					}
	// 				}
	// 			}
	// 		}
	// 	if(ansj==s.length()) return s.substring(ansi);
	// 	return s.substring(ansi, ansj+1);
 //    }
	// private static boolean isHuiwenchuan(String s,int i, int j){
 //    	if(i==j) return true;
 //    	else if(i+1 ==j) return s.charAt(i) == s.charAt(j);
 //    	else return isHuiwenchuan(s, i+1, j-1) && s.charAt(i) == s.charAt(j);
 //    }
    public static void main(String[] args) {
    	String s = "ab";
    	System.out.println(longestPalindrome(s));
    }

    // public static String longestPalindrome(String s) {
    // 	if(s.length() <2) return s;
    // 	int maxlen = 0;
    // 	int maxleft =-1, maxright = -1;
    // 	for(int i=0; i<s.length()-1; i++){
    // 		for(int j=i+1; j<s.length(); j++){
    // 			if(isReverse(s,i,j)){
    // 				if(j-i+1>maxlen){
    // 					maxlen=j-i+1;
    // 					maxleft=i;
    // 					maxright=j;
    // 				}
    // 			}
    // 		}
    // 	}
    // 	if(maxright==s.length()) return s.substring(maxleft);
    // 	else return s.substring(maxleft, maxright+1);

    // }

    // public static boolean isReverse(String s, int left, int right){
    // 	//判断i-j是不是回文串
    // 	if(left==right) return true;
    // 	else if(left+1==right) return s.charAt(left)==s.charAt(right);
    // 	else return s.charAt(left)==s.charAt(right) && isReverse(s, left+1, right-1);
    // }
    public static String findReverse(String s, int left, int right){ //从left，right起向两侧寻找最长回文
    	int l=left, r=right;
    	while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
    		l--;
    		r++;
    	}
    	//此时l-r不是回文，l+1~r-1最长回文
    	return s.substring(l+1, r);
    }
    public static String longestPalindrome(String s){
    	if(s.length() < 2) return s;
    	int maxlen= 0;
    	String ans = "";
    	for(int i=0; i<s.length(); i++){
    		String candidate = findReverse(s, i, i);
    		if(candidate.length()>maxlen){
    			maxlen=candidate.length();
    			ans=candidate;
    		}
    		candidate = findReverse(s, i, i+1);
    		if(candidate.length()>maxlen){
    			maxlen=candidate.length();
    			ans=candidate;
    		}
    	}
    	return ans;
    }

}

/* S005 Longest Palindromic Substring

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

最长回文串
Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/