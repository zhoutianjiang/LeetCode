package leetcode;

public class _021_MergeTwoSortedLists {
	
	
	//Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
        ListNode head, p = l1, q = l2;
        head = new ListNode(0);
        ListNode r = head;
//        while (p != null || q != null) {
//        	int t = Integer.MIN_VALUE;
//        	if (p == null) {
//				t = q.val;
//				q = q.next;
//			}
//        	else if (q == null) {
//				t = p.val;
//				p = p.next;
//			}
//			else if (p.val < q.val) {
//				t = p.val;
//				p = p.next;
//			}
//        	else {
//				t = q.val;
//				q = q.next;
//			}
//			r.next = new ListNode(t);
//			r = r.next;
//		}
        while (p != null && q != null) {
			if (p.val < q.val) {
				r.next = p;
				p = p.next;
			}
			else {
				r.next = q;
				q = q.next;
			}
			r = r.next;
		}
        r.next = p != null ? p : q;
		return head.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode head = mergeTwoLists(l1, l2);
		ListNode p = head;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
	}

}
