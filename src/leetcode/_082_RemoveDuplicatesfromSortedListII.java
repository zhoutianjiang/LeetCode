package leetcode;

//import java.util.HashSet;
//import java.util.Set;

public class _082_RemoveDuplicatesfromSortedListII {

	//	Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 
	public ListNode deleteDuplicates(ListNode head) {
		
		//	µÝ¹é
//		if (head == null) {
//			return head;
//		}
//		
//		if (head.next != null && head.val == head.next.val) {
//			while (head != null && head.next != null && head.val == head.next.val) {
//				head = head.next;
//			}
//			return deleteDuplicates(head.next);
//		}
//		else {
//			head.next = deleteDuplicates(head.next);
//		}
//		
//		return head;
		
		
		//	·ÇµÝ¹é
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode slow = res;
		ListNode fast = res.next;
		
		while (fast != null) {
			while (fast.next != null && fast.val == fast.next.val) {
				fast = fast.next;
			}
			if (slow.next == fast) {
				slow = slow.next;
			}
			else {
				slow.next = fast.next;
			}
			fast = fast.next;
		}
		
		return res.next;
		
		
		
//		ListNode p = head;
//		if (p == null || p.next == null) {
//			return head;
//		}
//		
//		Set<Integer> set = new HashSet<Integer>();
//		while (p.next != null) {
//			if (p.val == p.next.val) {
//				set.add(p.val);
//			}
//			p = p.next;
//		}
//		
//		p = head;
//		while (p.next != null) {
//			if (set.contains(p.next.val)) {
//				p.next = p.next.next;
//				continue;
//			}
//			p = p.next;
//		}
//		
//		if (set.contains(head.val)) {
//			return head.next;
//		}
//		else {
//			return head;
//		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_082_RemoveDuplicatesfromSortedListII solution = new _082_RemoveDuplicatesfromSortedListII();
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(3);
		ListNode p = solution.deleteDuplicates(head);
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
	}

}
