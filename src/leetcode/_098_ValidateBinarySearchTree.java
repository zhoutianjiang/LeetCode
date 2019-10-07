package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _098_ValidateBinarySearchTree {

	//	Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isValidBST(TreeNode root) {
		
		List<Integer> list = new ArrayList<Integer>();
		helper(list, root);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) >= list.get(i + 1)) {
				return false;
			}
		}
		return true;
    }
	
	public void helper(List<Integer> list, TreeNode root) {
		
		if (root == null) {
			return;
		}
		
		helper(list, root.left);
		list.add(root.val);
		helper(list, root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_098_ValidateBinarySearchTree solution = new _098_ValidateBinarySearchTree();
		TreeNode root = solution.new TreeNode(2);
		root.left = solution.new TreeNode(1);
		root.right = solution.new TreeNode(3);
		System.out.println(solution.isValidBST(root));
	}

}
