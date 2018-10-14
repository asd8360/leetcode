package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class S017 {
	private static String[] map = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public List<String> letterCombinations(String digits) {
		//回溯输出
		if(digits.length() == 0) return Collections.emptyList();
        List<String> list = new ArrayList<>();
        combine(list, digits, "");
        return list;
    }

    private void combine(List<String> list, String digits, String s){
    	if(s.length() == digits.length()){
    		list.add(s);
    		return;
    	}
    	for(char c : map[digits.charAt(s.length())- '2'].toCharArray()){
    		combine(list, digits, s+c);
    	}
    }
    
	public static void main(String[] args) {
		S017 s = new S017();
		List list = s.letterCombinations("23");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}


/* S17 Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

2abc 3def 4ghi 5jkl 6mno 7pqrs 8tuv 9wxyz


Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.
*/