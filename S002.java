package leetcode;

import java.awt.List;

public class S002 {
	public static void main(String[] args) {
	
	}
	
	/*
	 * * Definition for singly-linked list.*/
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans = new ListNode(0);
//        ListNode n1 = l1, n2 = l2, t = ans;
//        int sum=0;
//        while(n1 != null || n2 != null) {
//        	sum /= 10; //进位记录
//        	if(n1 != null) {
//        		sum+=n1.val;
//        		n1 = n1.next;
//        	}
//        	if(n2!= null) {
//        		sum+=n2.val;
//        		n2=n2.next;
//        	}
//        	ans.next = new ListNode(sum % 10);
//        	ans = ans.next;
//        }
//        if(sum / 10 != 0) {
//        	ans.next = new ListNode(sum/10);
//        }
//        return t.next;
//    }
	
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode ans = new ListNode(0);
//		ListNode n1 =l1, n2 = l2,  t = ans;
//		int sum=0;
//		while(n1 != null || n2 != null) {
//			sum /= 10; //recieve jinwei
//			if(n1 != null) {
//				sum += n1.val;
//				n1 = n1.next;
//			}
//			if(n2 != null) {
//				sum += n2.val;
//				n2 = n2.next;
//			}
//			ans.next = new ListNode(sum%10);
//			ans = ans.next;
//		}
//		if(sum/10!= 0) ans.next = new ListNode(1);
//		
//		return t.next;
//	}


	// public class ListNode {
	//      int val;
	//      ListNode next;
	//      ListNode(int x) { val = x; }
	// }

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if(l1.val==0 && l1.next==null) return l2;
		if(l2.val==0 && l2.next==null) return l1;

		ListNode p = new ListNode(0);
		ListNode ansList = p;
		int sum=0;
		while(l1!=null || l2!=null){
			sum/=10;
			if(l1 != null){
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2 != null){
				sum+=l2.val;
				l2=l2.next;
			}
			p.next = new ListNode(sum%10);
			p = p.next;
		}
		if(sum>=10) p.next = new ListNode(1);

		return ansList.next;
	}


}

/* S2 Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/