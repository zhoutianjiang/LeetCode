package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _095_UniqueBinarySearchTreesII {

	//	Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<TreeNode> generateTrees(int n) {
		
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (n == 0) {
			return list;
		}
		return helper(1, n);
    }
	
	public List<TreeNode> helper(int start, int end) {
		
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (start > end) {
			list.add(null);
			return list;
		}
		
		if (start == end) {
			TreeNode tree = new TreeNode(start);
			list.add(tree);
			return list;
		}
		
		for (int i = start; i <= end; i++) {
			List<TreeNode> leftTrees = helper(start, i - 1);
			List<TreeNode> rightTrees = helper(i + 1, end);
			for (TreeNode leftTree : leftTrees) {
				for (TreeNode rightTree : rightTrees) {
					TreeNode root = new TreeNode(i);
					root.left = leftTree;
					root.right = rightTree;
					list.add(root);
				}
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_095_UniqueBinarySearchTreesII solution = new _095_UniqueBinarySearchTreesII();
		System.out.println(solution.generateTrees(3));
	}

}
