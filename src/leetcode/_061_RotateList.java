package leetcode;

public class _061_RotateList {
	
	//Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode rotateRight(ListNode head, int k) {

		// one
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p = head;
		int n = 1;
		while (p.next != null) {
			n++;
			p = p.next;
		}
		
		//	���ɻ�
		p.next = head;
		
		ListNode r = head;
		
		for (int i = 0; i < n - k % n - 1; i++) {
			r = r.next;
		}
		
		ListNode new_head = r.next;
		r.next = null;
		return new_head;
		
// two
//		if (head == null || head.next == null) {
//			return head;
//		}
//		
//		
//		int t = 0;
//		ListNode p = head;
//		while (p != null) {
//			t++;
//			p = p.next;
//		}
//		
//		k = k % t;
//		
//		if (k == 0) {
//			return head;
//		}
//
//		//	�ҵ��ϵ�
//		k = t - k;
//		p = head;
//		for (int i = 0; i < k-1; i++) {
//			p = p.next;
//		}
//		ListNode last = p.next;
//		p.next = null;
//		//	�ҵ�head��β�ڵ�
//		p = last;
//		while (p.next != null) {
//			p = p.next;
//		}
//		//	��β����
//		p.next = head;
//		head = last;
//		
//		return head;
		
// three
//      if (k == 0) {
//			return head;
//		}
		
//		if (head == null || head.next == null) {
//			return head;
//		}
     
//      int t = 0;
//		ListNode p = head;
//		while (p != null) {
//			t++;
//			p = p.next;
//		}
     
//      k = k % t;
		
//		for (int i = 0; i < k; i++) {
//			p = head;
//			ListNode last = null;
//			while (p.next != null) {
//				if (p.next.next == null) {
//					last = new ListNode(p.next.val);
//					p.next = null;
//					break;
//				}
//				p = p.next;
//			}
//			last.next = head;
//			head = last;
//		}
		
//		return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head = rotateRight(head, 0);
		ListNode p = head;
		while (p!=null) {
			System.out.print(p.val);
			p = p.next;
		}
		
	}

}
