package leetcode;

import java.awt.List;
import java.util.ArrayList;

public class S118 {
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for(int i=0; i<numRows; i++) {
        	row = new ArrayList<Integer>();
        	for(int j=0; j<i+1; j++) {
        		if(j == 0 | j == i)
        			row.add(1);
        		else 
        			row.add(pre.get(j-1) +pre.get(j));
        		pre = row;
        		res.add(row);
        	}
        }
        
        return res;
    }
}

/* s118

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/