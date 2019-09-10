package leetcode;

public class _002_AddTwoNumbers {
	
//	Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p=l1, q=l2, r=head;
		
		int flag = 0;
		while (p != null || q != null) {
			int t = 0;
			if (p == null) { t = q.val + flag; }
			else if (q==null) { t = p.val + flag ; }
			else { t = p.val + q.val + flag; }
			if (t > 9) { flag = 1; t = t-10; }
			else { flag = 0; }
			ListNode temp =  new ListNode(t);
			r.next = temp;
			r = r.next;
			if (p!= null) { p = p.next; }
			if (q!= null) { q = q.next; }
		}
		if (flag == 1) {
			ListNode temp =  new ListNode(1);
			r.next = temp;
		}
		return head.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=342, b=465;
		ListNode x = new ListNode(0), y = new ListNode(0);
		ListNode p = x, q = y;
		while (a != 0) {
			ListNode t = new ListNode(a%10);
			a = a/10;
			while (p.next!=null) {
				p = p.next;
			}
			p.next = t;
		}
		while (b != 0) {
			ListNode t = new ListNode(b%10);
			b = b/10;
			while (q.next!=null) {
				q = q.next;
			}
			q.next = t;
		}
		p = x.next;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;			
		}
		System.out.println();
		p = y.next;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;			
		}
		System.out.println();
		ListNode head = addTwoNumbers(x.next, y.next);
		ListNode n = head;
		while (n != null) {
			System.out.print(n.val);
			n = n.next;
		}
	}

}
