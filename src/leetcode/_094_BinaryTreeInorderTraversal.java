package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _094_BinaryTreeInorderTraversal {

	//	Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
        
		List<Integer> list = new ArrayList<Integer>();
		traversal(list, root);
        return list;
    }
	
	public void traversal(List<Integer> list, TreeNode root) {
		
		if (root == null) {
			return;
		}
		traversal(list, root.left);
		list.add(root.val);
		traversal(list, root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_094_BinaryTreeInorderTraversal solution = new _094_BinaryTreeInorderTraversal();
		TreeNode head = solution.new TreeNode(1);
		head.left = null;
		head.right = solution.new TreeNode(2);
		head.right.left = solution.new TreeNode(3);
		System.out.println(solution.inorderTraversal(head));
	}

}
