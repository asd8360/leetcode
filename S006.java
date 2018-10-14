package leetcode;

public class S006 {
    public static String convert(String s, int numRows) {
        if(s.length()<2 || numRows==1) return s; 
    	int cycle = numRows * 2 - 2;
    	String ans = "";
    	for(int i=0; i<s.length(); i+=cycle)
    		ans = ans + s.charAt(i);
    		//第一行： 第0个， 第2n-2个……
    	for(int i=1; i<numRows-1; i++){
    		int step = 2*i;
    		//2~n-1行: 间断计算 先差距cycle-2i 再差距2i往复。
    		for(int j=i; j<s.length(); ){
    			ans = ans + s.charAt(j);
    			step = cycle - step;
    			j+=step;
    		}
    	}
    	for(int i= numRows-1; i<s.length(); i+=cycle)
    		ans+=s.charAt(i);

    	return ans;
    }
	
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 4));
	}
}

/* S06 ZigZag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/