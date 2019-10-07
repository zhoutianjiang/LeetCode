package leetcode;

public class _100_SameTree {

	//	Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        
		if (p == null && q == null) {
			return true;
		}
		
		if ((p != null && q == null) || (p == null && q != null)) {
			return false;
		}
		
		if (p.val != q.val) {
			return false;
		}
		
		if (!isSameTree(p.left, q.left)) {
			return false;
		}
		
		if (!isSameTree(p.right, q.right)) {
			return false;
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_100_SameTree solution = new _100_SameTree();
		TreeNode p = solution.new TreeNode(1);
		p.left = solution.new TreeNode(2);
		p.right = solution.new TreeNode(3);
		
		TreeNode q = solution.new TreeNode(1);
		q.left = solution.new TreeNode(2);
		q.right = solution.new TreeNode(2);
		
		System.out.println(solution.isSameTree(p, q));
	}

}
