package leetcode;

public class S005 {
	public static String longestPalindrome(String s) {
		//回文串
			if(s.length()==0||s.length()==1) return s;
				int ansi=0, ansj=0;
				int maxlength=0;
				for(int i=0; i<s.length(); i++){
					for(int j=i+1; j<s.length(); j++){
						if(isHuiwenchuan(s, i, j)){
							int length = j-i+1;
							if(length>maxlength){
								maxlength = length;
								ansi=i;
								ansj=j;
							}
						}
					}
				}
				if(ansj==s.length()) return s.substring(ansi);
				return s.substring(ansi, ansj+1);
    }
	private static boolean isHuiwenchuan(String s,int i, int j){
    	if(i==j) return true;
    	else if(i+1 ==j) return s.charAt(i) == s.charAt(j);
    	else return isHuiwenchuan(s, i+1, j-1) && s.charAt(i) == s.charAt(j);
    }
    public static void main(String[] args) {
    	String s = "esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq";
    	System.out.println(longestPalindrome(s));
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