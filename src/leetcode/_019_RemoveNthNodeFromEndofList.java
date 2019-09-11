package leetcode;

public class _019_RemoveNthNodeFromEndofList {

	//Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        
		ListNode p = head;
		int num = 0;
		while (p != null) {
			num++;
			p = p.next;
		}
		
		// specially deal
		if (num == n) {
			return head.next;
		}
		
		p = head;
		
		// find the N-1th Node
		for (int i = 0; i < num - n - 1; i++) {
			p = p.next;
		}
		
		p.next = p.next.next;
		
		return head;
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;
		head = removeNthFromEnd(head, 3);
		ListNode p = head;
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
		
	} 

}
