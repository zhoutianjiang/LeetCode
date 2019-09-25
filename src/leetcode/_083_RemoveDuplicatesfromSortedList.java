package leetcode;

public class _083_RemoveDuplicatesfromSortedList {

	//	Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode (int x) { val = x; }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p = head;
		while (p.next != null) {
			if (p.val == p.next.val) {
				p.next = p.next.next;
				continue;
			}
			p = p.next;
		}
		return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_083_RemoveDuplicatesfromSortedList solution = new _083_RemoveDuplicatesfromSortedList();
		ListNode head = solution.new ListNode(1);
		head.next = solution.new ListNode(1);
		head.next.next = solution.new ListNode(2);
		head.next.next.next = solution.new ListNode(2);
		head.next.next.next.next = solution.new ListNode(3);
		head = solution.deleteDuplicates(head);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
