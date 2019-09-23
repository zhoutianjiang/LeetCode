package leetcode;

public class _063_UniquePathsII {

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
		if (obstacleGrid[0][0] == 1) {
			return 0;
		}
		
		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		
		//	边界处理
		int flag = 1;
		for (int i = 1; i < m; i++) {
			if (obstacleGrid[i][0] == 1) {
				flag = 0;
			}
			obstacleGrid[i][0] = flag;
		}
		//	按行处理了0,0 按列需跳过
		flag = 1;
		for (int i = 1; i < n; i++) {
			if (obstacleGrid[0][i] == 1) {
				flag = 0;
			}
			obstacleGrid[0][i] = flag; 
		}
		
		//	动态规划
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = 0; 
				}
				else {
					obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
				}
			}
		}
		
		return obstacleGrid[m-1][n-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] obstacleGrid = {{0,0,0},
				  {0,1,0},
				  {0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

}
