package leetcode;

public class _024_SwapNodesinPairs {
	
	//Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode swapPairs(ListNode head) {
        
		ListNode p = head;
		ListNode list = new ListNode(0);
		ListNode r = list;
		while (p != null && p.next != null) {
			r.next = new ListNode(p.next.val);
			r.next.next = new ListNode(p.val);
			p = p.next.next;
			r = r.next.next;
		}
		if (p != null) {
			r.next = new ListNode(p.val);
		}
		return list.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode p = head;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
		System.out.println();
		head = swapPairs(head);
		p = head;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
		
	}
}
