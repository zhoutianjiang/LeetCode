package leetcode;

public class _092_ReverseLinkedListII {
	
	//	Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	 }
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
        
		if (m == n || n - m == 1) {
			return head;
		}
		ListNode new_head = new ListNode(0);
		new_head.next = head;
		ListNode p = new_head, left = null, right = null;
		
		for (int i = 0; i <= n; i++) {
			if (i < m - 1) {
				p = p.next;
				continue;
			}
			if (i == m - 1) {
				left = p;
				p = p.next;
				continue;
			}
			if (i == m) {
				right = p;
				p = p.next;
				continue;
			}
			int temp = p.val;
			p = p.next;
			ListNode leftnext = left.next;
			left.next = new ListNode(temp);
			left.next.next = leftnext;
			right.next = p;
			
		}
		
		return new_head.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_092_ReverseLinkedListII solution = new _092_ReverseLinkedListII();
		ListNode head = solution.new ListNode(0);
		ListNode p = head;
		int[] nums = {3,5};
		for (int i = 0; i < nums.length; i++) {
			p.next = solution.new ListNode(nums[i]);
			p = p.next;
		}
		head = solution.reverseBetween(head.next, 1, 2);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
		
	}

}
