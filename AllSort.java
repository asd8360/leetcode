package leetcode;

import java.util.*;

public class AllSort {
	public static void main(String[] args) {
		List<List<Character>> list = allsort("abc");
		System.out.println(list);
	}
	
	public static List<List<Character>> allsort(String str){
		if(str.length()==0) return null;
		List<List<Character>> list = new ArrayList<>();
		char[] array = str.toCharArray();
		Arrays.sort(array);
		combine(list, str, "");
		return list;
	}
	public static void combine(List list, String str, String temp) {
		if(str.length() == str.length()) {
			list.add(temp);
			return;
		}
		for(char c: str.toCharArray()) {
			combine(list, str, temp+c);
		}
	}
}
