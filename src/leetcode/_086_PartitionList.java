package leetcode;

public class _086_PartitionList {
	
	//	Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode (int x) { val = x; }
	}
	
	public ListNode partition(ListNode head, int x) {
		
		ListNode small = new ListNode(0);
		ListNode big = new ListNode(0);
		ListNode p = small, q = big;
		
		while (head != null) {
			if (head.val < x) {
				p.next = new ListNode(head.val);
				p = p.next;
			}
			else {
				q.next = new ListNode(head.val);
				q = q.next;
			}
			head = head.next;
		}
		
		p.next = big.next;
		
		return small.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_086_PartitionList solution = new _086_PartitionList();
		ListNode head = solution.new ListNode(1);
		head.next = solution.new ListNode(4);
		head.next.next = solution.new ListNode(3);
		head.next.next.next = solution.new ListNode(2);
		head.next.next.next.next = solution.new ListNode(5);
		head.next.next.next.next.next = solution.new ListNode(2);
		head = solution.partition(head, 3);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
