package DP;

public class Solution_63_unique_paths_ii {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //initialize dp list
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        if(obstacleGrid[0][1]==0){
            dp[0][1]=1;
        }else{
            dp[0][1]=0;
        }
        if(obstacleGrid[1][0]==0){
            dp[1][0]=1;
        }else{
            dp[1][0]=0;
        }

        //first row
        for(int j = 0; j<n; j++){
            if(obstacleGrid[0][j]==0){
                dp[0][j] = dp[0][j-1];
            }else {
                dp[0][j] = 0;
            }
        }

        //first colomn
        for(int i = 1; i<m; i++){
            if(obstacleGrid[i][0]==0){
                dp[i][0] = dp[i-1][0];
            }else {
                dp[i][0] = 0;
            }
        }


        return dp[m-1][n-1];
    }
}
