package leetcode;

public class _096_UniqueBinarySearchTrees {

	public int numTrees(int n) {
        
		int[] G = new int[n + 1];
		G[0] = 1;
		G[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				G[i] += G[j - 1] * G[i - j];
			}
		}
		
		return G[n];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_096_UniqueBinarySearchTrees solution = new _096_UniqueBinarySearchTrees();
		System.out.println(solution.numTrees(5));
	}

}
