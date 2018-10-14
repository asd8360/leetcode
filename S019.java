package leetcode;

public class S019 {
	// public ListNode removeNthFromEnd(ListNode head, int n) {
 //        int length = 0;
 //        ListNode ls = head;
 //        while(ls != null){
 //        	ls = ls.next;
 //        	length++;
 //        }
 //        ls = head;
 //        if(n == length) return head.next;
 //        while(length - n > 1){
 //        	ls = ls.next;
 //        	length--;
 //        }//找到被删除的节点前一个节点ls
 //        //如果ls是头，尾
 //        if(n == 1) {
 //        	ls.next = null;
 //        	return head;
 //        }
 //        ls.next = ls.next.next;
 //        return head;  
 //    }
	public ListNode removeNthFromEnd(ListNode head, int n) {
		//双指针，两个指针相差n个单位 后面指针到末端，前面指针下一个数被删除
		ListNode left = head, right = head;
		while(n > 0){
			right = right.next;
			n--;
		}
		if(right == null) return head.next;
		while(right.next != null){
			right = right.next;
			left = left.next;
		}
		left.next = left.next.next;
		return head;
	}

    
  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

    public static void main(String[] args) {
    	
    }
}

/* S19 Remove Nth Node From End of List

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

*/